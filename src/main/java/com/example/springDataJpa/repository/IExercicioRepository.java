package com.example.springDataJpa.repository;

import com.example.springDataJpa.model.ExercicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IExercicioRepository extends JpaRepository<ExercicioEntity,Integer> {
}
