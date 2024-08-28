package com.example.BookstoreAPI.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.BookstoreAPI.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

//    @GetMapping
//    public ResponseEntity<List<Book>> getAllBooks() {
//        return ResponseEntity.ok(books);
//    }

    

//    @PostMapping
//    public ResponseEntity<Book> createBook(@RequestBody Book book) {
//        books.add(book);
//        return ResponseEntity.status(HttpStatus.CREATED).body(book);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
//        Optional<Book> existingBook = books.stream().filter(b -> b.getId().equals(id)).findFirst();
//        if (existingBook.isPresent()) {
//            books.remove(existingBook.get());
//            updatedBook.setId(id);
//            books.add(updatedBook);
//            return ResponseEntity.ok(updatedBook);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
//        Optional<Book> book = books.stream().filter(b -> b.getId().equals(id)).findFirst();
//        if (book.isPresent()) {
//            books.remove(book.get());
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }
//    
//    @GetMapping("/{id}")
//    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
//        Optional<Book> book = books.stream().filter(b -> b.getId().equals(id)).findFirst();
//        if (book.isPresent()) {
//            return ResponseEntity.ok(book.get());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//    }
//    @GetMapping
//    public ResponseEntity<List<Book>> getAllBooks(
//            @RequestParam(required = false) String title,
//            @RequestParam(required = false) String author) {
//
//        List<Book> filteredBooks = books;
//
//        if (title != null) {
//            filteredBooks = filteredBooks.stream()
//                    .filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
//                    .toList();
//        }
//
//        if (author != null) {
//            filteredBooks = filteredBooks.stream()
//                    .filter(b -> b.getAuthor().toLowerCase().contains(author.toLowerCase()))
//                    .toList();
//        }
//
//        return ResponseEntity.ok(filteredBooks);
//    }
    
//    //5.1
//    @GetMapping("/{id}")
//    @ResponseStatus(HttpStatus.OK)  // Custom status for successful retrieval
//    public Book getBookById(@PathVariable Long id) {
//        return books.stream()
//                .filter(b -> b.getId().equals(id))
//                .findFirst()
//                .orElseThrow(() -> new BookNotFoundException("Book not found"));
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)  // Custom status for successful creation
//    public Book createBook(@RequestBody Book book) {
//        book.setId((long) (books.size() + 1));
//        books.add(book);
//        return book;
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
//        Optional<Book> existingBook = books.stream().filter(b -> b.getId().equals(id)).findFirst();
//        if (existingBook.isPresent()) {
//            books.remove(existingBook.get());
//            updatedBook.setId(id);
//            books.add(updatedBook);
//            return ResponseEntity.ok(updatedBook);
//        } else {
//            throw new BookNotFoundException("Book not found");
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)  // Custom status for successful deletion
//    public void deleteBook(@PathVariable Long id) {
//        Book book = books.stream()
//                .filter(b -> b.getId().equals(id))
//                .findFirst()
//                .orElseThrow(() -> new BookNotFoundException("Book not found"));
//        books.remove(book);
//    }
    //5.2
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Total-Books", String.valueOf(books.size()));
        return new ResponseEntity<>(books, headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        book.setId((long) (books.size() + 1));
        books.add(book);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/books/" + book.getId());  // Custom header to indicate the location of the new resource

        return new ResponseEntity<>(book, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Book-Updated", "true");

        Optional<Book> existingBook = books.stream().filter(b -> b.getId().equals(id)).findFirst();
        if (existingBook.isPresent()) {
            books.remove(existingBook.get());
            updatedBook.setId(id);
            books.add(updatedBook);
            return new ResponseEntity<>(updatedBook, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, headers, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Book-Deleted", "true");

        boolean bookRemoved = books.removeIf(b -> b.getId().equals(id));
        if (bookRemoved) {
            return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(headers, HttpStatus.NOT_FOUND);
        }
    }
}
