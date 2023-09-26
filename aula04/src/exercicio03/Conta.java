package exercicio03;

import java.sql.SQLOutput;

public class Conta {
    protected double saldo;

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito efetuado!");
    }

    public void obterSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }
}
