package im.nt.Springboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookDto {

    private Integer id;

    private String NameUz;

    private String NameRu;

    private Double Cost;

    private String Genre;

    public BookDto(String nameUz, String nameRu, Double cost, String Genre) {
        NameUz = nameUz;
        NameRu = nameRu;
        Cost = cost;
        this.Genre = Genre;
    }

    public String toString(){
        return String.format("%d-kitob: \nNomiUz-%s \nNomiUz-%s \n Narxi - %.2f \nJanri - %s\n", id, NameUz, NameRu, Cost, Genre);
    }

}
