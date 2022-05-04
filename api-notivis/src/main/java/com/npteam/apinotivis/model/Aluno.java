package com.npteam.apinotivis.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero_matricula;
    private String nome;


    @JsonIgnoreProperties("aluno")
    private List<Pergunta> listaAnotacoes;


}
