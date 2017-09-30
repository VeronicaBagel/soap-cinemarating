package by.bsu.soap;


import by.bsu.soap.enity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.ws.transport.http.servlet.WSServletContextListener;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = "by.bsu.soap")
public class WebConfig extends WebMvcConfigurerAdapter {

  @Autowired
  private Environment env;

  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }

  @Bean
  @Autowired
  public LocalSessionFactoryBean createSessionFactory(DataSource source){
    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
    sessionFactory.setDataSource(source);
    sessionFactory.setHibernateProperties(hibernateProperties());
    sessionFactory.setAnnotatedClasses(User.class);
    return sessionFactory;
  }

  @Bean
  public DataSource getDataSource(){
    DriverManagerDataSource source = new DriverManagerDataSource();
    source.setDriverClassName(env.getProperty("db.driver"));
    source.setUrl(env.getProperty("db.url"));
    source.setUsername(env.getProperty("db.username"));
    source.setPassword(env.getProperty("db.password"));
    return source;
  }

  Properties hibernateProperties() {
    return new Properties() {
      {
        setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
      }
    };
  }


}
