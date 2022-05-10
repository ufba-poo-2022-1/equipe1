package com.npteam.apinotivis.controller;

import com.npteam.apinotivis.model.Aula;
import com.npteam.apinotivis.services.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AulaController {
    @Autowired
    private AulaService aulaService;

    @GetMapping("/aulas/listar")
    public List<Aula> listarAulas() {
        return aulaService.listarAulas();
    }

}
