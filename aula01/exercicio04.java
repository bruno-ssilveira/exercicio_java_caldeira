import java.util.Scanner;
import java.text.DecimalFormat;
public class exercicio04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");

        double salariominimo = 1320;
        System.out.println("Salário mínimo: R$1320.");

        System.out.println("Digite seu salário abaixo: ");
        double salario = leitor.nextDouble();

        System.out.println("Seu salário consiste em " + formato.format(salario / 1320) + " salário(os) mínimos.");

    }

}