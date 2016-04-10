import hibernate.bean.LibraryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(final String[] args) throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        LibraryBean libraryBean = ctx.getBean(LibraryBean.class);
        libraryBean.printAllBooks();

    }
}
