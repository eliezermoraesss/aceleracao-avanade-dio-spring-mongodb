package com.aceleracaoavanade.mentoriaavanade.services;

import java.util.List;

import com.aceleracaoavanade.mentoriaavanade.models.Book;

public interface BookService {

    Book create(Book book);

    Book delete(String id);

    List<Book> getAll();

    Book update(Book book);

    Book getById(String id);
    
}
