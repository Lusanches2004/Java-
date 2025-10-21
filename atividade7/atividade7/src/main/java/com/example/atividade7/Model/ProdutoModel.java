package com.example.atividade7.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "tab produtos")
public class ProdutoModel {
    @Id @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String lote;

    @Column(nullable = false, length = 100)
    private String validade;

    @Column(nullable = false, length = 100)
    private String categoria;

    @Column(nullable = false, length = 100)
    private int quantidade;
}
