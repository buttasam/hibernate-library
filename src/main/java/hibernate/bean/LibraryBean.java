package hibernate.bean;


import hibernate.dao.AuthorDAO;
import hibernate.dao.BookDAO;
import hibernate.entity.BookEntity;

import java.util.List;


public class LibraryBean {

    public AuthorDAO authorDAO;
    public BookDAO bookDAO;

    public LibraryBean() {
        authorDAO = new AuthorDAO();
        bookDAO = new BookDAO();
    }

    public void addNewBook(String title) {
        bookDAO.persist(new BookEntity(title));
    }

    public void printAllBooks() {
        List<BookEntity> books = bookDAO.findAll();

        for (BookEntity book : books) {
            System.out.println(book);
        }

    }

}
