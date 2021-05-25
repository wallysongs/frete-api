package com.maximatech.apifrete.entity.dto;

import com.maximatech.apifrete.entity.Frete;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FreteDTO {
    private Long quantidadeProdutos;
    private Double valorUnitario;
    private Double valorTotal;

    public FreteDTO fromFrete(Frete frete) {
        this.quantidadeProdutos = frete.getQuantidadeProdutos();
        this.valorUnitario = frete.getValorUnitario();
        this.valorTotal = frete.getValorTotal();
        return this;
    }
}

