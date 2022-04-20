package im.nt.Springboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseDto<T> {
    private boolean success;
    private Integer code;
    private String massage;
    private T data;
}
