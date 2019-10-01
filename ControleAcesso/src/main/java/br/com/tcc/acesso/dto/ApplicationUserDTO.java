package br.com.tcc.acesso.dto;

import lombok.Data;

@Data
public class ApplicationUserDTO {
	private long id;
    private String username;
    private String password;
}
