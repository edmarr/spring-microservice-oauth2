package br.com.tcc.carga.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.carga.domain.ItemBemProduto;

public interface CargaRepository extends CrudRepository<ItemBemProduto, Integer> {

}
