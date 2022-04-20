package im.nt.Springboot.Repository;

import im.nt.Springboot.Dao.Users;
import im.nt.Springboot.Dto.ResponseDto;
import im.nt.Springboot.Dto.UserDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
}
