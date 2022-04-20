package im.nt.Springboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PublisherDto {

    private Integer id;

    private String Name;

    private Integer AdressId;

    public PublisherDto(Integer id, String name, Integer adressId) {
        this.id = id;
        Name = name;
        AdressId = adressId;
    }

    @Override
    public String toString() {
        return "PubisherDto{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", AdressId=" + AdressId +
                '}';
    }
}
