package Class;

public class Funcionario {

    private String nome;
    private String cargo;
    private int salario;
    private String horasTrabalhadas;

    public Funcionario(String nome, String cargo, int salario, String horasTrabalhadas) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(String horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}
