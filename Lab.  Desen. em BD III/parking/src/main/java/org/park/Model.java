package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Carro> carros = new LinkedList<Carro>();

	public Model() {
		addCarro(new Carro("AAA1111", new Especificacao("Gol", "VW", "verde")));
		addCarro(new Carro("BBB2222", new Especificacao("Uno", "Fiat", "vermelho")));
		addCarro(new Carro("CCC3333", new Especificacao("Chevete", "GM", "cinza")));
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
	
	
	public List<Carro> buscarEspecificacao(Especificacao esp){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		
		for(Carro carro:carros){
			 if(esp.comparar(carro.getEspc())) carrosEncontrados.add(carro);
		}
		
		return carrosEncontrados;
		
	}
	
	
	public List<Carro> buscarModelo(String modelo){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		for(Carro carro:carros) {
			if(carro.getEspc().getModelo().equals(modelo)) carrosEncontrados.add(carro);
		}
		return carrosEncontrados;
	}
	
	public List<Carro> getCarros(){
		return carros;
	}

}
