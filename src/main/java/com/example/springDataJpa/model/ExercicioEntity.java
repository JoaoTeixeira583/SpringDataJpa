package com.example.springDataJpa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "exercicio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ExercicioEntity {
    @Id
    // Para o jpa criar automaticamente o id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Para não aceitar nada dentro do banco de dados
    @Column(nullable = false)
    private String nome;

    //    Para deixar o campo unico não repetir
    //    No banco de dados e melhor deixar camecase
    @Column(name = "grupo_muscular", nullable = false)
    private String grupoMuscular;

}
