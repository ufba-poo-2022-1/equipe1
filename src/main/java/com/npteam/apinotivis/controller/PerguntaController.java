package com.npteam.apinotivis.controller;


import com.npteam.apinotivis.dao.PerguntaDAO;
import com.npteam.apinotivis.model.Aluno;
import com.npteam.apinotivis.model.Pergunta;
import com.npteam.apinotivis.services.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerguntaController {

  @Autowired
  private PerguntaDAO perguntaDAO;

  @Autowired
  private PerguntaService perguntaService;

  @GetMapping("/perguntas/listar/todas")
  public ResponseEntity<List<Pergunta>> listarTodasPerguntas() {
    ResponseEntity<List<Pergunta>> response = ResponseEntity.ok(perguntaDAO.findAll());
    if (response != null) {
      return response;
    }
    return ResponseEntity.notFound().build();

    //return ResponseEntity.ok(perguntaDAO.findAll());
  }

    @PostMapping("/perguntas/criar/aula/{id_aula}")
    public ResponseEntity<?> criarNovaPergunta(@PathVariable Integer id_aula, @RequestBody Pergunta pergunta) {
      perguntaService.cadastrarPergunta(id_aula, pergunta);

      return  ResponseEntity.status(201).build();
    }



}
