import hibernate.bean.LibraryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by samik on 9.4.16.
 */

@Configuration
public class AppConfig {

    @Bean
    public LibraryBean libraryBean() {
        return new LibraryBean();
    }

}
