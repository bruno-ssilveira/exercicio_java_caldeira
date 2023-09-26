package exercicio01;

public class Carro extends Veiculo {
    private double taxaCarro = 0.20;

    @Override
    public void calculaCustoViagem(int distance) {
        double custoViagem = taxaCarro * distance;
        System.out.println("O custo da viagem é de: R$" + custoViagem + " pelos quilômetros rodados.");
    }

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        carro.calculaCustoViagem(100);
    }
}