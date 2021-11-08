package com.example.ViaCep;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface  ViaCepRepository extends CrudRepository<ViaCep,Long> { 
	 
	ViaCep FindById(long id);
}
