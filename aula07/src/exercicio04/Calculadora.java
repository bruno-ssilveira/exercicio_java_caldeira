package exercicio04;

import java.util.Scanner;

public class Calculadora implements Calculavel {

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
            String tipoCalculo = leitor.nextLine().toUpperCase();

            if (tipoCalculo.equals(Operacao.SOMAR.toString())) {
                somar();
            } else if (tipoCalculo.equals(Operacao.SUBTRAIR.toString())) {
                System.out.println("Primeiro número: ");
                int n1 = leitor.nextInt();
                System.out.println("Segundo número: ");
                int n2 = leitor.nextInt();

                int subtracao = n1 - n2;
                System.out.println("A subtração entre " + n1 + " e " + n2 + " é " + subtracao);

            } else if (tipoCalculo.equals(Operacao.MULTIPLICAR.toString())) {
                System.out.println("Primeiro número: ");
                int n1 = leitor.nextInt();
                System.out.println("Segundo número: ");
                int n2 = leitor.nextInt();

                int multiplicacao = n1 * n2;
                System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é " + multiplicacao);

            } else if (tipoCalculo.equals(Operacao.DIVIDIR.toString())) {
                System.out.println("Primeiro número: ");
                int n1 = leitor.nextInt();
                System.out.println("Segundo número: ");
                int n2 = leitor.nextInt();

                int divisao = n1 / n2;
                System.out.println("A divisão entre " + n1 + " e " + n2 + " é " + divisao);
            } else if (tipoCalculo.equals("SAIR")) {
                play = false;
            }
        }
    }

    @Override
    public void somar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.println("Segundo número: ");
        int n2 = leitor.nextInt();

        try {
            if (n1 > 0 && n2 > 0) {
                int soma = n1 + n2;
                System.out.println("A soma entre " + n1 + " e " + n2 + " é " + soma);
            } else {
                throw new IllegalArgumentException("Número digitado não é inteiro.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    @Override
    public void subtrair() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.println("Segundo número: ");
        int n2 = leitor.nextInt();

        int subtracao = n1 - n2;
        System.out.println("A subtração entre " + n1 + " e " + n2 + " é " + subtracao);

        leitor.close();
    }

    @Override
    public void multiplicar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.println("Segundo número: ");
        int n2 = leitor.nextInt();

        int multiplicacao = n1 * n2;
        System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é " + multiplicacao);

        leitor.close();
    }

    @Override
    public void dividir() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Primeiro número: ");
        int n1 = leitor.nextInt();
        System.out.println("Segundo número: ");
        int n2 = leitor.nextInt();

        int divisao = n1 / n2;
        System.out.println("A divisão entre " + n1 + " e " + n2 + " é " + divisao);

        leitor.close();
    }
}
