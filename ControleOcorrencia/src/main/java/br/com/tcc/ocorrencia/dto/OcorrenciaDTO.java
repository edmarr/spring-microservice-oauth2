package br.com.tcc.ocorrencia.dto;

import lombok.Data;

@Data
public class OcorrenciaDTO {
	private Integer id;
	private Integer idTipoOcorrencia;
	private Integer idItemBemProduto;
	private String descricao;
	private String descricaoItemBemProduto;
	private String email;
	private String emailDestinatario;
}
