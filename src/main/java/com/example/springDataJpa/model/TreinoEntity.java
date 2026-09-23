package com.example.springDataJpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exercicio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TreinoEntity {
    @Id
    // Para o jpa criar automaticamente o id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Para não aceitar nada dentro do banco de dados
    @Column(nullable = false)
    private String nome;

//    Fazer relacionamento das tabelas
//    ManytoOne muitos
//    Primeira palavra e para a classe que esta,e a segunda e para a outra que vai ser relacionar
     @ManyToOne
    @JoinColumn(name = "aluno_id")
    private AlunosEntity aluno;

//     Para criação de um tabela auxiliar
    @ManyToMany
//    Gerar um tabela
    @JoinTable(
            name = "treinos_exercicios",
//            Primeira FK
            joinColumns = @JoinColumn(name = "treino_id"),
//            E o inverso
            inverseJoinColumns = @JoinColumn(name = "exercicio_id")

    )
    private Set<ExercicioEntity> exercicios = new HashSet<>();

}
