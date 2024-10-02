package Services;

import Class.Cliente;
import Class.Pedido;
import java.util.List;
import java.util.ArrayList;

public class ClienteService {

    private Cliente cliente;
    private List<Pedido> pedidoRealizados;

    public ClienteService(Cliente cliente) {
        this.cliente = cliente;
        this.pedidoRealizados = new ArrayList<>();
    }

    public void fazerPedido(Pedido pedido) {
        pedidoRealizados.add(pedido);
        System.out.println("Pedido realizado com sucesso por " + cliente.getNome() + ".");
    }

    public void reservarMesa(int numeroMesa) {
        System.out.println("Mesa " + numeroMesa + " reserva para " + cliente.getNome() + ".");
    }

    public void pagarConta(Pedido pedido, String formaDePagamento) {
        System.out.println("Pagamento do pedido foi realizado pelo cliente " + pedido.getCliente().getNome() + " com o valor total de R$ " + pedido.getValorTotal() + " com a forma de pagamento " + formaDePagamento);
    }
    
}
