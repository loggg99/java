package com.example.tobi.catalog_service.Domain;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super("A Book with ISBN " + isbn + " already exists");
    }
}
