package br.com.horario.beans.tabelas;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HorarioBeanValidation {

	private Long     id;
	@NotNull @Size(min = 5)
	private String   descricao;
	private String   horarioChegada;
	private Calendar dataChegada;
	private String   horarioSaida;
	private Calendar dataSaida;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getHorariochegada() {
		return horarioChegada;
	}
	
	public void setHorariochegada(String horariochegada) {
		this.horarioChegada = horariochegada;
	}
	
	public Calendar getDataChegada() {
		return dataChegada;
	}
	
	public void setDataChegada(Calendar dataChegada) {
		this.dataChegada = dataChegada;
	}
	
	public String getHorarioSaida() {
		return horarioSaida;
	}
	
	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	
	public Calendar getDataSaida() {
		return dataSaida;
	}
	
	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}  
}
