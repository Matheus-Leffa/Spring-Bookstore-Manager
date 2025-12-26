package com.matheusleffa.bookstoremanager.repository;

import com.matheusleffa.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
