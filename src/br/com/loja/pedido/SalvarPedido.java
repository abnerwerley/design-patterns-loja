package br.com.loja.pedido;

public class SalvarPedido implements AcoesPedido {

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Dados do pedido salvos no banco de dados.");
    }
}
