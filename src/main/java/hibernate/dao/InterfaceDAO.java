package hibernate.dao;


import java.util.List;

public interface InterfaceDAO<T> {

    public void persist(T entity);

    public void update(T entity);

    public T findById(String id);

    public void delete(T entity);

    public List<T> findAll();

    public void deleteAll();
}