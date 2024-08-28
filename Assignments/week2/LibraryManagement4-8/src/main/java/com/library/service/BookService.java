package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;
@Service
public class BookService {
	private BookRepository bookRepository;
	//constructor injection
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	//setter injection
//	@Autowired
//	public void setBookRepository(BookRepository bookRepository) {
//		this.bookRepository=bookRepository;
//	}
	public void addNewBook(String book) {
		bookRepository.add(book);
	}
	public void findBook(String book) {
		bookRepository.search(book);
	}

}