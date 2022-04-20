package im.nt.Springboot.Service;

import im.nt.Springboot.Dao.Users;
import im.nt.Springboot.Dto.ResponseDto;
import im.nt.Springboot.Dto.UserDto;
import im.nt.Springboot.Mapping.UserMapping;
import im.nt.Springboot.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ResponseDto<UserDto> addNew(UserDto userDto){
        try{
            Users users = UserMapping.toEntity(userDto);
            userRepository.save(users);
            return new ResponseDto<>(true, 0,"Data saved!", UserMapping.toDto(users));
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseDto<>(false, -1, "Error", null);
        }
    };
}
