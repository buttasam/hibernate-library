import hibernate.bean.LibraryBean;
import hibernate.dao.BookDAO;
import hibernate.entity.AuthorEntity;
import hibernate.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

    public static void main(final String[] args) throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        LibraryBean libraryBean = ctx.getBean(LibraryBean.class);
        libraryBean.printAllBooks();

    }
}
