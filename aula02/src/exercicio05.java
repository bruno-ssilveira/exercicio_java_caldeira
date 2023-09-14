import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva abaixo a frase que deseja cortar ao meio :]");
        String frase = leitor.nextLine();

        int metade = frase.length() / 2;

        String firsthalf = frase.substring(0, metade);

        System.out.println("Primeira metade da frase: " + firsthalf);

        // usei o chatgpt para descobrir o comando substring(x, x). o primeiro parametro é o inicio e o segundo onde termina.
    }

}
