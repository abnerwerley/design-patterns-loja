package br.com.loja.pedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

    private List<AcoesPedido> acoes = new ArrayList<>();

    // construtor com injecao de dependencias: repository, service, etc...
    public GeraPedidoHandler(List<AcoesPedido> acoes) {
        this.acoes = acoes;
    }

    public GeraPedidoHandler() {
    }

    public void executar(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executar(pedido));
    }
}
