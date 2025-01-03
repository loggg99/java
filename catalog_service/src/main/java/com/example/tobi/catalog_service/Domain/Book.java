package com.example.tobi.catalog_service.Domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

@Builder
public record Book(
        @NotBlank(message = "The book ISBN must be defined")
        @Pattern(
                regexp = "^([0-9]{10}|[0-9]{13})$",
                message = "The ISBN format must be valid"
        )
        String isbn,
        @NotNull (message = "The book title must be defined.")
        String title,
        @NotBlank (message = "The book title must be defined")
        String author,
        @NotNull(message = "The book price must be defined")
        @Positive(
                message = "The book price must be greater than zero"
        )
        Double price
) {}
