package com.br.lucia.biblioteca.domain;

import com.br.lucia.biblioteca.enums.EstadoAluguel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pessoa {
    private Long id;
    private String nome;
    private String sobrenome;
    private String documento;
    private Integer cpf;


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
