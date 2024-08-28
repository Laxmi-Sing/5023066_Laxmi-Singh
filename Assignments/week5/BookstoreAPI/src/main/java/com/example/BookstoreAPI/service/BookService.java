//7
package com.example.BookstoreAPI.service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.micrometer.core.instrument.MeterRegistry;
import com.example.BookstoreAPI.dto.BookDTO;
import com.example.BookstoreAPI.model.Book;

@Service
public class BookService {
	@Autowired
    private ModelMapper modelMapper;

    public BookDTO convertToDto(Book book) {
        return modelMapper.map(book, BookDTO.class);
    }

    public Book convertToEntity(BookDTO bookDTO) {
        return modelMapper.map(bookDTO, Book.class);
    }

	public void deleteBook(Long id) {
		
		
	}
	//11
	private final MeterRegistry meterRegistry;

    @Autowired
    public BookService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    public void registerBookCreated() {
        meterRegistry.counter("bookstore.books.created").increment();
    }

    public void registerBookFetched() {
        meterRegistry.counter("bookstore.books.fetched").increment();
    }


    public BookDTO createBook(BookDTO bookDTO) {
        // Logic to create a book
        registerBookCreated();
        return bookDTO; // Return the created book DTO
    }

    public BookDTO getBookById(Long id) {
        // Logic to fetch a book
        registerBookFetched();
        return new BookDTO(); // Return the fetched book DTO
    }

	

}
