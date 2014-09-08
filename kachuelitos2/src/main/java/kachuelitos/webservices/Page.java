package kachuelitos.webservices;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {

    private String title;
    private String icon;
    private String link;
    private List<Entries> entries;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<Entries> getEntries() {
		return entries;
	}
	public void setEntries(List<Entries> entries) {
		this.entries = entries;
	}
        
}