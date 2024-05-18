package com.food.infrastucture.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.food.domain.model.Cozinha;
import com.food.domain.repository.CozinhaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class CozinhaRepositoryimpl implements CozinhaRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cozinha> Todas() {
		return manager.createQuery("From Cozinha", Cozinha.class).getResultList();

	}

	@Override
	public Cozinha porID(Long id) {
		return manager.find(Cozinha.class, id);
	}

	@Transactional
	@Override
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha);

	}

	@Transactional
	@Override
	public void Remover(Cozinha cozinha) {
		cozinha = porID(cozinha.getCodigo());
		manager.remove(cozinha);
	}

}
