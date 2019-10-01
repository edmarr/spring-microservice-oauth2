package br.com.tcc.logistica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcc.logistica.dto.ItemBemProdutoDTO;
import br.com.tcc.logistica.service.LogisticaService;

@RestController
@RequestMapping("/controle-frete")
public class LogisticaController {
	
	@Autowired
	private LogisticaService serviceTarifa;

	@RequestMapping(value= "/tarifa/cadastrar" , method = RequestMethod.POST)
	public String cadastrarTarifa(@RequestBody ItemBemProdutoDTO volume) {
		serviceTarifa.save(volume);
		return "Spring is here!";
	}

}
