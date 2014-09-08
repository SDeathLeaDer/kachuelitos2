package kachuelitos.searchblog;

import java.util.Collections;

public class NullBlogQueryResultImpl extends BlogQueryResultImpl {
    @SuppressWarnings("unchecked")
    public NullBlogQueryResultImpl() {
        super();
        this.setResults(Collections.EMPTY_LIST);
    }
}