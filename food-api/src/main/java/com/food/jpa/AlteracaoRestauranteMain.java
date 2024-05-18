package com.food.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.food.FoodApiApplication;
import com.food.domain.model.Restaurante;
import com.food.domain.repository.RestauranteRepository;

public class AlteracaoRestauranteMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new SpringApplicationBuilder(
				FoodApiApplication.class).web(WebApplicationType.NONE).run(args);

		RestauranteRepository restauranteRepository = configurableApplicationContext
				.getBean(RestauranteRepository.class);

		Restaurante restaurante = new Restaurante();
		restaurante.setCodigo(1L);
		restaurante.setNome("Restarante de japa");

		restauranteRepository.salvar(restaurante);

	}

}
