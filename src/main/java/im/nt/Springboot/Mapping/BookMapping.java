package im.nt.Springboot.Mapping;

import im.nt.Springboot.Dao.Book;
import im.nt.Springboot.Dto.BookDto;

public class BookMapping {
    public static BookDto toDto(Book book){
        return new BookDto(book.getId(),
                book.getNameUz(),
                book.getNameRu(),
                book.getCost(),
        book.getGenre());
    }

    public static Book toEntity(BookDto bookDto){
        return new Book(
                bookDto.getNameUz(),
                bookDto.getNameRu(),
                bookDto.getCost());
    }

    public static void setEntity(Book book, BookDto bookDto){
        book.setId(bookDto.getId());
        book.setNameUz(bookDto.getNameUz());
        book.setNameRu(bookDto.getNameRu());
        book.setCost(bookDto.getCost());
        book.setGenre(bookDto.getGenre());
    }
}
