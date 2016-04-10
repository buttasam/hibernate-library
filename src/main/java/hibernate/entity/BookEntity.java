package hibernate.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by samik on 6.4.16.
 */
@Entity
@Table(name = "book")
public class BookEntity {
    private int id;
    private String title;
    private Set<AuthorEntity> authors;

    public BookEntity() {
    }

    public BookEntity(String title) {
        this.title = title;
    }

    public BookEntity(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="book_has_author", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))
    public Set<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorEntity> authors)
    {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntity that = (BookEntity) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "title = '" + title;
    }
}
