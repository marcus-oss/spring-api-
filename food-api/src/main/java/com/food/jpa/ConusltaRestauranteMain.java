package com.food.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.food.FoodApiApplication;
import com.food.domain.model.Restaurante;
import com.food.domain.repository.RestauranteRepository;

public class ConusltaRestauranteMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new SpringApplicationBuilder(
				FoodApiApplication.class).web(WebApplicationType.NONE).run(args);

		RestauranteRepository restauranteRepository = configurableApplicationContext
				.getBean(RestauranteRepository.class);

		List<Restaurante> TodosRestaurantes = restauranteRepository.Todas();

		for (Restaurante restaurante : TodosRestaurantes) {
			System.out.printf("%s - %f - %s", restaurante.getNome(), restaurante.getTaxaFrete(),
					restaurante.getCozinha().getNome());
		}

	}

}
