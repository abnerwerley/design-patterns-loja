package br.com.loja.desconto;

import java.math.BigDecimal;

import br.com.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoOrcamentoMaisDeCincoItens(
				new DescontoOrcamentoValorMaiorQueQuinhentos(new DescontoZero()));
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
