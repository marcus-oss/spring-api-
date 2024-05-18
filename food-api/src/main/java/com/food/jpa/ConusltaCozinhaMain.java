package com.food.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.food.FoodApiApplication;
import com.food.domain.model.Cozinha;
import com.food.domain.repository.CozinhaRepository;

public class ConusltaCozinhaMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new SpringApplicationBuilder(
				FoodApiApplication.class).web(WebApplicationType.NONE).run(args);

		CozinhaRepository cozinhaRepository = configurableApplicationContext.getBean(CozinhaRepository.class);

		List<Cozinha> TodasCozinhas = cozinhaRepository.Todas();

		for (Cozinha cozinha : TodasCozinhas) {
			System.out.println(cozinha.getNome());
		}

	}

}
