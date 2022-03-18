package com.br.lucia.biblioteca;

import com.br.lucia.biblioteca.service.PessoaService;
import com.br.lucia.biblioteca.service.impl.LivroServiceImpl;
import com.br.lucia.biblioteca.service.impl.PessoaServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		PessoaServiceImpl pessoaService = new PessoaServiceImpl();
		pessoaService.preenchePessoa();
		LivroServiceImpl livroService = new LivroServiceImpl();
		livroService.preencheLivro();

	}

}
