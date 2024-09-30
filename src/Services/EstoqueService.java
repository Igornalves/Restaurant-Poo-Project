package Services;

import Class.Estoque;
import java.util.Map;

public class EstoqueService {

    private Estoque estoque;

    public EstoqueService(Estoque estoque) {
        this.estoque = estoque;
    }

    public void atualizarEstoque(String ingrediente, int quantidade) {
        Map<String,Integer> listaIngredientes = estoque.getListaIngrediente();
        if (listaIngredientes.containsKey(ingrediente)) {
            int novaQuantidade = listaIngredientes.get(ingrediente) + quantidade;
            
            if (novaQuantidade < 0) {
                System.out.println("Erro: Estoque insuficiente para " + ingrediente);
            } else {
                listaIngredientes.put(ingrediente, novaQuantidade);
                System.out.println("Estoque atualizado: " + ingrediente + " agora tem " + novaQuantidade + " unidades");
            }
        } else {
            listaIngredientes.put(ingrediente, quantidade);
            System.out.println("Ingrediente " + ingrediente + " adicionado com " + quantidade + " unidades.");
        }

    }

    public void alertarBaixa() {
        Map<String, Integer> listaIngredientes = estoque.getListaIngrediente();
        for (Map.Entry<String, Integer> entry : listaIngredientes.entrySet()) {
            String ingrediente = entry.getKey();
            int quantidade = entry.getValue();
            if (quantidade < estoque.getQuantidadeMinima()) {
                System.out.println("Alerta: O ingrediente " + ingrediente + " está abaixo da quantidade mínima de " + estoque.getQuantidadeMinima() + " unidades.");
            }
        }
    }
}
