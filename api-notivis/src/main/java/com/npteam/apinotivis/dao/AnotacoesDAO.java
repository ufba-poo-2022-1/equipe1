package com.npteam.dao;

import com.npteam.model.Anotacoes;

import org.springframework.data.repository.CrudRepository;

public interface AnotacoesDAO extends CrudRepository<Integer, Anotacoes> {
    
}