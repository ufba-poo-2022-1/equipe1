package com.npteam.apinotivis.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "materia")
@Data
public class Materia {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer codigo;

  @Column(nullable = true)
  private String descricao;

  @JoinColumn(name = "id_professor")
  private Integer id_professor;

  @JsonIgnore
  @OneToMany(mappedBy = "id_aula")
  private List<Aula> aulas = new ArrayList<>();

  public void addAula(Aula aula) {
    this.aulas.add(aula);
  }
}
