import hibernate.bean.LibraryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("hibernate.dao")
public class AppConfig {

    @Bean
    public LibraryBean libraryBean() {
        return new LibraryBean();
    }

}
