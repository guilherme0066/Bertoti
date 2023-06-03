package com.example.estacionamento;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List<Carro> carros = new LinkedList<Carro>();

	public Model() {
		addCarro(new Carro("AAA1111", new Especificacao("gol", "vw", "Verde")));
		addCarro(new Carro("BBB2222", new Especificacao("corsa", "vw", "Vermelho")));
		addCarro(new Carro("CCC3333", new Especificacao("Maverick", "vw", "Branco")));
		addCarro(new Carro("DDD4444", new Especificacao("Corcel", "vw", "Cinza")));
		addCarro(new Carro("EEE5555", new Especificacao("Monza", "vw", "Cinza")));
		addCarro(new Carro("FFF6666", new Especificacao("Chevette", "vw", "Preto")));
		addCarro(new Carro("GGG7777", new Especificacao("Palio", "vw", "Vermelho")));
		addCarro(new Carro("HHH8888", new Especificacao("Fox", "vw", "Amarelo")));


	}
	
	public void addCarro(Carro carro){
		carros.add(carro);
	}
	
	public Carro buscarPlaca(String placa){
		for(Carro carro:carros){
			if(carro.getPlaca().equals(placa)) return carro;
		}
		
		return null;
	}
	
	public List<Carro> listarCarros(){
		List<Carro> listaDeCarros = new LinkedList<Carro>();
		for(Carro carro: carros) {
			listaDeCarros.add(carro);
		}
		return listaDeCarros;
	}
	
	
	public List<Carro> buscarEspecificacao(Especificacao esp){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		
		for(Carro carro:carros){
			 if(esp.comparar(carro.getEspc())) carrosEncontrados.add(carro);
		}
		
		return carrosEncontrados;
		
	}
	public List<Carro> removerCarro(String placa){
		List<Carro> listaDeCarros = new LinkedList<Carro>();
		for(Carro carro: carros) {
			if(placa != carro.getPlaca()) {
				listaDeCarros.add(carro);
			}
		}
		return listaDeCarros;
	}
	
	
}
