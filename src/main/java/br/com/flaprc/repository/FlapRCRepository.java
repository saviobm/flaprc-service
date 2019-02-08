package br.com.flaprc.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.flaprc.entidades.FlapRCEntidade;

public interface FlapRCRepository<T extends FlapRCEntidade> extends CrudRepository<T, Long> {
	
}