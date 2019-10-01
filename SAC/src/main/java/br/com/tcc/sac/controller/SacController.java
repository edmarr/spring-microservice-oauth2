package br.com.tcc.sac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcc.sac.dto.SacDTO;
import br.com.tcc.sac.service.SacService;

@RestController
@RequestMapping("/controle-sac")
public class SacController {
	
	@Autowired
	private SacService serviceSAC;

	@RequestMapping(value= "/save" , method = RequestMethod.POST)
	public String cadastrarTarifa(@RequestBody SacDTO volume) {
		serviceSAC.save(volume);
		return "Spring is here!";
	}
	
	@RequestMapping(value= "/listar" , method = RequestMethod.POST)
	public List<SacDTO> cadastrarTarifa() {
		return serviceSAC.list();
	}

}
