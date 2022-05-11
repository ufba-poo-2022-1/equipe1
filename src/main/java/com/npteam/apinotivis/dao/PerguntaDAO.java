package com.npteam.apinotivis.dao;

import com.npteam.apinotivis.model.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntaDAO extends JpaRepository<Pergunta, Integer> {

    @Query(value = "SELECT id_pergunta, conteudo, status_respondida, pergunta.id_aula, id_aula, data_criacao FROM aula RIGHT JOIN pergunta ON pergunta.id_pergunta = aula.id_aula", nativeQuery = true)
    List<List> perguntasComAula();
}
