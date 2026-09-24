package com.example.springDataJpa.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExercicioDto {

    @NotBlank
//    Para String
    private String nome;
    @NotBlank
    private String grupoMuscular;
}
