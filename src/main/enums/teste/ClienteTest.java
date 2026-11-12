package main.enums.teste;

import main.enums.dominio.Cliente;
import main.enums.dominio.StatusPedido;
import main.enums.dominio.TipoPagamento;

public class ClienteTest {
    static void main(String[] args) {
        Cliente cliente = new Cliente("João", StatusPedido.AGUARDANDO_PAGAMENTO);
        System.out.println(cliente);
        StatusPedido statusPedido = StatusPedido.obterCodigo(1);
        System.out.println(statusPedido);
        System.out.println("Desconto de: "+ TipoPagamento.PIX.calcularDesconto(100.0));
    }
}
