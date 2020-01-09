package in.kodecamp.ui;

import java.util.HashMap;
import java.util.Map;

public class Page {
  private String title;
  private Map<String, Object> headerValues;
  private Map<String, Object> footerValues;
  private Map<String,Object> pageValues;

  public Page(final String title, Map<String, Object> header, Map<String, Object> footer, Map<String,Object> values) {
     this.title = title;
     this.headerValues = header;
     this.footerValues = footer;
     this.pageValues = values;
  }
  
  public Page() {
    this("", new HashMap<>(), new HashMap<>(), new HashMap<>());
  }
  
  public Page withTitle(final String newTitle) {
    this.title = newTitle;
    return this;
  }
  
  public Page withHeader(final Map<String,Object> newHeader) {
    this.headerValues = newHeader;
    return this;
  }

  public Page withFooter(final Map<String,Object> newFooter) {
    this.footerValues = newFooter;
    return this;
  }
  
  public Page addHeaderValue(final String key, final Object value) {
    this.headerValues.put(key, value);
    return this;
  }

  public Page appendFooterValue(final String key, final Object value) {
    this.footerValues.put(key, value);
    return this;
  }
  
  public Page addPageValue(String key, final Object value) {
    this.pageValues.put(key, value);
    return this;
  }


  public String getTitle() {
    return title;
  }

  public Map<String, Object> getHeaderValues() {
    return headerValues;
  }

  public Map<String, Object> getFooterValues() {
    return footerValues;
  }
  
  public Map<String, Object> getPageValues() {
    return this.pageValues;
  }
  
  

}
