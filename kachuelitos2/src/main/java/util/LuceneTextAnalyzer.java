package util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;

import ci.tagcloud.TagCloud;
import ci.tagcloud.TagCloudElement;
import ci.tagcloud.impl.HTMLTagCloudDecorator;
import ci.tagcloud.impl.LinearFontSizeComputationStrategy;
import ci.tagcloud.impl.TagCloudElementImpl;
import ci.tagcloud.impl.TagCloudImpl;
import ci.textanalysis.InverseDocFreqEstimator;
import ci.textanalysis.Tag;
import ci.textanalysis.TagCache;
import ci.textanalysis.TagMagnitude;
import ci.textanalysis.TagMagnitudeVector;
import ci.textanalysis.TextAnalyzer;
import ci.textanalysis.lucene.impl.PhrasesCacheImpl;
import ci.textanalysis.lucene.impl.SynonymPhraseStopWordAnalyzer;
import ci.textanalysis.lucene.impl.SynonymsCacheImpl;
import ci.textanalysis.termvector.impl.TagMagnitudeImpl;
import ci.textanalysis.termvector.impl.TagMagnitudeVectorImpl;

;

public class LuceneTextAnalyzer implements TextAnalyzer {
	private TagCache tagCache;
	private InverseDocFreqEstimator inverseDocFreqEstimator;

	public LuceneTextAnalyzer(TagCache tagCache,
			InverseDocFreqEstimator inverseDocFreqEstimator) {
		this.tagCache = tagCache;
		this.inverseDocFreqEstimator = inverseDocFreqEstimator;
	}

	public TagMagnitudeVector createTagMagnitudeVector(String text)
			throws IOException {
		List<Tag> tagList = this.analyzeText(text);
		Map<Tag, Integer> tagFreqMap = computeTermFrequency(tagList);
		return applyIDF(tagFreqMap);
	}

	public List<Tag> analyzeText(String text) throws IOException {
		Reader reader = new StringReader(text);
		Analyzer analyzer = getAnalyzer();
		List<Tag> tags = new ArrayList<Tag>();
		TokenStream tokenStream = analyzer.tokenStream(null, reader);
		Token token = tokenStream.next();
		while (token != null) {
			tags.add(getTag(token.termText()));
			token = tokenStream.next();
		}
		return tags;
	}

	public Tag getTag(String text) throws IOException {
		return this.tagCache.getTag(text);
	}

	public Analyzer getAnalyzer() throws IOException {
		return new SynonymPhraseStopWordAnalyzer(new SynonymsCacheImpl(),
				new PhrasesCacheImpl());
	}

	public Map<Tag, Integer> computeTermFrequency(List<Tag> tagList) {
		Map<Tag, Integer> tagFreqMap = new HashMap<Tag, Integer>();
		for (Tag tag : tagList) {
			Integer count = tagFreqMap.get(tag);
			if (count == null) {
				count = 1;
			} else {
				count = new Integer(count.intValue() + 1);
			}
			tagFreqMap.put(tag, count);
		}
		// System.out.println(tagFreqMap);
		return tagFreqMap;
	}

	public TagMagnitudeVector applyIDF(Map<Tag, Integer> tagFreqMap) {
		List<TagMagnitude> tagMagnitudes = new ArrayList<TagMagnitude>();
		for (Tag tag : tagFreqMap.keySet()) {
			double idf = this.inverseDocFreqEstimator
					.estimateInverseDocFreq(tag);
			double tf = tagFreqMap.get(tag);
			double wt = tf * idf;
			tagMagnitudes.add(new TagMagnitudeImpl(tag, wt));
		}
		return new TagMagnitudeVectorImpl(tagMagnitudes);
	}

	public TagCloud createTagCloud(TagMagnitudeVector tmVector) {
		List<TagCloudElement> elements = new ArrayList<TagCloudElement>();
		for (TagMagnitude tm : tmVector.getTagMagnitudes()) {
			TagCloudElement element = new TagCloudElementImpl(
					tm.getDisplayText(), tm.getMagnitude());
			elements.add(element);
		}
		return new TagCloudImpl(elements,
				new LinearFontSizeComputationStrategy(3, "font-size: "));
	}

	public String visualizeTagCloud(TagCloud tagCloud) {
		HTMLTagCloudDecorator decorator = new HTMLTagCloudDecorator();
		String html = decorator.decorateTagCloud(tagCloud);
		System.out.println(html);
		return html;
	}

	public void displayTextAnalysis(String text) throws IOException {
		List<Tag> tags = analyzeText(text);
		for (Tag tag : tags) {
			System.out.print(tag + " ");
		}
	}
}