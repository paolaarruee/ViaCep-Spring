package com.example.ViaCep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ViaCepApplication {

	public static void main(String[] args) {
	
	
		SpringApplication.run(ViaCepApplication.class, args);
		
	}
	@Bean
	public CommandLineRunner cep(ViaCepRepository repository) {
		return (args)-> {
			repository.save(new ViaCep("01","01001-000" ,"Praça da Sé","lado ímpar", "São Paulo","SP","3550308","1004","11","7107"));
            
            
            
           
		};
	}
}
	