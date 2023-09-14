import java.util.Scanner;

public class exercicio01 {

    private static int n1;
    private static int n2;


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextInt();

        while (n1 < n2) {

            int primos = n1 + 1;
            System.out.println(primos);
            n1 += 1;
        }

    }
}