package hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class AbstractDAO {

    protected Session session;
    protected Transaction currentTransaction;

    public AbstractDAO() {
    }

    protected Session openSession() {
        session = getSessionFactory().openSession();
        currentTransaction = session.beginTransaction();
        return session;
    }

    protected void closeSession() {
        currentTransaction.commit();
        session.close();
    }

    protected static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

}
