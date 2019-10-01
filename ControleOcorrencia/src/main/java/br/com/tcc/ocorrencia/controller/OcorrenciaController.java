package br.com.tcc.ocorrencia.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcc.ocorrencia.dto.OcorrenciaDTO;
import br.com.tcc.ocorrencia.service.OcorrenciaService;

@RestController
@RequestMapping("/controle-ocorrencia")
public class OcorrenciaController {
	
	@Autowired
	private OcorrenciaService serviceOcorrencia;
		
	@RequestMapping(value= "/lista-tipo" , method = RequestMethod.GET)
	public List<?> getListaTipo() {
		return serviceOcorrencia.getTipoOcorrencias();
	}
	
	
	@RequestMapping(value= "/save" , method = RequestMethod.POST)
	@Consumes(MediaType.APPLICATION_JSON)
	public String salvarOcorrencia(@RequestBody OcorrenciaDTO dto) {
		serviceOcorrencia.save(dto);
		return "";
	}

}
