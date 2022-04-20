package im.nt.Springboot.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

    private Integer id;

    private String LastName;

    private String FirstName;

    private Integer PhoneNumber;

    private Integer Account;

    public UserDto(Integer id, String lastName, String firstName, Integer phoneNumber, Integer account) {
        this.id = id;
        LastName = lastName;
        FirstName = firstName;
        PhoneNumber = phoneNumber;
        Account = account;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", Account=" + Account +
                '}';
    }
}
