public abstract class Veiculo {
    public String marca;
    public int modelo;
    public int ano;

    public void calculaCustoViagem(int distance) {
        double custo = 0 * distance;
        System.out.println("O custo para a viagem é de: R$" + custo + " pelos quilômetros rodados.");
    }
}