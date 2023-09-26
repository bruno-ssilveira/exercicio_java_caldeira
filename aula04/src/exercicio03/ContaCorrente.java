package exercicio03;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double calculaTributos() {
        double taxa = this.saldo * 0.1;
        this.saldo -= taxa;
        return taxa;
    }
}
