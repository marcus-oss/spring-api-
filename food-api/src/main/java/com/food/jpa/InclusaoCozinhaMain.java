package com.food.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.food.FoodApiApplication;
import com.food.domain.model.Cozinha;
import com.food.domain.repository.CozinhaRepository;

public class InclusaoCozinhaMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new SpringApplicationBuilder(
				FoodApiApplication.class).web(WebApplicationType.NONE).run(args);

		CozinhaRepository cozinhaRepository = configurableApplicationContext.getBean(CozinhaRepository.class);

		Cozinha cozinha = new Cozinha();
		cozinha.setNome("Americana");

		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Brasileira");

		cozinha = cozinhaRepository.salvar(cozinha);
		cozinha2 = cozinhaRepository.salvar(cozinha2);

		System.out.printf("%d-%s\n", cozinha.getCodigo(), cozinha.getNome());
		System.out.printf("%d-%s\n", cozinha2.getCodigo(), cozinha2.getNome());
	}

}
