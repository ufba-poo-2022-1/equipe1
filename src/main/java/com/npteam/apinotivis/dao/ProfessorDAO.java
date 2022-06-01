package com.npteam.apinotivis.dao;

import com.npteam.apinotivis.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorDAO extends JpaRepository<Professor, Integer> {
}
