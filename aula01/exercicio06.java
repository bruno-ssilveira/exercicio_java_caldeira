import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade abaixo: ");
        int idade = leitor.nextInt();

        if (idade < 16) {
            System.out.println("Você tem menos que 16 anos, não está apto a votar.");
        }

        if (idade >= 16 && idade <= 17) {
            System.out.println("Você pode votar, entre 16 e 17 anos o voto é facultativo.");
        }

        if (idade > 65) {
            System.out.println("Você pode votar, acima de 65 anos o voto é facultativo.");
        }

        if (idade >= 18 && idade <= 65) {
            System.out.println("Você tem entre 18 e 65 anos, o voto é obrigatório.");
        }

    }

}
