package ci.textanalysis.lucene.impl;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.LowerCaseFilter;
import org.apache.lucene.analysis.PorterStemFilter;
import org.apache.lucene.analysis.StopFilter;
import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.standard.StandardTokenizer;

import weps.util.TextFile;

public class PorterStemStopWordAnalyzer extends Analyzer {

    public static String[] stopWords =  {"y","de","el","a","es","ellos","poder","todo","yo", "tu","para","e","entre",
    	"como","que","igual","desde","siguiente","ademas","tampoco","quizas","buena ","ser","una","sentido"};
    
    @Override
    public TokenStream tokenStream(String fieldName, Reader reader) {
        Tokenizer tokenizer = new StandardTokenizer(reader);
        TokenFilter lowerCaseFilter = new LowerCaseFilter(tokenizer);
        TokenFilter stopFilter = new StopFilter(lowerCaseFilter, stopWords);
        TokenFilter stemFilter = new PorterStemFilter(stopFilter);
        return stemFilter;
    }

}
