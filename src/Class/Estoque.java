package Class;

import java.util.Map;
import java.util.HashMap;

public class Estoque {

    private Map<String, Integer> listaIngrediente;
    private int quantidadeMinima;

    public Estoque(Map<String, Integer> listaIngrediente, int quantidadeMinima) {
        this.listaIngrediente = new HashMap<>();
        this.quantidadeMinima = quantidadeMinima;
    }

    public Map<String, Integer> getListaIngrediente() {
        return listaIngrediente;
    }

    public void setListaIngrediente(Map<String, Integer> listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

}
