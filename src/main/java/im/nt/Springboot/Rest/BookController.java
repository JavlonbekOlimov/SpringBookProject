package im.nt.Springboot.Rest;

import im.nt.Springboot.Dto.BookDto;
import im.nt.Springboot.Dto.ResponseDto;
import im.nt.Springboot.Repository.BookRepository;
import im.nt.Springboot.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("book")
public class BookController {

    private final BookService bookService;

    @GetMapping("/get-all")
    public ResponseDto<List<BookDto>> getAll(){
        return bookService.getAllBooks();
    }

    @PostMapping("/add")
    public ResponseDto<BookDto> add(@RequestBody BookDto bookDto){
        return bookService.addNew(bookDto);
    }

}
