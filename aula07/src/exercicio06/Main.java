package exercicio06;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(100);

        try {
            conta.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.err.println(e.getMessage());
        }
    }

}
