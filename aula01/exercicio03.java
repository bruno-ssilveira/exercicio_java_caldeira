import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número abaixo: ");
        int n1 = leitor.nextInt();

        System.out.println("Digite o segundo número abaixo: ");
        int n2 = leitor.nextInt();

        System.out.println("Digite o terceiro número abaixo: ");
        int n3 = leitor.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("O maior número é: " + n1);
            }
        } else if (n2 > n3) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n3);
        }

        if (n1 < n2) {
            if (n1 < n3) {
                System.out.println("O menor número é: " + n1);
            }
        } else if (n2 < n3) {
            System.out.println("O menor número é: " + n2);
        } else {
            System.out.println("O menor número é: " + n3);
        }

        System.out.println("A média aritmética entre os três números é: " + (n1 + n2 + n3) / 3);
    }

}