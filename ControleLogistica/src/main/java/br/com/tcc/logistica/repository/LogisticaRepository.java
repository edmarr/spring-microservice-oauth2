package br.com.tcc.logistica.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.logistica.domain.ItemBemProduto;

public interface LogisticaRepository extends CrudRepository<ItemBemProduto, Integer> {

}
