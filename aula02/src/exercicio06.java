import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite abaixo a frase que deseja ser escrita ao contrário: ");
        String frase = leitor.nextLine();

        int caracteres = frase.length();

        String fraseContrario = frase.substring(caracteres, 0);

        System.out.println(fraseContrario);

    }

}
