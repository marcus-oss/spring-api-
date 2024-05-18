package com.food.infrastucture.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.food.domain.model.Restaurante;
import com.food.domain.repository.RestauranteRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class RestauranteRepositoryimpl implements RestauranteRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Restaurante> Todas() {
		return manager.createQuery("From Restaurante", Restaurante.class).getResultList();

	}

	@Override
	public Restaurante porID(Long id) {
		return manager.find(Restaurante.class, id);
	}

	@Transactional
	@Override
	public Restaurante salvar(Restaurante restaurante) {
		return manager.merge(restaurante);

	}

	@Transactional
	@Override
	public void Remover(Restaurante restaurante) {
		restaurante = porID(restaurante.getCodigo());
		manager.remove(restaurante);
	}

}
