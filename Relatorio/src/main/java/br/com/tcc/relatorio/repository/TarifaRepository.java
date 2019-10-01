package br.com.tcc.relatorio.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.relatorio.domain.Tarifa;

public interface TarifaRepository extends CrudRepository<Tarifa, Integer> {

}
