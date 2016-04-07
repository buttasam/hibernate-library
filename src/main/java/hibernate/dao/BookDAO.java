package hibernate.dao;

import hibernate.entity.BookEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by samik on 7.4.16.
 */
public class BookDAO implements InterfaceDAO<BookEntity>{

    private Session currentSession;
    private Transaction currentTransaction;

    public BookDAO() {
    }

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public void persist(BookEntity entity) {
        openCurrentSessionwithTransaction();
        getCurrentSession().persist(entity);
        closeCurrentSessionwithTransaction();
    }

    public void update(BookEntity entity) {

    }

    public BookEntity findById(int id) {
        openCurrentSessionwithTransaction();
        BookEntity entity = (BookEntity) getCurrentSession().byId(Integer.toString(id));
        closeCurrentSessionwithTransaction();
        return entity;
    }

    public void delete(BookEntity entity) {

    }

    public List<BookEntity> findAll() {
        return null;
    }

    public void deleteAll() {

    }
}
