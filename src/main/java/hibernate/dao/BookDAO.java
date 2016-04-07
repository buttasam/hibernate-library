package hibernate.dao;

import hibernate.entity.BookEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.awt.print.Book;
import java.util.List;


public class BookDAO extends AbstractDAO implements InterfaceDAO<BookEntity>{


    public void persist(BookEntity entity) {
        openSession();
        session.persist(entity);
        closeSession();
    }

    public void update(BookEntity entity) {

    }

    public BookEntity findById(String id) {
        openSession();
        BookEntity entity = (BookEntity) session.get(BookEntity.class,Integer.parseInt(id));
        closeSession();
        return entity;
    }

    public void delete(BookEntity entity) {
        openSession();
        closeSession();
    }

    public List<BookEntity> findAll() {
        openSession();
        List<BookEntity> result = session.createQuery("from BookEntity").list();
        closeSession();

        return result;
    }

    public void deleteAll() {

    }
}
