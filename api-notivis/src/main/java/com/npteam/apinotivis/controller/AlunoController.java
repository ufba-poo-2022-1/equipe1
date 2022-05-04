package com.npteam.apinotivis.controller;

import com.npteam.apinotivis.model.Aluno;
import com.npteam.apinotivis.services.IAlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @CrossOrigin("*")
public class AlunoController {

  @Autowired
  private IAlunoServices alunoServices;

  @GetMapping("/teste")
  public String helloWorld() {
    return "Hello World!";
  }

  @GetMapping("/alunos/listarTodos")
  public ResponseEntity<List<Aluno>> listarTodos() {
    return ResponseEntity.ok(alunoServices.listarAlunos());
  }
    
}