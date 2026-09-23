package com.example.springDataJpa.repository;

import com.example.springDataJpa.model.AlunosEntity;
import com.example.springDataJpa.model.TreinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAlunoRepository extends JpaRepository<AlunosEntity,Integer> {
}
