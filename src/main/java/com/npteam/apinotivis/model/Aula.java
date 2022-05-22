package com.npteam.apinotivis.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "aula")
@Data
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_aula;

    @Column(nullable = false)
    private Date data_criacao;

    @Column(nullable = true)
    private Boolean status_abertura = true;

    @OneToMany(mappedBy = "aula")
    private List<Pergunta> perguntas = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo", referencedColumnName = "codigo")
    private Materia materia;

    public void addPergunta(Pergunta pergunta) {
        this.perguntas.add(pergunta);
    }
}
