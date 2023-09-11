import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase abaixo: ");
        String frase = leitor.nextLine();

        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';

        int contagem = 0;

        for (int x = 0; x < frase.length(); x++) {
            char letra = frase.charAt(x);

            if (letra == a) {
                contagem++;
            }
            if (letra == e) {
                contagem++;
            }
            if (letra == i) {
                contagem++;
            }
            if (letra == o) {
                contagem++;
            }
            if (letra == u) {
                contagem++;
            }
        }

        System.out.println("A escrita contém " + contagem + " vogais.");
    }

}