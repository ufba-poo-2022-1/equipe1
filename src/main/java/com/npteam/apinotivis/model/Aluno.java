package com.npteam.apinotivis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_matricula")
    private Integer numero_matricula;

    @Column(nullable = false, length = 150)
    private String nome;
    
    @Column(nullable = false, length = 12)
    private String senha;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "materias_aluno",
            joinColumns = @JoinColumn(name = "numero_matricula"),
            inverseJoinColumns = @JoinColumn(name = "codigo"))
    private List<Materia> materias = new ArrayList<>();

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }

}
