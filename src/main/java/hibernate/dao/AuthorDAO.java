package hibernate.dao;

import hibernate.entity.AuthorEntity;
import hibernate.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorDAO extends AbstractDAO implements InterfaceDAO<AuthorEntity> {

    public void persist(AuthorEntity entity) {
        openSession();
        session.persist(entity);
        closeSession();
    }

    public void update(AuthorEntity entity) {

    }

    public AuthorEntity findById(String id) {
        return null;
    }

    public void delete(AuthorEntity entity) {

    }

    public List<AuthorEntity> findAll() {
        openSession();
        List<AuthorEntity> result = session.createQuery("from AuthorEntity").list();
        closeSession();

        return result;
    }

    public void deleteAll() {
    }
}
