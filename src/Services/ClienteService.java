package Services;

import Class.Cliente;
import Class.Pedido;
import java.util.List;
import java.util.ArrayList;

public class ClienteService {

    private Cliente cliente;
    private List<Pedido> pedidoRealizados;

    public ClienteService(Cliente cliente, List<Pedido> pedidoRealizados) {
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

    public List<Pedido> pagarConta() {
        return pedidoRealizados;
    }
}
