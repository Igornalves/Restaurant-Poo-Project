package Class;

import java.util.List;
import java.util.ArrayList;

public class Pedido {

    private String id;
    private Cliente cliente;
    private double valorTotal;
    private List<Item> listaDeItens;
    private boolean status;

    public Pedido(String id, Cliente cliente, double valorTotal, List<Item> listaDeItens, boolean status) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.listaDeItens = new ArrayList<>();
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Item> getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(List<Item> listaDeItens) {
        this.listaDeItens = listaDeItens;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
