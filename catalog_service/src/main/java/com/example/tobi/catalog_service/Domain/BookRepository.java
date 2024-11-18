package com.example.tobi.catalog_service.Domain;

import lombok.Builder;

import java.util.Optional;


public interface BookRepository {

    Iterable<Book> findAll();
    Optional<Book> findByIsbn(String isbn);
    Boolean existsByIsbn(String isbn);
    Book save(Book book);
    void deleteByIsbn(String isbn);
}
