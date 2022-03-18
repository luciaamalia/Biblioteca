package com.br.lucia.biblioteca.service.impl;

import com.br.lucia.biblioteca.domain.Autor;
import com.br.lucia.biblioteca.domain.Livro;
import com.br.lucia.biblioteca.enums.EstadoAluguel;
import com.br.lucia.biblioteca.service.LivroService;

public class LivroServiceImpl implements LivroService {
    @Override
    public void preencheLivro() {
        Livro livro = new Livro();
        Autor autor = new Autor();
        autor.setCpf(12345);
        autor.setDocumento("872321");
        autor.setNome("José Almeida");
        autor.setId(1L);

        livro.setId(1L);
        livro.setNome("Flores e água");
        livro.setAutor(autor);
        livro.setEstadoAluguel(EstadoAluguel.DISPONIVEL);
        printLivro(livro);
    }

    @Override
    public void printLivro(Livro livro) {
        System.out.println(livro);
    }
}
