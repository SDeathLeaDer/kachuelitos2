package kachuelitos.searchblog;

import java.util.List;

public interface BlogQueryResult {
    public Integer getQueryCount();
    public List<RetrievedBlogEntry> getRelevantBlogs();
}