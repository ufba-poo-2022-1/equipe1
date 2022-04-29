package com.npteam.apinotivis.dao;

import com.npteam.apinotivis.model.Anotacoes;

import org.springframework.data.repository.CrudRepository;

public interface AnotacoesDAO extends CrudRepository<Anotacoes, Integer> {
    
}