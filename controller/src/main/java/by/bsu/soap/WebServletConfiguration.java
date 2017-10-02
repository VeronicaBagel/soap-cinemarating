package by.bsu.soap;


import com.sun.xml.ws.transport.http.servlet.WSServlet;
import com.sun.xml.ws.transport.http.servlet.WSServletContextListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

  public void onStartup(ServletContext ctx) throws ServletException {
    AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
    ctx.addListener(new WSServletContextListener());
    webCtx.setServletContext(ctx);
    webCtx.register(WebConfig.class);

    ServletRegistration.Dynamic servlet = ctx.addServlet("soap", new WSServlet());
    servlet.setLoadOnStartup(0);
    servlet.addMapping("/soap/*");

    ServletRegistration.Dynamic controller = ctx.addServlet("cinemarating", new DispatcherServlet(webCtx));
    controller.setLoadOnStartup(1);
    controller.addMapping("/cinemarating/*");

    controller.setInitParameter("throwExceptionIfNoHandlerFound", "true");
  }
}