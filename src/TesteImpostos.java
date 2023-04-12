import java.math.BigDecimal;

import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 5);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		BigDecimal impostoIcms = calculadora.calcular(orcamento, new ICMS());
		BigDecimal impostoIss = calculadora.calcular(orcamento, new ISS());

		System.out.println(impostoIcms.compareTo(new BigDecimal("100.0")) == 0 ? "Sucesso, 100 reais de imposto ICMS"
				: "Não deu certo.");
		System.out.println(impostoIss.compareTo(new BigDecimal("60.0")) == 0 ? "Sucesso, 60 reais de imposto ISS"
				: "Não deu certo.");
	}
}
