public class teste {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.deposito(100);
        conta.verificarSaldo();

        ContaBancaria conta2 = new ContaBancaria();

        conta.transferencia(100, conta2);
        conta2.verificarSaldo();
        conta.verificarSaldo();

        conta2.pix(50, conta);

        conta2.verificarInformacoes();

        conta.iniciarConta("bruno", 888888888-88, 123, "Banri", "rua blabla");

        conta.verificarInformacoes();

        conta.alterarEndereco("rua bla");

        System.out.println(conta.getEndereco());
    }

}
