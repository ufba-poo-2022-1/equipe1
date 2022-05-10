package com.npteam.apinotivis.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToMany(mappedBy = "aula")
    private List<Pergunta> perguntas = new ArrayList<>();
}
