package com.matheusleffa.bookstoremanager.mapper;

import com.matheusleffa.bookstoremanager.dto.BookDTO;
import com.matheusleffa.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
