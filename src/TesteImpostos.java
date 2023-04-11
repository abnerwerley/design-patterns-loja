import java.math.BigDecimal;

import br.com.loja.imposto.CalculadoraDeImpostos;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.TipoImposto;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		BigDecimal impostoIcms = calculadora.calcular(orcamento, TipoImposto.ICMS);
		BigDecimal impostoIss = calculadora.calcular(orcamento, TipoImposto.ISS);

		System.out.println(impostoIcms.compareTo(new BigDecimal("100.0")) >= 0 ? "Sucesso, 100 reais de imposto ICMS"
				: "Não deu certo.");
		System.out.println(impostoIss.compareTo(new BigDecimal("60.0")) >= 0 ? "Sucesso, 60 reais de imposto ISS"
				: "Não deu certo.");
	}

}
