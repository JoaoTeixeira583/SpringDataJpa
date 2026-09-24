package com.example.springDataJpa.controller;


import com.example.springDataJpa.Service.ExercicioService;
import com.example.springDataJpa.dto.ExercicioDto;
import com.example.springDataJpa.model.ExercicioEntity;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exercicios")
@RequiredArgsConstructor
@Validated
public class ExercicioController {

    private final ExercicioService exercicioService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ExercicioEntity> findAll(){
        return exercicioService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
//    Valida para validar o dto
    public void saveExercicio(@Valid  @RequestBody ExercicioDto exercicioDto){
        exercicioService.save(exercicioDto);
    }

    @GetMapping("/grupos/{grupoMuscular}")
    @ResponseStatus(HttpStatus.OK)
    public List<ExercicioEntity> getExercicioByGrupoMuscular(@PathVariable String grupoMuscular){
        return  exercicioService.getExercicioByGrupoMuscular(grupoMuscular);
    }
}
