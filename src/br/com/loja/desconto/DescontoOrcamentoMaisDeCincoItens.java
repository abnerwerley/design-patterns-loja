package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoOrcamentoMaisDeCincoItens extends Desconto {

	public DescontoOrcamentoMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidade() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		return proximo.calcular(orcamento);
	}

}
