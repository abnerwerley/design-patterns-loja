package br.com.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.Pedido;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Ana da Silva";
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);
        System.out.println("Salva pedido no banco de dados.");
        System.out.println("Enviar email com dados do novo pediod.");
    }
}