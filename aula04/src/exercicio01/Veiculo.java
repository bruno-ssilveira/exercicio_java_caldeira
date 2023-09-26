package exercicio01;

public abstract class Veiculo {
    public String marca;
    public int modelo;
    public int ano;

    public abstract void calculaCustoViagem(int distance);
}