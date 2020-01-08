package in.kodecamp.ui;

import java.util.HashMap;
import java.util.Map;

public class Page {
  private String title;
  private Map<String, Object> header;
  private Map<String, Object> footer;

  public Page(final String title, Map<String, Object> header, Map<String, Object> footer) {
     this.title = title;
     this.header = header;
     this.footer = footer;
  }
  
  public Page() {
    this("", new HashMap<>(), new HashMap<>());
  }
  
  public Page withTitle(final String newTitle) {
    this.title = newTitle;
    return this;
  }
  
  public Page withHeader(final Map<String,Object> newHeader) {
    this.header = newHeader;
    return this;
  }

  public Page withFooter(final Map<String,Object> newFooter) {
    this.footer = newFooter;
    return this;
  }
  
  public Page appendHeaderValue(final String key, final Object value) {
    this.header.put(key, value);
    return this;
  }

  public Page appendFooterValue(final String key, final Object value) {
    this.footer.put(key, value);
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Map<String, Object> getHeader() {
    return header;
  }

  public Map<String, Object> getFooter() {
    return footer;
  }
  
  

}
