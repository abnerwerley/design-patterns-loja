package br.com.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido  {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }
}
