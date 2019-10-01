package br.com.tcc.ocorrencia.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private Integer id;
	
	@Column
	private Integer idTipoOcorrencia;
	
	@Column
	private Integer idItemBemProduto;

	@Column
	private String descricao;
	
	@Column
	private Date dataHoraOcorrencia;

	
}
