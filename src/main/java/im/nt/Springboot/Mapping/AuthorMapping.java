package im.nt.Springboot.Mapping;

import im.nt.Springboot.Dao.Author;
import im.nt.Springboot.Dao.Book;
import im.nt.Springboot.Dto.AuthorDto;
import im.nt.Springboot.Dto.BookDto;

public class AuthorMapping {
    public static AuthorDto toDto(Author author){
        return new AuthorDto(author.getId(),
                author.getLastName(),
                author.getFirstName(),
                author.getBirthDate());
    }

    public static Author toEntity(AuthorDto authorDto){
        return new Author(authorDto.getId(),
                authorDto.getLastName(),
                authorDto.getFirstName(),
                authorDto.getBirthDate());
    }

    public static void setEntity(Author author, AuthorDto authorDto){
        author.setId(authorDto.getId());
        author.setLastName(authorDto.getLastName());
        author.setFirstName(authorDto.getFirstName());
        author.setBirthDate(authorDto.getBirthDate());
    }
}
