package im.nt.Springboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AuthorDto {
    private Integer id;
    private String LastName;
    private String FirstName;
    private Date BirthDate;

    public AuthorDto(String lastName, String firstName, Date birthDate) {
        this.LastName = lastName;
        this.FirstName = firstName;
        this.BirthDate = birthDate;
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "id=" + id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", BirthDate=" + BirthDate +
                '}';
    }
}
