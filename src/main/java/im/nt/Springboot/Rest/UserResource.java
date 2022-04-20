package im.nt.Springboot.Rest;

import im.nt.Springboot.Dao.Users;
import im.nt.Springboot.Dto.ResponseDto;
import im.nt.Springboot.Dto.UserDto;
import im.nt.Springboot.Repository.UserRepository;
import im.nt.Springboot.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserResource {

    public final UserService userService;

    @PostMapping("/add")
    public ResponseDto<UserDto> add(@Valid @RequestBody UserDto userDto) {
        return userService.addNew(userDto);
    }
}
