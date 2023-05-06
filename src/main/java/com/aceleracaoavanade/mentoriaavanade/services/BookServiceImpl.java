package com.aceleracaoavanade.mentoriaavanade.services;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aceleracaoavanade.mentoriaavanade.models.Book;
import com.aceleracaoavanade.mentoriaavanade.repositories.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Book create(Book book) {
        return bookRepository.save(book);
    }

  
    public Book delete(String id) {
        return bookRepository.findById(id).get();
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }
    
 
    public Book update(Book book) {
        return bookRepository.save(book);
    }


    public Book getById(String id) {
        return bookRepository.findById(id).get();
    }
}
