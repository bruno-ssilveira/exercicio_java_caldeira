package exercicio01;

public class Moto extends Veiculo {
    double taxaMoto = 0.15;

    @Override
    public void calculaCustoViagem(int distance) {
        double custoViagem = taxaMoto * distance;
        System.out.println("O custo da viagem é de: R$" + custoViagem + " pelos quilômetros rodados.");
    }

    public static void main(String[] args) {
        Veiculo moto = new Moto();
        moto.calculaCustoViagem(100);
    }
}