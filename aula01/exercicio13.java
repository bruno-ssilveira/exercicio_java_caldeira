import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro não negativo abaixo para saber o fatorial dele: ");
        int numero = leitor.nextInt();

        long x = 1;

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                x *= i;
            }

            System.out.println("O Fatorial de " + numero + " é " + x);
        } else {
            System.out.println("Digite somente números positivos.");
        }

        System.out.println("""
                
                Números acima de 25 podem apresentar resultados inconsistentes.
                """);
    }

}