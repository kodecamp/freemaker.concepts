package in.kodecamp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import in.kodecamp.ui.Page;

/**
 * Hello world!
 *
 */
public class App {
  private static Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
  static {
    cfg.setClassForTemplateLoading(App.class, "/templates");
    cfg.setDefaultEncoding("UTF-8");
    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
    cfg.setLogTemplateExceptions(false);
    cfg.setWrapUncheckedExceptions(true);
    cfg.setFallbackOnNullLoopVariable(false);
  }

  public static void main(String[] args) throws IOException, TemplateException {
    System.out.println("Hello World!");
    String templateName = "productlist.html";
    Template welcomeTemplate = cfg.getTemplate("/views/" + templateName + ".ftl");
    System.out.println(welcomeTemplate);
    Page model = createModel();
    OutputStreamWriter htmlWriter = new OutputStreamWriter(
        new FileOutputStream("./src/main/resources/templates/views/" + templateName));
//    OutputStreamWriter consoleWriter = new OutputStreamWriter(System.out);
    welcomeTemplate.process(model, htmlWriter);
  }

  /**
   * 
   * @return
   */
  private static Page createModel() {
    // Create the root hash. We use a Map here, but it could be a JavaBean too.
    Page page = new Page("Product List")
        .addHeaderValue("title", "Welcome ...")
        .addHeaderValue("links", createLinks())
        .addPageValue("products",createProducts());
    // and put it into the root
    return page;

  }

  /**
   * 
   * @return
   */
  private static Map<String, String> createLinks() {
    Map<String, String> links = new LinkedHashMap<>();
    links.put("Link 1", "http://domain.com/link1");
    links.put("Link 2", "http://domain.com/link2");
    links.put("Link 3", "http://domain.com/link3");
    return links;

  }

  private static List<Product> createProducts() {
    List<Product> products = new ArrayList<>();

    Product p1 = new Product();
    p1.setUrl("products/greenmouse.html");
    p1.setName("Green Mouse");
    p1.setPrice(100);

    Product p2 = new Product();
    p2.setUrl("products/whitemouse.html");
    p2.setName("White Mouse");
    p2.setPrice(200);

    Product p3 = new Product();
    p3.setUrl("products/whitekeyboard.html");
    p3.setName("White Keyboard");

    products.add(p1);
    products.add(p2);
    products.add(p3);

    return products;
  }

}