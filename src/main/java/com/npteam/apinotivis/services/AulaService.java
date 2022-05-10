package com.npteam.apinotivis.services;

import com.npteam.apinotivis.dao.AulaDAO;
import com.npteam.apinotivis.model.Aula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaService {
    @Autowired
    private AulaDAO aulaDAO;

    public List<Aula> listarAulas() {
        return aulaDAO.findAll();
    }
}
