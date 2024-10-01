package Services;

import Class.Cliente;
import Class.Funcionario;
import Class.Pedido;

import java.util.List;
import java.util.ArrayList;

public class FuncionarioService {

    private List<Funcionario> funcionarios;
    private List<Pedido> pedidos;

    public FuncionarioService() {
        this.funcionarios = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void registrarFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            funcionarios.add(funcionario);
            System.out.println("Funcionario registrado: " + funcionario.getNome() + " sucesso !!!");
        } else {
            System.out.println("Funcionario nao pode ser nulo.");
        }
    }

    public Funcionario logar(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Funcionario Logado: " + funcionario.getNome());
                return funcionario;
            }
        }
        System.out.println("Funcionario nao encontrado");
        return null;
    }

    public void atenderCliente(Funcionario funcionario, Cliente cliente) {
        if (funcionario != null) {
            System.out.println(funcionario.getNome() + " esta atendendo um cliente com o nome " + cliente.getNome());
        } else {
            System.out.println("Funcionario nao encontrado !!!!");
        }
    }

    public void listandoFuncionario(){
        System.out.println("Listando todos os funcionarios existentes na aplicacao");
        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i).getNome());
        }
    }

    public void removerFuncionario(Funcionario funcionario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome() == funcionario.getNome()) {
                funcionarios.remove(i);
                System.out.println("funcionario removido com sucesso !!!");
            }
        }
    }

    public void gerarRelatoriosVendas(Funcionario funcionario,Pedido pedido) {
        double totalVendas = 0;
        int totalItensVendidos = 0;
        int totalDePedidos = 0;

        totalVendas = pedido.getValorTotal();
        totalItensVendidos = pedido.getListaDeItens().size();
        totalDePedidos = pedidos.size();

        System.out.println("=== Relatório de Vendas ===");
        System.out.println("Funcionario " +  funcionario.getNome() + " e informacoes das vendas");
        System.out.println("Total de Vendas: R$ " + totalVendas);
        System.out.println("Total de Itens Vendidos: " + totalItensVendidos);
        System.out.println("Total de Pedidos: " + totalDePedidos);
    }
}
