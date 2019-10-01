package br.com.tcc.expedicao.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TarifaDTO {
	private Integer id;
	private String descTarifa;
	private BigDecimal valorTarifa;
}
