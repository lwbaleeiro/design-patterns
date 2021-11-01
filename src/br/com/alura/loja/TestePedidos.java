package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoBancoDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {

    public static void main(String[] args) {

        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = new BigDecimal("645");
        int quantidadeItens = 4;

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(
                new SalvarPedidoBancoDados(),
                new EnviarEmailPedido()
        ));
        geraPedidoHandler.executa(geraPedido);
    }

}
