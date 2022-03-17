package com.br.lucia.biblioteca.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Livro {
    private List<Aluno> listaAluno;
    private List<Autor> listaAutor;
}
