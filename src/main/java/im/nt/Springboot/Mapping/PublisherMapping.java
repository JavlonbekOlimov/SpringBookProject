package im.nt.Springboot.Mapping;

import im.nt.Springboot.Dao.Publisher;
import im.nt.Springboot.Dto.PublisherDto;

public class PublisherMapping {
    public static PublisherDto toDto(Publisher publisher){
        return new PublisherDto(publisher.getId(),
                publisher.getName(),
                publisher.getAdressID());
    }
    public static Publisher toEntity(PublisherDto publisherDto){
        return new Publisher(publisherDto.getId(),
                publisherDto.getName(),
                publisherDto.getAdressId());
    }

    public static void setEntity(Publisher publisher, PublisherDto publisherDto){
        publisher.setId(publisherDto.getId());
        publisher.setName(publisherDto.getName());
        publisher.setAdressID(publisherDto.getAdressId());
    }
}
