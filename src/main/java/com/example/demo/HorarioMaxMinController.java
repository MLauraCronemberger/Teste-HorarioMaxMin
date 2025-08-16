package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/teste")
@CrossOrigin("*")
public class HorarioMaxMinController {
	
	@Autowired
	private HorarioMaxMinRepository repository;
	
	@GetMapping(value="/listardados")
	List<HorarioMaxMin> findAll(){
		List<HorarioMaxMin> dados = repository.findAll();
		return dados;
	}

}
