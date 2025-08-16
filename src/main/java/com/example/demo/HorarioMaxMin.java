package com.example.demo;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HorarioMaxMin {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeServico;
	private LocalTime horarioMin;
	private LocalTime horarioMax;
	private LocalTime intervaloAtendimentos;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public LocalTime getHorarioMin() {
		return horarioMin;
	}
	public void setHorarioMin(LocalTime horarioMin) {
		this.horarioMin = horarioMin;
	}
	public LocalTime getHorarioMax() {
		return horarioMax;
	}
	public void setHorarioMax(LocalTime horarioMax) {
		this.horarioMax = horarioMax;
	}
	public LocalTime getIntervaloAtendimentos() {
		return intervaloAtendimentos;
	}
	public void setIntervaloAtendimentos(LocalTime intervaloAtendimentos) {
		this.intervaloAtendimentos = intervaloAtendimentos;
	}
	

	
}
