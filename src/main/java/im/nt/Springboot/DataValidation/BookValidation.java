package im.nt.Springboot.DataValidation;

import im.nt.Springboot.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Validated
@RequiredArgsConstructor

public class BookValidation {

    private final BookRepository bookRepository;

}
