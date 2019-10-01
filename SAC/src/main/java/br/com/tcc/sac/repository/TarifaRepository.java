package br.com.tcc.sac.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.sac.domain.Sac;

public interface TarifaRepository extends CrudRepository<Sac, Integer> {

}
