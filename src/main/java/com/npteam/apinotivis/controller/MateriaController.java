package com.npteam.apinotivis.controller;

import com.npteam.apinotivis.model.Materia;
import com.npteam.apinotivis.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping("/materias/listar")
    public List<Materia> listarMaterias() {
        return materiaService.listarMaterias();
    }

    @GetMapping("/materias/{codigo}")
    public ResponseEntity<Materia> listarMateria(@PathVariable Integer codigo) {
        return ResponseEntity.ok().body(materiaService.listarMateria(codigo));
    }

    @PostMapping("/materias/cadastrar")
    public ResponseEntity<Materia> cadastrarMateria(@RequestBody Materia materia) {
        materiaService.cadastrarMateria(materia);

        return ResponseEntity.status(201).build();
    }
}
