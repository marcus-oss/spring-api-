package com.food.domain.repository;

import java.util.List;

import com.food.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> Todas();

	Cozinha porID(Long id);

	Cozinha salvar(Cozinha cozinha);

	void Remover(Cozinha cozinha);

}
