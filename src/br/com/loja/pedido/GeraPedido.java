package br.com.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.loja.orcamento.Orcamento;

public class GeraPedido implements Command {

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

    @Override
    public void executar() {
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(this.cliente, data, orcamento);
        System.out.println("Salva pedido no banco de dados.");
        System.out.println("Enviar email com dados do novo pedido.");
    }
}
