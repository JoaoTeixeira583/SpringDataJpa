package com.example.springDataJpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "alunos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AlunosEntity {
    @Id
    // Para o jpa criar automaticamente o id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Para não aceitar nada dentro do banco de dados
    @Column(nullable = false)
    private String nome;

//    Para deixar o campo unico não repetir
    @Column(nullable = false, unique = true)
    private String email;

//    Para fazer relação ao java
    @OneToOne
//    Para saber qual tabela para eu fazer
    @JoinColumn(name = "avalicao_fisica_id")
    private AvaliacoesFisicasEntity avaliacoesFisicasEntity;

//    Para mapear a fk de outra tabela
    @OneToMany(mappedBy = "aluno")
    private Set<TreinoEntity> treinos = new HashSet<>();


}
