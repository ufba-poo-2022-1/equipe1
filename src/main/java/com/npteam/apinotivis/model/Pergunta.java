package com.npteam.apinotivis.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "perguntas")
public class Pergunta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id_pergunta;

  @Column(nullable = false)
  private String conteudo;

  @Column(nullable = false)
  private Integer numero_matricula_aluno;

  @Column(nullable = false)
  private Boolean status_respondida = Boolean.FALSE;

  @ManyToOne
  @JoinColumn(name = "id_aula")
  private Aula aula;

}