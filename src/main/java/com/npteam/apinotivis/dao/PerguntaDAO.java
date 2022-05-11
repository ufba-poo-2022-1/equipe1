package com.npteam.apinotivis.dao;

import com.npteam.apinotivis.model.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntaDAO extends JpaRepository<Pergunta, Integer> {

    @Query(value = "SELECT perguntas.id_pergunta, perguntas.conteudo, perguntas.status_respondida, perguntas.id_aula, aula.id_aula, aula.data_criacao FROM aula RIGHT JOIN perguntas ON perguntas.id_pergunta = aula.id_aula", nativeQuery = true)
    List<List> perguntasComAula();
}
