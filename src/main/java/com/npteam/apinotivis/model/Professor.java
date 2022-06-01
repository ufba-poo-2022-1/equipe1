package com.npteam.apinotivis.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professor")
@Data
public class Professor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, length = 150)
  private String nome;

  @OneToMany(mappedBy = "codigo")
  private List<Materia> materias = new ArrayList<>();

  public void addMateria(Materia materia) {
    this.materias.add(materia);
  }
}
