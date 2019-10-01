package br.com.tcc.acesso.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.acesso.domain.ApplicationUser;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Integer> {
	ApplicationUser findByUsername(String username);
	
}
