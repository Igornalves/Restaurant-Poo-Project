package Services;

import Class.Estoque;
import Class.Ingredintes;

public class EstoqueService {

    private Estoque estoque;

    public EstoqueService(Estoque estoque) {
        this.estoque = estoque;
    }

    public void ListandoTodosOsIngredientes() {
        System.out.println("Listando todos os itens e ingredientes no estoque: ");
        for (int i = 0; i < estoque.getListaIngrediente().size(); i++) {
            System.out.println(estoque.getListaIngrediente().get(i).getNome());
        }
    }

    public void removendoEstoque(Ingredintes ingredintes) {
        for (int i = 0; i < estoque.getListaIngrediente().size(); i++) {
            if (estoque.getListaIngrediente().get(i).getNome() == ingredintes.getNome()) {
                estoque.getListaIngrediente().remove(i);
                System.out.println("Item removido com sucesso !!! " + ingredintes.getNome());
            }
        }
    }

    public void alertarBaixa() {
        int quantidadeMinima = estoque.getQuantidadeMinima();

        for (Ingredintes ingredintes : estoque.getListaIngrediente()) {
            if (ingredintes.getQunatidade() < quantidadeMinima) {
                System.out.println("Alerta: o ingrediente " + ingredintes.getNome()
                        + " esta abaixo da quantidade minima de " + quantidadeMinima + " unidades");
            }
        }
    }
}
