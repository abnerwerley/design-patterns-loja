package br.com.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidade;
	private String situacao;

	public Orcamento(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorExtra = BigDecimal.ZERO;
		if (situacao.equals("EM ANALISE")) {
			valorExtra = new BigDecimal("0.05");
		}
		if (situacao.equals("APROVADO")) {
			valorExtra = new BigDecimal("0.02");
		}
		this.valor = this.valor.subtract(valorExtra);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}
}
