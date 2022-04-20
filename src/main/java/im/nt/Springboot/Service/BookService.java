 package im.nt.Springboot.Service;

import im.nt.Springboot.Dao.Book;
import im.nt.Springboot.Dto.BookDto;
import im.nt.Springboot.Dto.ResponseDto;
import im.nt.Springboot.Mapping.BookMapping;
import im.nt.Springboot.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public ResponseDto<List<BookDto>> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        if(!books.isEmpty()){
            List<BookDto> response = new ArrayList<>();
            for (Book book : books) {
                response.add(BookMapping.toDto(book));
            }
            return new ResponseDto<>(true, 0, "Data found!", response);
        }
        return new ResponseDto<>(false, -1, "", null);
    }

    public ResponseDto<BookDto> addNew(BookDto bookDto) {
        try{
            Book book = BookMapping.toEntity(bookDto);
            bookRepository.save(book);
            return new ResponseDto<>(true, 0, "Successful. Data saved!", BookMapping.toDto(book));
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseDto<>(false, -1, "Error. Save not completed!", null);
        }
    }
}
