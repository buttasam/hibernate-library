package test.dao;


import hibernate.dao.BookDAO;
import junit.framework.TestCase;
import org.junit.Test;

public class BookDAOTest extends TestCase {

    private BookDAO bookDAO;

    protected void setUp() {
        bookDAO = new BookDAO();
    }

    @Test
    public void testFindBy() {

        String title = bookDAO.findById("1").getTitle();

        assertEquals(title, "Java");
    }

}
