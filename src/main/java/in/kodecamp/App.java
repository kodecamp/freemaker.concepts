package in.kodecamp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

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
    String templateName = "welcome.html";
    Template welcomeTemplate = cfg.getTemplate(templateName);
    System.out.println(welcomeTemplate);
    Map<String,Object> model = createModel();
    OutputStreamWriter htmlWriter = new OutputStreamWriter(
        new FileOutputStream("./src/main/resources/views/"+templateName));
    OutputStreamWriter consoleWriter = new OutputStreamWriter(System.out);
    welcomeTemplate.process(model,htmlWriter) ;
  }

  private static Map<String, Object> createModel() {
    // Create the root hash. We use a Map here, but it could be a JavaBean too.
    Map<String, Object> root = new HashMap<>();

// Put string "user" into the root
    root.put("user", "Big Joe");

// Create the "latestProduct" hash. We use a JavaBean here, but it could be a Map too.
    Product latest = new Product();
    latest.setUrl("products/greenmouse.html");
    latest.setName("green mouse");
// and put it into the root
    root.put("latestProduct", latest);
    return root;
  }
 
}