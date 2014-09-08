package kachuelitos.searchblog;

public interface BlogSearcher {
    public BlogQueryResult getRelevantBlogs(BlogQueryParameter param)
            throws BlogSearcherException;
}