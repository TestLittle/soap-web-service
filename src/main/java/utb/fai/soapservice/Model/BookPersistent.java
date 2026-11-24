package utb.fai.soapservice.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Entita knihy, ktera je ukladana do databaze
 */
@Entity
@Table(name = "BookPersistent")
public class BookPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JsonIgnore
    private AuthorPersistent author;

    public BookPersistent(/*Long id,*/ String title, AuthorPersistent author){
        //this.id = id;
        this.title = title;
        this.author = author;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorPersistent getAuthor() {
        return author;
    }

    public void setAuthor(AuthorPersistent author) {
        this.author = author;
    }
}
