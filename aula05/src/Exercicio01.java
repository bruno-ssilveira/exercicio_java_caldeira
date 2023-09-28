import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        int somaNumeros = 0;

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite o primeiro número: ");
        int number1 = leitor.nextInt();
        numeros[0] = number1;

        System.out.println("Digite o segundo número: ");
        int number2 = leitor.nextInt();
        numeros[1] = number2;

        System.out.println("Digite o terceiro número: ");
        int number3 = leitor.nextInt();
        numeros[2] = number3;

        System.out.println("Digite o quarto número: ");
        int number4 = leitor.nextInt();
        numeros[3] = number4;

        System.out.println("Digite o quinto número: ");
        int number5 = leitor.nextInt();
        numeros[4] = number5;

        for (int numero : numeros) {
            somaNumeros += numero;
        }

        System.out.println("A soma dos números é: " + somaNumeros);

        System.out.println("A média dos números é: " + somaNumeros / numeros.length);
    }
}