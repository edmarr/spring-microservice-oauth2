package br.com.tcc.carga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.tcc.carga.dto.ItemBemProdutoDTO;
import br.com.tcc.carga.service.CargaService;

@RestController
@EnableDiscoveryClient
@RequestMapping("/controle-carga")
public class CargaController {
	
	@Autowired
	private CargaService serviceCarga;

	@RequestMapping(value= "/solicitar" , method = RequestMethod.POST)
	public String solicitarCarregamento(@RequestBody ItemBemProdutoDTO dto) {
		serviceCarga.save(dto);
		return "Solicitação de Carregamento recebida!";
	}
	
	@RequestMapping(value= "/listarItemBemProduto" , method = RequestMethod.GET)
	public List<?> getListarItemBemProduto() {
		return serviceCarga.list();
	}
	
}
