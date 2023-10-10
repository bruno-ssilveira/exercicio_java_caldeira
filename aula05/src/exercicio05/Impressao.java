package exercicio05;

public class Impressao {

    private String nome;
    private int numeroDePaginas;

    public Impressao(String nome, int numeroDePaginas) {
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumeroDePaginas() {
        return this.numeroDePaginas;
    }
}
