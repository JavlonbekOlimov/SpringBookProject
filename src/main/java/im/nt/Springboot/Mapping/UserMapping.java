package im.nt.Springboot.Mapping;

import im.nt.Springboot.Dao.Users;
import im.nt.Springboot.Dto.UserDto;

public class UserMapping {
    public static UserDto toDto(Users users){
        return new UserDto(users.getId(),
                users.getLastName(),
                users.getFirstName(),
                users.getPhoneNumber(),
                users.getAccount());
    }

    public static void setEntity(Users users, UserDto userDto){
        users.setId(userDto.getId());
        users.setLastName(userDto.getLastName());
        users.setFirstName(userDto.getFirstName());
        users.setPhoneNumber(userDto.getPhoneNumber());
        users.setAccount(userDto.getAccount());
    }

    public static Users toEntity(UserDto userDto){
        return new Users(userDto.getId(),
                userDto.getLastName(),
                userDto.getFirstName(),
                userDto.getPhoneNumber(),
                userDto.getAccount());
    }
}
