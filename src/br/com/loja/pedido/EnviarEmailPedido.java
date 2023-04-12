package br.com.loja.pedido;

public class EnviarEmailPedido implements AcoesPedido {

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Email enviado com dados do pedido.");
    }
}
