package in.kodecamp;
public class Product {
    private String url;
    private String name;
   
    // This will be used by template engine
    Product() { }
   
    // This can be used by developer
    Product(String url, String name) {
      this.url = url;
      this.name = name;
    }
    
    public String getUrl() {
      return this.url;
    }
    
    void setUrl(String newUrl) {
      this.url = newUrl;
    }
    
    void setName(String newName) {
      this.name = newName;
    }
    
    public String getName() {
      return this.name;
    }

  }
