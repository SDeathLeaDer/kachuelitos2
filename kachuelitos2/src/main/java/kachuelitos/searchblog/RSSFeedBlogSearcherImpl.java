package kachuelitos.searchblog;

import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;

import kachuelitos.searchblog.BlogQueryParameter;
import kachuelitos.searchblog.BlogSearcherException;
import kachuelitos.searchblog.BlogQueryParameter.QueryParameter;
import kachuelitos.searchblog.BlogSearcherImpl;
import kachuelitos.searchblog.RSSFeedBlogQueryParameterImpl.RSSProviderURL;


public class RSSFeedBlogSearcherImpl extends BlogSearcherImpl { 
    public RSSFeedBlogSearcherImpl() throws BlogSearcherException {
    }

   // http://www.blogdigger.com/rss.jsp?sortby=date&q=collective&si=1&pp=2
    protected HttpMethod  getMethod(BlogQueryParameter param) {
        RSSFeedBlogQueryParameterImpl rssParam = (RSSFeedBlogQueryParameterImpl)param;
        RSSProviderURL rssProvider = rssParam.getRSSProviderURL();
        String url = param.getMethodUrl() + "?q=" +
            urlEncode(param.getParameter(QueryParameter.QUERY))+
            "&" + rssProvider.getFirstKey() + "=" + param.getParameter(QueryParameter.START_INDEX)+
            "&" + rssProvider.getNumKey() +  "=" + param.getParameter(QueryParameter.LIMIT);
        if ("".compareTo(rssProvider.getSortKey())  != 0) {
            String sortBy = "date";
            if (param.getParameter(QueryParameter.SORTBY) != null ) {
                sortBy = param.getParameter(QueryParameter.SORTBY);
            }
            url += "&" + rssProvider.getSortKey() +  "=" + sortBy;
        }
        if ("".compareTo(rssProvider.getFormatKey())  != 0) {
            url += "&" + rssProvider.getFormatKey() + "=rss" ;
        }
        
        System.out.println(url);
        GetMethod method = new GetMethod(url);
        return method;
    }

}