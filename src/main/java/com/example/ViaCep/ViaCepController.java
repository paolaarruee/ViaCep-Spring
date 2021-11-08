package com.example.ViaCep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class ViaCepController {

	@Autowired
	private ViaCepRepository repository;
	
	@RequestMapping(value = "/{cep}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<ViaCep> getCEP(@PathVariable("cep") String cep) {
		ViaCep cepObj = repository.findByCep(cep);
		return new ResponseEntity<ViaCep>(cepObj, HttpStatus.OK);
	}
	

	
	
	
}
