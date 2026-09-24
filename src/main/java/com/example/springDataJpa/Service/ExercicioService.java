package com.example.springDataJpa.Service;

import com.example.springDataJpa.dto.ExercicioDto;
import com.example.springDataJpa.model.ExercicioEntity;
import com.example.springDataJpa.repository.IExercicioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//Criação de construtor automatico so precisa do final e do @NonNull
@RequiredArgsConstructor
public class ExercicioService {

      private final IExercicioRepository iExercicioRepository;

//      Para listar todos os exercicios
      public List<ExercicioEntity>findAll(){
          return iExercicioRepository.findAll();
      }

//      Metodo para criar exercicio
//    Para fazer com o dto
      public void save(ExercicioDto exercicioDto){
//          Builder serve para não criar sem necessidade do operador new
          iExercicioRepository.save(ExercicioEntity.builder()
                          .nome(exercicioDto.getNome())
                          .grupoMuscular(exercicioDto.getGrupoMuscular())
//                Build Finaliza o processo e valida os dados
                  .build());
      }

      public List<ExercicioEntity> getExercicioByGrupoMuscular(String grupoMuscular){
          return iExercicioRepository.findAllByGrupoMuscular(grupoMuscular);
      }




}
