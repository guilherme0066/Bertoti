package com.example.estacionamento;

public class Especificacao {
	
	private String marca;
	private String modelo;
	private String cor;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Especificacao(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public boolean comparar(Especificacao esp) {
		if(marca.equals(esp.marca) && modelo.equals(esp.modelo) && cor.equals(esp.cor)){
			return true;
		}
		else {
			return false;
		}
	}
}
