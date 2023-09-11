import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.println("Digite abaixo uma temperatura em graus Celcius para receber a conversão em graus Fahrenheit: ");
        double grausCelsius = leitor.nextDouble();

        System.out.println("A temperatura em graus Fahrenheit é " + formato.format((grausCelsius * 9/5) + 32) + " °F");

    }

}
