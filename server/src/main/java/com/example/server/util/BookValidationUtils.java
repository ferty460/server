package com.example.server.util;

import com.example.server.entity.AuthorEntity;
import com.example.server.entity.BookEntity;
import com.example.server.entity.PublisherEntity;
import com.example.server.exception.ValidationExceptionBook;

public class BookValidationUtils {
    public static void validateBook(BookEntity book) throws ValidationExceptionBook {
        AuthorEntity author = book.getAuthor();
        if (author == null) {
            throw new ValidationExceptionBook("Автор должен быть в пределах от 3 до 35 символов");
        }
        String title = book.getTitle();
        if (title == null || title.isBlank() || title.length() < 3 || title.length() > 35) {
            throw new ValidationExceptionBook("Название должно быть в пределах от 3 до 35 символов");
        }
        PublisherEntity publishing = book.getPublisher();
        if (publishing == null) {
            throw new ValidationExceptionBook("Издательство должно быть в пределах от 3 до 35 символов");
        }
        String kind = book.getKind();
        if (kind == null || kind.isBlank() || kind.length() < 3 || kind.length() > 35) {
            throw new ValidationExceptionBook("Жанр должен быть в пределах от 3 до 35 символов");
        }
        int year = book.getYear();
        if (year > 2023) {
            throw new ValidationExceptionBook("Год не может быть больше нынешнего");
        }
    }
}
