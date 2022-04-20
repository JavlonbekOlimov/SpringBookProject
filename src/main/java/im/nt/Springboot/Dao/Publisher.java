package im.nt.Springboot.Dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor


public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String Name;

    @Column(name = "adres_id")
    private Integer AdressID;

    public Publisher(Integer id, String name, Integer adressID) {
        this.id = id;
        Name = name;
        AdressID = adressID;
    }
}
