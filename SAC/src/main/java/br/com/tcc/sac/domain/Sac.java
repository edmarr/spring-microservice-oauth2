package br.com.tcc.sac.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Sac {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private Integer id;

	@Column
	private String descricao;

	@Column
	private String email;

}
