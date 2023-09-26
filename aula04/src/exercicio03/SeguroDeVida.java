package exercicio03;

public class SeguroDeVida extends Conta implements Tributavel{
    @Override
    public double calculaTributos() {
        return 42;
    }
}
