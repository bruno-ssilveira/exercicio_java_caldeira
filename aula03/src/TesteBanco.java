public class TesteBanco {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Bruno", "888.888.888-77", 12, "Bitcoin", "Home");

        conta.deposito(100);
        conta.verificarSaldo();

        ContaBancaria conta2 = new ContaBancaria("Eu Novamente", "888.888.888-88", 13, "Ethereum", "House");

        conta.transferencia(100, conta2);
        conta2.verificarSaldo();
        conta.verificarSaldo();

        conta2.pix(50, conta);

        conta2.verificarInformacoes();

        conta.verificarInformacoes();

        conta.alterarEndereco("rua bla");

        System.out.println(conta.getEndereco());

        conta.setTaxaDeManutencaoMensal(5);
        System.out.println(conta.getTaxaDeManutencaoMensal());
        conta.descontaTaxaManutencaoMensal();
        conta.verificarSaldo();

        conta.calcularJuros(0.1);
        conta.verificarSaldo();

        conta.fecharConta();
        conta.deposito(100);
        conta.fecharConta();
        conta.verificarSaldo();

        conta.deposito(1000);
        conta.saque(100);
        conta.pix(100, conta2);
        conta.transferencia(100, conta2);
        conta.historicoDeTransacao();
    }

}