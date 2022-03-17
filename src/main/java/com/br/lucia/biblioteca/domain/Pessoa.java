package com.br.lucia.biblioteca.domain;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;


@Getter
@Setter
public class Pessoa {
    private BigDecimal id;
    private String nome;
    private String sobrenome;
    private String documento;
    private Integer cpf;

    public Pessoa(){

    }

    public Pessoa(BigDecimal id, String nome, String sobrenome, String documento, Integer cpf) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", documento='" + documento + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
