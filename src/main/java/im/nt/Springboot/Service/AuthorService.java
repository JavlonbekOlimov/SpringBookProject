package im.nt.Springboot.Service;

import im.nt.Springboot.Dao.Author;
import im.nt.Springboot.Dto.AuthorDto;
import im.nt.Springboot.Dto.ResponseDto;
import im.nt.Springboot.Repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

}
