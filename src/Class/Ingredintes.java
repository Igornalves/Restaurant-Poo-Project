package Class;

public class Ingredintes {

    private String nome;
    private int qunatidade;

    public Ingredintes(String nome, int qunatidade) {
        this.nome = nome;
        this.qunatidade = qunatidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQunatidade() {
        return qunatidade;
    }

    public void setQunatidade(int qunatidade) {
        this.qunatidade = qunatidade;
    }
}
