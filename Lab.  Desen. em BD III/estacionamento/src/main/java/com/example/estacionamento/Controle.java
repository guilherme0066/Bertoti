package com.example.estacionamento;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class Controle {

	  Model model = new Model();
	  List<Carro> carros = model.listarCarros();
	  
	
	  @GetMapping("/home")
	  public String index(){
	    return "home";
	  }
	  
	  @GetMapping("/carros")
	  public ModelAndView listaCarros() {
		 ModelAndView mv = new ModelAndView("carros");
		 mv.addObject("carros", carros);
		 return mv;
	  }
	  
	  @GetMapping("/carros/{palavra}")
	  public ModelAndView carroBusca(@PathVariable String palavra) {
		  ModelAndView mv = new ModelAndView("carros");
		  Carro carros = model.buscarPlaca(palavra);
		  mv.addObject("carros", carros); 	  
		  return mv;
	  }
	  
	  @GetMapping("/carros/novo")
	  public ModelAndView cadastrarCarro() {
		  ModelAndView mv = new ModelAndView("CadastroForm");
		  return mv;
	  }
	  
	  @GetMapping("/carros/save")
	  public ModelAndView cadastroCarro(@Validated Especificacao espc, @Validated Carro carro, RedirectAttributes redirect) {
		ModelAndView mv = new ModelAndView("carros");
		model.addCarro(new Carro(carro.getPlaca(),espc));
		carros = model.listarCarros();
		mv.addObject("carros", carros);
		return mv;
	  }
	  
	  @GetMapping("/carro/{placa}")
	  public ModelAndView editarCarro(@PathVariable String placa) {
		  ModelAndView mv = new ModelAndView("EditarCarro");
		  Carro car = model.buscarPlaca(placa);
		  mv.addObject("carro", car);
		  return mv;
	  }
	  
	  @GetMapping("/carro/delete/{placa}")
	  public ModelAndView removerCarro(@PathVariable String placa) {
		  ModelAndView mv = new ModelAndView("carros");
		  Carro carro = model.buscarPlaca(placa);
		  carros.remove(carro);
		  mv.addObject("carros", carros); 	  
		  return mv;
	  }
	  
	   @GetMapping("/carro/{placa}/save")
	   public String editSave(@PathVariable String placa,@Validated Especificacao espc, @Validated Carro carro, RedirectAttributes redirect) {
		   Carro car = model.buscarPlaca(placa);
		   car.setEspecificao(espc);
		   car.setPlaca(placa);
		   return "redirect:/carros";
	   }
}
