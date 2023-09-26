package exercicio03;

public class TestaTributavel {

    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente();

        corrente.depositar(1000);
        corrente.obterSaldo();
        corrente.sacar(500);
        corrente.calculaTributos();
        corrente.obterSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        GerenciadorDeImpostoDeRenda gerenciaImposto = new GerenciadorDeImpostoDeRenda();

        contaCorrente.depositar(10000);
        contaPoupanca.depositar(2);

        gerenciaImposto.adicionar(contaCorrente);
        gerenciaImposto.adicionar(contaPoupanca);
        gerenciaImposto.adicionar(seguroDeVida);

        System.out.println("Total de tributos a pagar: R$" + gerenciaImposto.getTotalTributos());
    }

}
