package com.npteam.apinotivis.services;

import com.npteam.apinotivis.dao.MateriaDAO;
import com.npteam.apinotivis.model.Materia;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    private MateriaDAO materiaDAO;

    public Materia listarMateria(Integer codigo) {
        Optional<Materia> materia = materiaDAO.findById(codigo);

        return materia.orElseThrow(()-> new ObjectNotFoundException(codigo, "Matéria"));
    }
}
