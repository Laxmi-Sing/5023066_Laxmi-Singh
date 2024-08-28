package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String book) {
        bookRepository.add(book);
    }

    public void findBook(String bookName) {
        String book = bookRepository.find(bookName);
        System.out.println(book);
    }
}
