package Class;

import java.util.List;

public class Estoque {

    private List<Ingredintes> listaIngrediente;
    private int quantidadeMinima;

    public Estoque(List<Ingredintes> listaIngrediente, int quantidadeMinima) {
        this.listaIngrediente = listaIngrediente;
        this.quantidadeMinima = quantidadeMinima;
    }

    public List<Ingredintes> getListaIngrediente() {
        return listaIngrediente;
    }

    public void setListaIngrediente(List<Ingredintes> listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

}
