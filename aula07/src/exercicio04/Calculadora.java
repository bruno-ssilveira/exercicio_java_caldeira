package exercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora implements Calculavel {

    private int n1 = 0;
    private int n2 = 0;

    enum Operacao {
        SOMAR,
        SUBTRAIR,
        DIVIDIR,
        MULTIPLICAR
    }

    public void calcular() {
        Scanner leitor = new Scanner(System.in);

        boolean play = true;

        while (play) {
            System.out.println("""
                    
                    
                    CALCULADORA
                                    
                    Digite o calculo desejado: [somar, subtrair, multiplicar, dividir ou sair para finalizar.]
                    
                    """);

            try {
                String tipoCalculo = leitor.nextLine().toUpperCase();

                if (tipoCalculo.equals(Operacao.SOMAR.toString())) {
                    somar();
                } else if (tipoCalculo.equals(Operacao.SUBTRAIR.toString())) {
                    subtrair();
                } else if (tipoCalculo.equals(Operacao.MULTIPLICAR.toString())) {
                    multiplicar();
                } else if (tipoCalculo.equals(Operacao.DIVIDIR.toString())) {
                    dividir();
                } else if (tipoCalculo.equals("SAIR")) {
                    play = false;
                } else {
                    throw new IllegalArgumentException("Erro: a opção escolhida não é válida.");
                }
            } catch (IllegalArgumentException e) {
                System.err.print(e.getMessage());
            }
        }
    }

    @Override
    public void somar() {
        try {
            Scanner somar = new Scanner(System.in);
            System.out.println("Primeiro número: ");
            this.n1 = somar.nextInt();
            System.out.println("Segundo número: ");
            this.n2 = somar.nextInt();

            int soma = n1 + n2;
            System.out.println("A soma entre " + n1 + " + " + n2 + " é " + soma);

        } catch (InputMismatchException e) {
            System.err.println("Erro: número digitado não é inteiro.");
        }
    }

    @Override
    public void subtrair() {
        try {
            Scanner subtrair = new Scanner(System.in);
            System.out.println("Primeiro número: ");
            this.n1 = subtrair.nextInt();
            System.out.println("Segundo número: ");
            this.n2 = subtrair.nextInt();

            int subtracao = n1 - n2;
            System.out.println("A subtração entre " + n1 + " - " + n2 + " é " + subtracao);

        } catch (InputMismatchException e) {
            System.err.println("Erro: número digitado não é inteiro.");
        }
    }

    @Override
    public void multiplicar() {
        try {
            Scanner multiplicar = new Scanner(System.in);
            System.out.println("Primeiro número: ");
            this.n1 = multiplicar.nextInt();
            System.out.println("Segundo número: ");
            this.n2 = multiplicar.nextInt();

            int multiplicacao = n1 * n2;
            System.out.println("A multiplicação entre " + n1 + " x " + n2 + " é " + multiplicacao);

        } catch (InputMismatchException e) {
            System.err.println("Erro: número digitado não é inteiro.");
        }
    }

    @Override
    public void dividir() {
        try {
            Scanner dividir = new Scanner(System.in);
            System.out.println("Primeiro número: ");
            this.n1 = dividir.nextInt();
            System.out.println("Segundo número: ");
            this.n2 = dividir.nextInt();

            try {
                if (n2 != 0) {
                    int divisao = n1 / n2;
                    System.out.println("A divisão entre " + n1 + " / " + n2 + " é " + divisao);
                } else {
                    throw new IllegalArgumentException("Não é possível dividir por zero.");
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Erro: " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.err.println("Erro: número digitado não é inteiro.");
        }
    }
}
