package br.com.tcc.ocorrencia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListaItemDTO {
	private Integer id;
	private String descricao;
	
	ListaItemDTO(){
		
	}
}
