package com.npteam.apinotivis.services;

import com.npteam.apinotivis.dao.AulaDAO;
import com.npteam.apinotivis.model.Aula;
import com.npteam.apinotivis.model.Pergunta;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaService {
    @Autowired
    private AulaDAO aulaDAO;

    public List<Aula> listarAulas() {
        return aulaDAO.findAll();
    }

    public Aula cadastrarAula(Aula aula) {

        return aulaDAO.save(aula);
    }

    public Aula listarAula(Integer id_aula) {
        Optional<Aula> aula = aulaDAO.findById(id_aula);

        return aula.orElseThrow(()-> new ObjectNotFoundException(id_aula, "Aula"));
    }

}
