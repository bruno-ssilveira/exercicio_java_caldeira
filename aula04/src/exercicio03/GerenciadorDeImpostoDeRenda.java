package exercicio03;

public class GerenciadorDeImpostoDeRenda {

    private double totalTributos;

    public void adicionar(Tributavel tributavel) {
        totalTributos += tributavel.calculaTributos();
    }

    public double getTotalTributos() {
        return totalTributos;
    }

}
