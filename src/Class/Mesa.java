package Class;

public class Mesa {

    private int numero;
    private int capacidade;
    private boolean ocupada;

    public Mesa(int numero, int capacidade, boolean ocupada) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.ocupada = ocupada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
