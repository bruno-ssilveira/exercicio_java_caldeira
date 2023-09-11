import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite abaixo seu ano de nascimento: ");
        int anoNascimento = leitor.nextInt();

        System.out.println("Digite abaixo o ano atual: ");
        int anoAtual = leitor.nextInt();

        System.out.println("Você tem atualmente entre " + (anoAtual - anoNascimento - 1) + " e " + (anoAtual - anoNascimento) + " anos.");

    }

}
