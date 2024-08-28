//7
package com.example.BookstoreAPI.dto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;
public class BookDTO {
	private Long id;
//    private String title;
//    private String author;
//    private Double price;
	//8
    @NotNull(message = "Title cannot be null")
    @Size(min = 1, max = 100, message = "Title must be between 1 and 100 characters")
    private String title;

    @NotNull(message = "Author cannot be null")
    @Size(min = 1, max = 50, message = "Author must be between 1 and 50 characters")
    private String author;

    @NotNull(message = "Price cannot be null")
    @Min(value = 0, message = "Price must be positive")
    private Double price;

    public BookDTO(Long id, String title, String author, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public BookDTO() {
		
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
