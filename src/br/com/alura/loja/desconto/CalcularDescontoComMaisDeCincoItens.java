package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoComMaisDeCincoItens extends Desconto {

    public CalcularDescontoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.5"));
    }

    @Override
    protected boolean deveCalcular(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
