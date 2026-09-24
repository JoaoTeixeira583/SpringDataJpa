package com.example.springDataJpa.repository;

import com.example.springDataJpa.model.ExercicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IExercicioRepository extends JpaRepository<ExercicioEntity,Integer> {

//    Montar uma query sem sql
//    Metodo para buscar todos exercicios do grupo muscular
    List<ExercicioEntity> findAllByGrupoMuscular(String grupoMuscular);
}
