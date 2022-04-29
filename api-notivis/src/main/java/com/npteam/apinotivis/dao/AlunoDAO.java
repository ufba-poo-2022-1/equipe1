package com.npteam.dao;

import com.npteam.model.Aluno;

import org.springframework.data.repository.CrudRepository;

public interface AlunoDAO extends CrudRepository<Aluno, Integer> {
    
}