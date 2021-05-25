package com.maximatech.apifrete.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Frete {
    private Long quantidadeProdutos;
    private Double valorUnitario;
    private Double valorTotal;
}

