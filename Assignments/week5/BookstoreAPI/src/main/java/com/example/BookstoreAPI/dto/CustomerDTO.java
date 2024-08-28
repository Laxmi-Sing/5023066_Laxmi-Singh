//7
package com.example.BookstoreAPI.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CustomerDTO {
	private Long id;
//    private String firstName;
//    private String lastName;
//    private String email;
    //8
    @NotNull(message = "First name cannot be null")
    @Size(min = 1, max = 50, message = "First name must be between 1 and 50 characters")
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 1, max = 50, message = "Last name must be between 1 and 50 characters")
    private String lastName;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    private String email;

    //7
    @JsonIgnore
    private String password;
    public CustomerDTO(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
