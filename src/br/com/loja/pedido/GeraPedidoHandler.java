package br.com.loja.pedido;

import java.time.LocalDateTime;

import br.com.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

    // construtor com injecao de dependencias: repository, service, etc...
    public GeraPedidoHandler() {

    }

    public void executar(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Salva pedido no banco de dados.");
        System.out.println("Envia email com dados do novo pedido.");
    }
}
