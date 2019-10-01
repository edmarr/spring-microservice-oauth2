package br.com.tcc.ocorrencia.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tcc.ocorrencia.client.EmailServiceImpl;
import br.com.tcc.ocorrencia.domain.Ocorrencia;
import br.com.tcc.ocorrencia.dto.ListaItemDTO;
import br.com.tcc.ocorrencia.dto.OcorrenciaDTO;
import br.com.tcc.ocorrencia.enumerator.TipoOcorrencia;
import br.com.tcc.ocorrencia.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {

	@Autowired
	private OcorrenciaRepository repository;
	
	@Autowired
	EmailServiceImpl serviceMail;
	

	public void save(OcorrenciaDTO dto) {
		Ocorrencia entity = new Ocorrencia();
		entity.setIdItemBemProduto(dto.getIdItemBemProduto());
		entity.setIdTipoOcorrencia(dto.getIdTipoOcorrencia());
		entity.setDescricao(dto.getDescricao());
		entity.setDataHoraOcorrencia(new Date(System.currentTimeMillis()));
		repository.save(entity);
		
		enviarEmail(dto);
		
		
	}

	private void enviarEmail(OcorrenciaDTO dto) {
		StringBuilder sbAssunto = new StringBuilder();
		sbAssunto.append("Alteração de Status do Produto : ");
		sbAssunto.append(dto.getIdItemBemProduto());
		
		StringBuilder sbTexto = new StringBuilder();
		sbTexto.append("O Produto ");
		sbTexto.append(dto.getDescricaoItemBemProduto());
		sbTexto.append("Teve o status alterado para: ");
		sbTexto.append(TipoOcorrencia.valueById(dto.getIdTipoOcorrencia()).getDescricao());

		//serviceMail.sendSimpleMessage(dto.getEmailDestinatario(), sbAssunto.toString() , sbTexto.toString());
		//serviceMail.sendSimpleMessage(dto.getEmail(), sbAssunto.toString() , sbTexto.toString());
	}
	
	public List<ListaItemDTO> getTipoOcorrencias(){
		List<ListaItemDTO> lista = new ArrayList<>();
		ListaItemDTO dto = null;
		for(TipoOcorrencia t: TipoOcorrencia.values()){
			dto = new ListaItemDTO(t.getId(), t.getDescricao());
			lista.add(dto);
		}
		return lista;
	}

	
}
