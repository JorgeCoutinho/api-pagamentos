package edu.uea.dsw.api_pagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Implementação da classe Lancamento
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lancamento {
    private long codigo;
    private String descricao;
    private String dataVencimento;
    private String dataPagamento;
    private double valor;
    private String observacao;
    private TipoLancamento tipo;
}
