package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService instance created.");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected into BookService.");
    }

    public String getBookDetails(String id) {
        String repoResult = bookRepository.findBookById(id);
        return "Service layer -> " + repoResult;
    }
}