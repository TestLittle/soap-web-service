package utb.fai.soapservice.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Entita autora, ktera je ukladana do databaze
 */
@Entity
@Table(name = "AuthorPersistent")
public class AuthorPersistent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @OneToMany(mappedBy="author", cascade= CascadeType.ALL)
    private List<BookPersistent> books;

    public AuthorPersistent(/*Long id,*/ String name, String surname){
        //this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
