package exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Insira um número inteiro: ");
            int n1 = leitor.nextInt();
            System.out.println("Insira um número inteiro: ");
            int n2 = leitor.nextInt();

            if (n1 <= 0) {
                throw new IllegalArgumentException("Número digitado não é inteiro.");
            } else if (n2 <= 0) {
                throw new IllegalArgumentException("Número digitado não é inteiro.");
            }

            if (n1 > 0 && n2 > 0) {
                System.out.println("Inteiro " + n1 + ", Inteiro " + n2);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }

}
