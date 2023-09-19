import java.time.LocalTime;
public class ContaBancaria {
        private String nome;
        private int cpf;
        private int indentificadorConta;
        private String banco;
        private String endereco;
        private double saldo;
        private double horarioAtual;

        LocalTime hora = LocalTime.now();

        public void saque(double valor) {
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                } else {
                        System.out.println("Saldo insuficiente!");
                }
        }

        public void deposito(double valor) {
            this.saldo = saldo + valor;
        }

        public void pix(double valor, ContaBancaria destino) {
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                        destino.deposito(valor);
                } else {
                        System.out.println("Saldo insuficiente!");
                }
        }
}










