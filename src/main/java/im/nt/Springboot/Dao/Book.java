package im.nt.Springboot.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "book")
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Id
    @GeneratedValue(generator = "book_id_seq")
    @SequenceGenerator(name = "book_id_seq", sequenceName = "book_id_seq", allocationSize = 1)
    @Column(name ="id")
    private Integer id;

    @Column(name ="nameuz")
    private String NameUz;

    @Column(name ="nameru")
    private String NameRu;

    @Column(name ="cost")
    private Double cost;

    @Column(name ="published_day")
    private Date PublishedDate;

    @Column(name ="page_count")
    private Integer PageCount;

    @Column(name ="author_id")
    private Integer AuthorId;

    @Column(name ="genre")
    private String Genre;

    @Column(name ="publisher_id")
    private Integer PublisherId;

    public Book( String nameUz, String nameRu, Double cost) {
        this.NameUz = nameUz;
        this.NameRu = nameRu;
        this.cost = cost;
    }
}
