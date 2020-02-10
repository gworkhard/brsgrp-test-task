package models;

import java.util.List;

public class SearchResult {

    private Object facets;

    private List<ResultItem> results;

    public SearchResult() {
    }

    public SearchResult(Object facets, List<ResultItem> results) {
        this.facets = facets;
        this.results = results;
    }

    public Object getFacets() {
        return facets;
    }

    public void setFacets(Object facets) {
        this.facets = facets;
    }

    public List<ResultItem> getResults() {
        return results;
    }

    public void setResults(List<ResultItem> results) {
        this.results = results;
    }
}
