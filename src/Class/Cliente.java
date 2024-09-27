package Class;

public class Cliente {

    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private int pontosDeFidelidade;

    public Cliente(String nome, String telefone, String email, String endereco, int pontosDeFidelidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.pontosDeFidelidade = pontosDeFidelidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getPontosDeFidelidade() {
        return pontosDeFidelidade;
    }

    public void setPontosDeFidelidade(int pontosDeFidelidade) {
        this.pontosDeFidelidade = pontosDeFidelidade;
    }

}