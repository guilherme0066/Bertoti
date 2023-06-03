package com.example.estacionamento;

import jakarta.persistence.Entity;

public class Carro {
	private String placa;
	
	private Especificacao espc;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Carro(String placa, Especificacao espc) {
		this.placa = placa;
		this.espc = espc;
	}
	
	public Especificacao getEspc() {
		return espc;
	}
	
	public void setEspecificao(Especificacao espc) {
		this.espc = espc;
	}
	
}

