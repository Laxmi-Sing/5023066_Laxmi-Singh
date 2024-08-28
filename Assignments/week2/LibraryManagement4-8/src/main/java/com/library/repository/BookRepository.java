package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	public void add(String book) {
		System.out.println(book+" is placed in the library");
	}
	public void search(String book) {
		System.out.println(book+" is present in our library");
	}

}
