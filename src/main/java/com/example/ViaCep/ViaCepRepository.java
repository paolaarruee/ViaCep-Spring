package com.example.ViaCep;

import org.springframework.data.repository.CrudRepository;


public interface  ViaCepRepository extends CrudRepository<ViaCep,Long> { 
	 
     ViaCep findByCep(String cep);
}
