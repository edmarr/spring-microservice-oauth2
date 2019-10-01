package br.com.tcc.expedicao.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.expedicao.domain.Tarifa;

public interface TarifaRepository extends CrudRepository<Tarifa, Integer> {

}
