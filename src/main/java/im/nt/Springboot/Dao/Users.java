package im.nt.Springboot.Dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "id")
    private Integer id;

    @Column(name = "lastname")
    @NotBlank(message = "Ismingizni faqat lotin alifbosi harflari bilan ifodalang")
    private String LastName;

    @Column(name = "firstName")
    @NotBlank(message = "Familyangizni faqat lotin alifbosi harflari bilan ifodalang")
    private String FirstName;

    @Column(name = "phonenumber")
    @NotBlank(message = "Telefon raqamingizni (+998 12 1234567) Ko'rinishida kiriting!")
    private Integer PhoneNumber;

    @Column(name = "account")
    @NotBlank(message = "Hisobingizga 100000.0 UZS dan kam mablag' to'ldirishingiz mumkin emas")
    private Integer Account;


    public Users(Integer id, String lastName, String firstName, Integer phoneNumber, Integer account) {
        this.id = id;
        this.LastName = lastName;
        this.FirstName = firstName;
        this.PhoneNumber = phoneNumber;
        this.Account = account;
    }
}
