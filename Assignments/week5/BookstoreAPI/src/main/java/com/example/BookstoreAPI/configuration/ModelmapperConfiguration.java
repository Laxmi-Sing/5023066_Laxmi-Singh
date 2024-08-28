package com.example.BookstoreAPI.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
public class ModelmapperConfiguration {
	@Bean
	public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
