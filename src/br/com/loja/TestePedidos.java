package br.com.loja;

import java.math.BigDecimal;

import br.com.loja.pedido.GeraPedido;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Ana";
        BigDecimal valorOrcamento = new BigDecimal("2000");
        int quantidadeItens = 3;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        gerador.executar();
    }
}