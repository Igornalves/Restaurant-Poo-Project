package Class;

public class Pedido {

    private String id;
    private Cliente cliente;
    private int valorTotal;
    private String[] listaDeItens;
    private boolean status;

    public Pedido(String id, Cliente cliente, int valorTotal, String[] listaDeItens, boolean status) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.listaDeItens = listaDeItens;
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

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String[] getListaDeItens() {
        return listaDeItens;
    }

    public void setListaDeItens(String[] listaDeItens) {
        this.listaDeItens = listaDeItens;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
