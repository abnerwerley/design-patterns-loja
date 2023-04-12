import java.math.BigDecimal;

import br.com.loja.desconto.CalculadoraDeDescontos;
import br.com.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento orcamento6Itens = new Orcamento(new BigDecimal("200"), 6);
		Orcamento orcamento5Itens = new Orcamento(new BigDecimal("200"), 5);
		Orcamento orcamento700 = new Orcamento(new BigDecimal("700"), 4);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

		BigDecimal desconto6Itens = calculadora.calcular(orcamento6Itens);
		BigDecimal desconto5Itens = calculadora.calcular(orcamento5Itens);
		BigDecimal desconto700 = calculadora.calcular(orcamento700);

		System.out.println(desconto6Itens.compareTo(new BigDecimal("20.0")) == 0
				? "Sucesso, " + desconto6Itens + " reais de desconto para mais de 5 itens"
				: "Não deu certo.");

		System.out.println(desconto5Itens.compareTo(BigDecimal.ZERO) == 0
				? "Sucesso," + desconto5Itens + " reais de desconto para 4 quantidades, que não passa de 500"
				: "Não deu certo.");

		System.out.println(desconto700.compareTo(new BigDecimal("35.0")) == 0
				? "Sucesso," + desconto700 + " reais de desconto para orcamento de 700 reais"
				: "Não deu certo. " + desconto700);

		orcamento6Itens.aplicarDescontoExtra();

		System.out.println(orcamento6Itens.getValor().compareTo(new BigDecimal("190.0")) == 0
				? "Sucesso,10 reais de desconto extra aplicado para orcamento em análise."
				: "Não deu certo. " + orcamento6Itens.getValor());

		orcamento5Itens.aprovar();
		orcamento5Itens.aplicarDescontoExtra();
		System.out.println(orcamento5Itens.getValor().compareTo(new BigDecimal("196.0")) == 0
				? "Sucesso,4 reais de desconto extra aplicado para orcamento aprovado."
				: "Não deu certo. " + orcamento5Itens.getValor());

	}
}
