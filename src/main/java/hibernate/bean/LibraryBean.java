package hibernate.bean;


import hibernate.dao.AuthorDAO;
import hibernate.dao.BookDAO;
import hibernate.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class LibraryBean {

    @Autowired
    public AuthorDAO authorDAO;

    @Autowired
    public BookDAO bookDAO;


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
