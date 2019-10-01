package br.com.tcc.carga.dto;

import lombok.Data;

@Data
public class ItemBemProdutoDTO {
	private Integer id;
	private String descricao;
	private String email;
	private String emailDestinatario;
}
