package br.com.tcc.frete.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.frete.domain.Tarifa;

public interface TarifaRepository extends CrudRepository<Tarifa, Integer> {

}
