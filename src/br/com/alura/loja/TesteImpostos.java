package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 4);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);


        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }

}
