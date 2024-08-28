package com.example.LibraryManagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.LibraryManagement.entity.Book;
import com.example.LibraryManagement.exception.ResourceNotFoundException;
import com.example.LibraryManagement.repository.BookRepository;
import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));

        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());

        Book updatedBook = bookRepository.save(book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id " + id));

        bookRepository.delete(book);
        return ResponseEntity.noContent().build();
    }

}
