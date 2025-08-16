package com.example.demo;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(value="/intervaloHorariosInteiros/{id}")
	int pegarIntervaloInteiro(@PathVariable Integer id) {
		LocalTime horarioMinimo = repository.findById(id).get().getHorarioMin();
		LocalTime horarioMaximo= repository.findById(id).get().getHorarioMax();
		
		int intervaloHorarios = Duration.between(horarioMinimo, horarioMaximo).toHoursPart();
		
		int intervaloFinal = intervaloHorarios * 2 + 1;
		
		return intervaloFinal;
		
	}
	
	@GetMapping(value="/intervaloHorariosGenericos/{id}")
	float pegarIntervaloGenerico(@PathVariable Integer id) {
		LocalTime horarioMinimo = repository.findById(id).get().getHorarioMin();
		LocalTime horarioMaximo= repository.findById(id).get().getHorarioMax();
		
		long intervaloHorarios = Duration.between(horarioMinimo, horarioMaximo).toMinutes();
		
		float intervaloFinal = (float)((intervaloHorarios / 60.0) * 2 + 1);
		
		return intervaloFinal;
	}
	
	

}
