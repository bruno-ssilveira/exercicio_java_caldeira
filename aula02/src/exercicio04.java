import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                            Calculadora
                    
                Aplique os dois números da operação abaixo.
                """);

        System.out.println("Primeiro número: ");
        double n1 = leitor.nextDouble();

        System.out.println("Segundo número: ");
        double n2 = leitor.nextDouble();

        System.out.println("""
                    Escolha a Operação
                    
                    1 para Divisão
                    2 para Multiplicação
                    3 para Soma
                    4 para Subtração
                """);
        int operacao = leitor.nextInt();

        System.out.println("Você deseja continuar a operação? Digite 'n' para cancelar ou 's' para continuar." );
        char ns = leitor.next().charAt(0);

        if (ns == 'n') {
            System.out.println("Operação finalizada");
        }

        if (ns == 's') {

            if (operacao == 1) {
                System.out.println("A divisão de " + n1 + " por " + n2 + " é " + n1 / n2);
            }

            if (operacao == 2) {
                System.out.println("A multiplicação de " + n1 + " por " + n2 + " é " + n1 * n2);
            }

            if (operacao == 3) {
                System.out.println("A soma de " + n1 + " mais " + n2 + " é " + (n1 + n2));
            }

            if (operacao == 4) {
                System.out.println("A subtração de " + n1 + " por " + n2 + " é " + (n1 - n2));
            }

        }

    }

}






