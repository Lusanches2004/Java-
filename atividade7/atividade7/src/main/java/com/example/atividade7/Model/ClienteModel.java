package com.example.atividade7.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tab clientes")
@AllArgsConstructor
@NoArgsConstructor
public class ClienteModel {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100,unique = true)
    private String email;

    @Column(nullable = false, length = 100)
    private String telefone;

    @Column(nullable = false, length = 100)
    private String formaPagamento;

    @Column(nullable = false, length = 100)
    private String endereco;


}
