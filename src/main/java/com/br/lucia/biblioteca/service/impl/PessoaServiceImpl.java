package com.br.lucia.biblioteca.service.impl;


import com.br.lucia.biblioteca.domain.Aluno;
import com.br.lucia.biblioteca.domain.Autor;
import com.br.lucia.biblioteca.domain.Pessoa;
import com.br.lucia.biblioteca.service.PessoaService;

public class PessoaServiceImpl implements PessoaService {

    @Override
    public void preenchePessoa() {
        Aluno aluno = new Aluno();
        Autor autor = new Autor();
        aluno.setCpf(23456);
        aluno.setDocumento("762943");
        aluno.setId(1L);
        aluno.setNome("Bob");
        aluno.setSobrenome("Esponja");
        printPessoa(aluno);

    }

    @Override
    public void printPessoa(Pessoa pessoa) {
        System.out.println(pessoa);
    }

}
