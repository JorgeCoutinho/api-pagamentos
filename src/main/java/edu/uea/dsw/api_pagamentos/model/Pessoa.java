package edu.uea.dsw.api_pagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Implementação da classe Pessoa
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private long codigo;
    private String nome;
    private Boolean ativo;
}
