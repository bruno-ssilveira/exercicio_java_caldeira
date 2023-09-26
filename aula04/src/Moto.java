public class Moto extends Veiculo {

    @Override
    public void calculaCustoViagem(int distance) {
        double custo = 0.15 * distance;
        System.out.println("O custo para a viagem é de: R$" + custo + " pelos quilômetros rodados.");
    }

    public static void main(String[] args) {
        Veiculo moto = new Moto();
        moto.calculaCustoViagem(100);
    }
}