package Services;

import Class.Item;
import Class.Pedido;
import java.util.ArrayList;

public class PedidoService {

    private Pedido pedido;

    public PedidoService(Pedido pedido) {
        this.pedido = pedido;
    }

    public void listaDosItensPedidos() {
        for (Item item : pedido.getListaDeItens()) {
            System.out.println(item.getNome() + " - R$" + item.getPreco());
        }
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Item item : pedido.getListaDeItens()) {
            total += item.getPreco();
        }
        pedido.setValorTotal(total);
    }

    public void adicionarItem(Item item) {
        if (pedido.getListaDeItens() == null) {
            pedido.setListaDeItens(new ArrayList<>());
        }
        pedido.getListaDeItens().add(item);
        calcularValorTotal();
    }

    public void removerItem(Item item) {
        if (pedido.getListaDeItens().remove(item)) {
            calcularValorTotal();
        }
    }

    public void cancelar() {
        pedido.setStatus(false);
        pedido.setListaDeItens(new ArrayList<>());
        pedido.setValorTotal(0);
    }
}
