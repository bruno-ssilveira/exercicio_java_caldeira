import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                    Conversão de Câmbio
                
                    Dólar para Real.
                """);

        System.out.println("Digite abaixo quantos dólares deseja fazer a conversão: ");
        double dol = leitor.nextDouble();

        System.out.println("Digite abaixo a taxa de câmbio atual: ");
        double taxa = leitor.nextDouble();

        System.out.println("A conversão desta quantia de dólar para real é de R$" + dol * taxa + " reais.");

    }

}
