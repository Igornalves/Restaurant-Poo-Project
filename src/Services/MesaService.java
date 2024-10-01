package Services;

import Class.Cliente;
import Class.Mesa;
import Class.Pedido;

public class MesaService {

    private Mesa mesa;

    public void reservar(Mesa mesa, Cliente cliente) {
        if (!mesa.isOcupada()) {
            mesa.setOcupada(true);
            System.out.println("Mesa " + mesa.getNumero() + " reservada com sucesso para o cliente " + cliente.getNome());
        } else {
            System.out.println("Mesa " + mesa.getNumero() + " ja esta ocupada");
        }
    }

    public void liberar() {
        if (mesa.isOcupada()) {
            mesa.setOcupada(false);
            System.out.println("Mesa " + mesa.getNumero() + " liberada com sucesso.");
        } else {
            System.out.println("Mesa " + mesa.getNumero() + " ja esta livre.");
        }
    }

    public void associarPedido(Pedido pedido) {
        if (mesa.isOcupada()) {
            System.out.println("Pedidos associados a mesa " + mesa.getNumero() + ".");
        } else {
            System.out.println("Nao e possivel associar um pedido a uma mesa que nao esta ocupada.");
        }
    }
}
