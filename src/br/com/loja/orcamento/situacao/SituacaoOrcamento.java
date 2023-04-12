package br.com.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.exception.DomainException;
import br.com.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser aprovado!");
	}

	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser reprovado!");
	}

	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser finalizado!");
	}
}
