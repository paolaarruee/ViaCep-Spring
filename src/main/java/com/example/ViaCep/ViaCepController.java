package com.example.ViaCep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/api")
public class ViaCepController {

	@Autowired
	private ViaCepRepository cepRepository;

	 @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	    public ViaCep getCep(@PathVariable("id") long id) {

		 ViaCep ceps = this.cepRepository.FindById(id);
	         return ceps;
	    }
	

	
	
	
}
