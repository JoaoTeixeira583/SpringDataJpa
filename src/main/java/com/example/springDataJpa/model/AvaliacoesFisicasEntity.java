package com.example.springDataJpa.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "avalicao_fisica")
// Cria automaticamente um contrutor vazio
@NoArgsConstructor
// Cria um construtor com todos atributos
@AllArgsConstructor
// Cria os getters automaticamnete
@Getter
// Cria os setters automaticamnete
@Setter
// Metodo para construir obejto de forma organizada
@Builder
public class AvaliacoesFisicasEntity {
    @Id
    // Para o jpa criar automaticamente o id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Para não aceitar nada dentro do banco de dados
    @Column(nullable = false)
    private BigDecimal peso;

    @Column(nullable = false)
    private BigDecimal altura;

    // Para colocar nome de uma coluna
    @Column(name = "percentual_gordura_corporal")
    private  BigDecimal percentualGorduraCorporal;

}
