package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class DescontoZero extends Desconto{

	public DescontoZero() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
}
