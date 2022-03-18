package com.br.lucia.biblioteca.domain;

import com.br.lucia.biblioteca.enums.EstadoAluguel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Livro {
   private String nome;
   private Long id;
   private Autor autor;
   private EstadoAluguel estadoAluguel;

}
