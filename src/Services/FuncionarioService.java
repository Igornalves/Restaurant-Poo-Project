package Services;

import Class.Funcionario;
import Class.Pedido;

import java.util.List;
import java.util.ArrayList;

public class FuncionarioService {

    private List<Funcionario> funcionarios;
    private List<Pedido> pedidos;

    public FuncionarioService() {
        this.funcionarios = new ArrayList<>();
    }

    public void registrarFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            funcionarios.add(funcionario);
            System.out.println("Funcionario registrado: " + funcionario);
        } else {
            System.out.println("Funcionario nao pode ser nulo.");
        }
    }

    public Funcionario logar(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Funcionario Logado: " + funcionario);
                return funcionario;
            }
        }
        System.out.println("Funcionario nao encontrado");
        return null;
    }

    public void atenderCliente(Funcionario funcionario) {
        if (funcionario != null) {
            System.out.println(funcionario.getNome() + " esta atendendo um cliente.");
        } else {
            System.out.println("Funcionario nao encontrado !!!!");
        }
    }

    public void gerarRelatoriosVendas() {
        double totalVendas = 0;
        int totalItensVendidos = 0;

        for (Pedido pedido : pedidos) {
            totalVendas += pedido.getValorTotal();
            totalItensVendidos += pedido.getListaDeItens().size();
        }

        System.out.println("=== Relatório de Vendas ===");
        System.out.println("Total de Vendas: R$ " + totalVendas);
        System.out.println("Total de Itens Vendidos: " + totalItensVendidos);
        System.out.println("Total de Pedidos: " + pedidos.size());
    }
}
