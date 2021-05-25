package com.maximatech.apifrete.service.impl;

import com.maximatech.apifrete.entity.Frete;
import com.maximatech.apifrete.service.FreteService;
import com.maximatech.apifrete.service.exception.QuantidadeIncorretaException;
import com.maximatech.apifrete.util.MathUtil;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class FreteServiceImpl implements FreteService {

    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public Frete calcularValorFrete(Long quantidadeDeProduto) {

        if (quantidadeDeProduto > 0) {

            double valorFreteUnitario = calcularValorFreteUnitario();
            double valorFreteTotal = calcularValorFreteTotal(quantidadeDeProduto, valorFreteUnitario);

            return new Frete(quantidadeDeProduto, valorFreteUnitario, valorFreteTotal);
        }

        throw new QuantidadeIncorretaException("Quantidade informada incorreta. Quantidade mínima de produto informado deve ser maior que 0");

    }

    private static double calcularValorFreteUnitario() {
        return Double.parseDouble(decimalFormat.format(MathUtil.randomNumber(5, 10)));
    }

    private static double calcularValorFreteTotal (long quantidadeProduto,double valorFreteUnitario) {

        return  Double.parseDouble(decimalFormat.format(quantidadeProduto * valorFreteUnitario));
    }
}
