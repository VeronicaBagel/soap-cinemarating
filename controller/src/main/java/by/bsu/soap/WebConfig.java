package by.bsu.soap;


import com.fasterxml.jackson.databind.ObjectMapper;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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
  public JdbcTemplate getJDBCTemplate(DataSource dataSource){
    JdbcTemplate template = new JdbcTemplate(dataSource);
    return template;
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

  @Bean
  public InternalResourceViewResolver viewResolver(){
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/jsp/");
    resolver.setSuffix(".jsp");
    return resolver;
  }

  /*Properties hibernateProperties() {
    return new Properties() {
      {
        setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
        setProperty("show_sql", "true");
      }
    };
  }*/


}
