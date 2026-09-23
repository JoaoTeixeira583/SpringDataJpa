package com.example.springDataJpa.Service;

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
      public List<ExercicioEntity>listarTodos(){
          return iExercicioRepository.findAll();
      }


}
