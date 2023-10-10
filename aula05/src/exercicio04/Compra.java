package exercicio04;

public class Compra {
    private String nome;
    private String dataDeValidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public Compra(String nome, String dataDeValidade) {
        this.nome = nome;
        this.dataDeValidade = dataDeValidade;
    }
}
