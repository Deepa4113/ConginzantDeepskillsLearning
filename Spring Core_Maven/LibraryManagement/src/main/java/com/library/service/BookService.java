package com.library.service;

public class BookService {

    public BookService() {
        System.out.println("BookService instance created.");
    }

    public String getBookDetails(String id) {
        return "Fetching details for book ID: " + id;
    }
}