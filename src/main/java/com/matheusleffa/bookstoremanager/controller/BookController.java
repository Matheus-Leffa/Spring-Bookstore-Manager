package com.matheusleffa.bookstoremanager.controller;

import com.matheusleffa.bookstoremanager.dto.BookDTO;
import com.matheusleffa.bookstoremanager.dto.MessageResponseDTO;
import com.matheusleffa.bookstoremanager.exception.BookNotFoundException;
import com.matheusleffa.bookstoremanager.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return bookService.create(bookDTO);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) {
        return bookService.findById(id);
    }
}
