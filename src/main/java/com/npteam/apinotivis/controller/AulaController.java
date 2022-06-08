package com.npteam.apinotivis.controller;

import com.npteam.apinotivis.model.Aula;
import com.npteam.apinotivis.services.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AulaController {
    @Autowired
    private AulaService aulaService;

    @GetMapping("/aulas/listar")
    public List<Aula> listarAulas() {
        return aulaService.listarAulas();
    }

    @PostMapping("/aulas/cadastrar/materia/{codigo}")
    public ResponseEntity<Void> cadastrarAula(@RequestBody Aula aula, @PathVariable(name = "codigo") Integer codigo) {
        aulaService.cadastrarAula(aula, codigo);

        return ResponseEntity.status(201).build();
    }

}
