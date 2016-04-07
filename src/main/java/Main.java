import hibernate.dao.BookDAO;
import hibernate.entity.AuthorEntity;
import hibernate.entity.BookEntity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

    public static void main(final String[] args) throws Exception {
        System.out.println("Test");

        BookDAO dao = new BookDAO();

        BookEntity entity = dao.findById("1");
        ArrayList<AuthorEntity> authors = new ArrayList<AuthorEntity>(entity.getAuthors());

        System.out.println(entity.getTitle());

        for (AuthorEntity a : authors) {
            System.out.println(a.getName());
        }

    }
}
