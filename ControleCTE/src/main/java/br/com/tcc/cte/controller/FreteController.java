package br.com.tcc.cte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcc.cte.dto.TarifaDTO;
import br.com.tcc.cte.service.TarifaService;

@RestController
@RequestMapping("/controle-frete")
public class FreteController {
	
	@Autowired
	private TarifaService serviceTarifa;

	@RequestMapping(value= "/tarifa/cadastrar" , method = RequestMethod.POST)
	public String cadastrarTarifa(@RequestBody TarifaDTO volume) {
		serviceTarifa.save(volume);
		return "Spring is here!";
	}

}
