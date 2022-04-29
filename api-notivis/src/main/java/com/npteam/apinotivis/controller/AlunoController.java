package com.npteam.apinotivis.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @CrossOrigin("*")
public class AlunoController {

  @GetMapping("/teste")
  public String helloWorld() {
    return "Hello World!";
  }
    
}