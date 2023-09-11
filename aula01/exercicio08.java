import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        System.out.println("""
                    Filas Prioritárias
                                
                1. Gestante, idosa ou PCD.
                2. Nenhuma das alternativas.
                                
                """);

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite abaixo 1 ou 2 conforme se encaixa na descrição: ");
        int fila = leitor.nextInt();

        if (fila == 1) {
            System.out.println("Direito a fila prioritária.");
        } else {
            System.out.println("Não tem direito a fila prioritária");
        }

    }
}