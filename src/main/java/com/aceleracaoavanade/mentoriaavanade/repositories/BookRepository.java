package com.aceleracaoavanade.mentoriaavanade.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aceleracaoavanade.mentoriaavanade.models.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    
}
