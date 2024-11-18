package com.example.tobi.catalog_service.persistance;

import com.example.tobi.catalog_service.Domain.Book;
import com.example.tobi.catalog_service.Domain.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryBookRepository implements BookRepository {

    private static final Map<String, Book> books =
            new HashMap<>();


    @Override
    public Iterable<Book> findAll() {
        return books.values();
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return existsByIsbn(isbn) ? Optional.of(books.get(isbn)) : Optional.empty();
    }

    @Override
    public Book save(Book book) {
        books.put(book.isbn(), book);
        return null;
    }

    @Override
    public Boolean existsByIsbn(String isbn) {

        return books.get(isbn) != null;
    }

    @Override
    public void deleteByIsbn(String isbn) {
        books.remove(isbn);

    }
}
