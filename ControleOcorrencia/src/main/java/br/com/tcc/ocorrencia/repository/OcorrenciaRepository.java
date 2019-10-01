package br.com.tcc.ocorrencia.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tcc.ocorrencia.domain.Ocorrencia;

public interface OcorrenciaRepository extends CrudRepository<Ocorrencia, Integer> {

}
