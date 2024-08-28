
//7
package com.example.BookstoreAPI.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.BookstoreAPI.dto.BookDTO;
import com.example.BookstoreAPI.dto.CustomerDTO;
import com.example.BookstoreAPI.model.Book;
import com.example.BookstoreAPI.model.Customer;

@Mapper
public interface EntityMapper {
	EntityMapper INSTANCE = Mappers.getMapper(EntityMapper.class);

    BookDTO bookToBookDTO(Book book);
    Book bookDTOToBook(BookDTO bookDTO);

    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDTO);
}
