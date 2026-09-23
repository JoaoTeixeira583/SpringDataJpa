package com.example.springDataJpa.repository;

import com.example.springDataJpa.model.ExercicioEntity;
import com.example.springDataJpa.model.TreinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITreinoRepository extends JpaRepository<TreinoEntity,Integer> {
}
