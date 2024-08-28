package com.example.BookstoreAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.BookstoreAPI.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        // Normally, you would save the customer to a database, but for simplicity:
        customer.setId(1L); // Mock setting an ID (in a real app, the DB would set this)
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
    
 // New form data end point
    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String email,
            @RequestParam String password) {

        Customer customer = new Customer();
        customer.setId(2L); // Mock setting an ID
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPassword(password);

        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
}
