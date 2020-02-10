package models;

import java.util.List;

public class ResultItem {

    private String title;

    private String url;

    private Object displayUrl;

    private String description;

    private List<Object> descriptions;

    private String lastUpdateDate;

    private List<Object> breadCrumbs;

    public ResultItem() {
    }

    public ResultItem(String title, String url, Object displayUrl, String description, List<Object> descriptions, String lastUpdateDate, List<Object> breadCrumbs) {
        this.title = title;
        this.url = url;
        this.displayUrl = displayUrl;
        this.description = description;
        this.descriptions = descriptions;
        this.lastUpdateDate = lastUpdateDate;
        this.breadCrumbs = breadCrumbs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(Object displayUrl) {
        this.displayUrl = displayUrl;
    }

    public List<Object> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Object> descriptions) {
        this.descriptions = descriptions;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public List<Object> getBreadCrumbs() {
        return breadCrumbs;
    }

    public void setBreadCrumbs(List<Object> breadCrumbs) {
        this.breadCrumbs = breadCrumbs;
    }
}
