package im.nt.Springboot.Dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "author")
@NoArgsConstructor

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "id")
    private Integer id;

    @Column(name = "lastname")
    private String LastName;

    @Column(name = "firstName")
    private String FirstName;

    @Column(name = "birthdate")
    private Date BirthDate;

    public Author(Integer id, String lastName, String firstName, Date birthDate) {
        this.id = id;
        LastName = lastName;
        FirstName = firstName;
        BirthDate = birthDate;
    }
}
