import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
public class ContaBancaria {
        private String nome;
        private String cpf;
        private int indetificadorConta;
        private String banco;
        private String endereco;
        private double saldo;
        private double taxaDeManutencaoMensal;

        public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco) {
                this.nome = nome;
                this.cpf = cpf;
                this.indetificadorConta = identificadorConta;
                this.banco = banco;
                this.endereco = endereco;
        }

        public LocalTime horarioAtual = LocalTime.now();
        public LocalTime manha = LocalTime.of(8, 00);
        public LocalTime noite = LocalTime.of(19, 00);
        boolean antes = horarioAtual.isBefore(noite);
        boolean depois = horarioAtual.isAfter(manha);

        public LocalDate dataAtual = LocalDate.now();

        ArrayList<String> listaDeTransacoes = new ArrayList<String>();

        public void adicionaTransacao(String transacao) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String dataHora = String.valueOf(LocalDateTime.now());
                listaDeTransacoes.add(dataHora + " - " + transacao);
        }

        public void historicoDeTransacao() {
                if (listaDeTransacoes.isEmpty()) {
                        System.out.println("Não há operações registradas.");
                } else {
                        System.out.println("Histórico de transações: ");
                        for (String transacao : listaDeTransacoes) {
                                System.out.println(transacao);
                        }
                }
        }

        public void saque(double valor) {
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                } else {
                        System.out.println("Saldo insuficiente!");
                }
                adicionaTransacao("Saque de R$" + valor);
        }

        public void deposito(double valor) {
            this.saldo = saldo + valor;
            adicionaTransacao("Deposito de R$" + valor);
        }

        public void pix(double valor, ContaBancaria destino) {
                if (this.saldo >= valor) {
                        this.saldo -= valor;
                        destino.deposito(valor);
                        System.out.println("Pix realizado com sucesso! " + horarioAtual);
                        adicionaTransacao("Pix realizado de R$" + valor);
                } else {
                        System.out.println("Saldo insuficiente!");
                }
        }

        public void transferencia(double valor, ContaBancaria destino) {

                if (this.saldo >= valor) {
                        if (antes && depois) {
                                this.saldo -= valor;
                                destino.deposito(valor);
                                adicionaTransacao("Transferência realizada de R$" + valor);
                        } else {
                                System.out.println("Fora do horário de funcionamento do Banco! [8h-18h]");
                        }
                } else {
                        System.out.println("Saldo insuficiente!");
                }

        }

        public void verificarSaldo() {
                System.out.println("O saldo atual é de: R$" + this.saldo);
        }

        public void verificarHorario() {
                System.out.println(horarioAtual);
        }

        public void verificarInformacoes() {
                System.out.println("Nome: " + this.nome + System.lineSeparator() + "CPF " + this.cpf + System.lineSeparator() + "Conta: " + this.indetificadorConta + System.lineSeparator() + "Banco " + this.banco + System.lineSeparator() + "Endereço: " + this.endereco + System.lineSeparator() + "Saldo: R$" + this.saldo);
        }

        public boolean validaCpf(String cpf) {
                if (cpf.length() != 11) {
                        return false;
                } else {
                        return true;
                }
        }

       public void alterarEndereco(String novoEndereco) {
                this.endereco = novoEndereco;
       }

        public String getEndereco() {
                return this.endereco;
        }

        public double getTaxaDeManutencaoMensal() {
                return taxaDeManutencaoMensal;
        }

        public void setTaxaDeManutencaoMensal(double taxaDeManutencaoMensal) {
                this.taxaDeManutencaoMensal = taxaDeManutencaoMensal;
        }

        public void descontaTaxaManutencaoMensal() {
                if (dataAtual.getDayOfMonth() == 1) {
                        this.saldo -= taxaDeManutencaoMensal;
                }
        }

        public void calcularJuros(double taxa) {
                if (dataAtual.getDayOfMonth() == 1) {
                        this.saldo *= taxa;
                }
        }

        public void fecharConta() {
                this.saldo = 0;
                if (saldo > 0) {
                        this.saldo = 0;
                        System.out.println("Esta conta não existe!");
                }
        }
}