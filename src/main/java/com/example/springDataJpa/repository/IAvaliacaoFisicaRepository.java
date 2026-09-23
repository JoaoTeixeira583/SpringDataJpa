package com.example.springDataJpa.repository;

import com.example.springDataJpa.model.AlunosEntity;
import com.example.springDataJpa.model.AvaliacoesFisicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IAvaliacaoFisicaRepository extends JpaRepository<AvaliacoesFisicasEntity,Integer> {

}
