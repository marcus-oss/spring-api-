package com.food.domain.repository;

import java.util.List;

import com.food.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> Todas();

	Restaurante porID(Long id);

	Restaurante salvar(Restaurante restaurante);

	void Remover(Restaurante restaurante);

}
