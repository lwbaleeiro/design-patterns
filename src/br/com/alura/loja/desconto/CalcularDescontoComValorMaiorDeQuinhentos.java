package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoComValorMaiorDeQuinhentos extends Desconto {

    public CalcularDescontoComValorMaiorDeQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveCalcular(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
