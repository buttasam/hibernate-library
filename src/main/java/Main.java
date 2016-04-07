import hibernate.dao.BookDAO;
import hibernate.entity.BookEntity;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.List;

/**
 * Created by samik on 6.4.16.
 */
public class Main {

    public static void main(final String[] args) throws Exception {
        System.out.println("Test");

        BookDAO dao = new BookDAO();

        BookEntity entity = new BookEntity("Super kniha");

        dao.persist(entity);
    }
}
