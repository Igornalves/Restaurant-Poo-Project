package Class;

public class Estoque {

    private String[] listaIngrediente;
    private int quantidadeMinima;

    public Estoque(String[] listaIngrediente, int quantidadeMinima) {
        this.listaIngrediente = listaIngrediente;
        this.quantidadeMinima = quantidadeMinima;
    }

    public String[] getListaIngrediente() {
        return listaIngrediente;
    }

    public void setListaIngrediente(String[] listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

}
