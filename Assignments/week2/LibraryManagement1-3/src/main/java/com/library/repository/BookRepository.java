package com.library.repository;

public class BookRepository {
	public void add(String book) {
        System.out.println("Book " + book + " added to the repository.");
    }

    public String find(String bookName) {
        return "Book found: " + bookName;
    }
}
