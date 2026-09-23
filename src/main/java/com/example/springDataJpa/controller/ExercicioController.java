package com.example.springDataJpa.controller;


import com.example.springDataJpa.Service.ExercicioService;
import com.example.springDataJpa.model.ExercicioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/exercicios")
@RequiredArgsConstructor
public class ExercicioController {

    private final ExercicioService exercicioService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ExercicioEntity> findAll(){
        return exercicioService.listarTodos();
    }
}
