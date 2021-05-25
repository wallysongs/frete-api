package com.maximatech.apifrete.service;

import com.maximatech.apifrete.entity.Frete;

public interface FreteService {

    public Frete calcularValorFrete(Long quantidadeDeProduto);
}
