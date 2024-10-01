package App;

import Class.Cliente;
import Class.Estoque;
import Class.Funcionario;
import Class.Ingredintes;
import Class.Item;
import Class.Mesa;
import Class.Pedido;
import Services.EstoqueService;
import Services.FuncionarioService;
import Services.PedidoService;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente("Igor Nascimento", "(86) 99415-1721", "igornalves901@gmail.com","Silvania goias", 0);
        Cliente cliente2 = new Cliente("Yasmin Nascimento", "(86) 99415-1721", "Yasmin201@gmail.com","Silvania goias", 0);

        // Ingredintes ingredintes = new Ingredintes("Tomates", 10);
        // Ingredintes ingredintes2 = new Ingredintes("cenoura", 10);
        // Ingredintes ingredintes3 = new Ingredintes("Trigo", 10);
        // Ingredintes ingredintes4 = new Ingredintes("repolho", 5);

        // List<Ingredintes> listaParaConsumo = new ArrayList<>();

        // System.out.println();
        // listaParaConsumo.add(ingredintes);
        // listaParaConsumo.add(ingredintes2);
        // listaParaConsumo.add(ingredintes3);
        // listaParaConsumo.add(ingredintes4);

        // Estoque estoque = new Estoque(listaParaConsumo, 30);
        // EstoqueService estoqueService = new EstoqueService(estoque);

        // estoqueService.alertarBaixa();
        // System.out.println();
        // estoqueService.ListandoTodosOsIngredientes();
        // System.out.println();
        // estoqueService.removendoEstoque(ingredintes3);
        // System.out.println();
        // estoqueService.ListandoTodosOsIngredientes();
        // System.out.println();

        Funcionario funcionario = new Funcionario("Fernanda", "recursos humanos", 1500, 8);
        Funcionario funcionario2 = new Funcionario("Matheus", "estoque", 2500, 8);
        Funcionario funcionario3 = new Funcionario("carlos", "vendas", 1200, 8);

        FuncionarioService funcionarioService = new FuncionarioService();

        funcionarioService.registrarFuncionario(funcionario2);
        funcionarioService.registrarFuncionario(funcionario);
        funcionarioService.registrarFuncionario(funcionario3);
        System.out.println();

        funcionarioService.listandoFuncionario();
        System.out.println();
        
        funcionarioService.removerFuncionario(funcionario3);
        System.out.println();
        
        funcionarioService.listandoFuncionario();
        System.out.println();

        funcionarioService.logar("Matheus");
        System.out.println();

        funcionarioService.atenderCliente(funcionario3, cliente1);
        System.out.println();

        funcionarioService.atenderCliente(funcionario, cliente2);
        System.out.println();

        Item item1 = new Item("Hamburger", 22.99);
        Item item2 = new Item("refrigerante", 5.99);
        Item item3 = new Item("pizza", 50.89);
        Item item4 = new Item("guarana", 14.50);

        Pedido pedido = new Pedido("1", cliente1, funcionario3, true);
        PedidoService pedidoService = new PedidoService(pedido);

        Pedido pedido2 = new Pedido("2", cliente2, funcionario, true);
        PedidoService pedidoService2 = new PedidoService(pedido2);
        PedidoService pedidoService3 = new PedidoService(pedido2);

        pedidoService.adicionarItem(item1);
        pedidoService.adicionarItem(item2);
        
        pedidoService2.adicionarItem(item1);
        pedidoService2.adicionarItem(item2);

        pedidoService3.adicionarItem(item4);
        pedidoService3.adicionarItem(item3);

        funcionarioService.gerarRelatoriosVendas(funcionario3, pedido);
        System.out.println();

        funcionarioService.gerarRelatoriosVendas(funcionario, pedido2);
        System.out.println();

        // Mesa mesa = new Mesa(3, 4, true);



        // System.out.println("Valor do seu pedido ficou " + pedido.getValorTotal());
        // System.out.println("Lista do Itens pedidos");
        // pedidoService.listaDosItensPedidos();

    }
}
