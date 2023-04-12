package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Ana";
        BigDecimal valorOrcamento = new BigDecimal("2000");
        int quantidadeItens = 3;

        GeraPedido pedidoGerado = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/* dependencias */);
        handler.executar(pedidoGerado);
    }
}