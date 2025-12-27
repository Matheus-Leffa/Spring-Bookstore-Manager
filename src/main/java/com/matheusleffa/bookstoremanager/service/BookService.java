package com.matheusleffa.bookstoremanager.service;

import com.matheusleffa.bookstoremanager.dto.BookDTO;
import com.matheusleffa.bookstoremanager.dto.MessageResponseDTO;
import com.matheusleffa.bookstoremanager.entity.Book;
import com.matheusleffa.bookstoremanager.mapper.BookMapper;
import com.matheusleffa.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper;

    @Autowired
    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }
}
