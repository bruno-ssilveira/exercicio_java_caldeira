import java.util.Scanner;

public class exercicio05 {

    private static int hora;
    private static int min;
    private static int seg;
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite às horas abaixo, de 00 à 24: (não inclua os minutos)");
        hora = leitor.nextInt();

        if (hora <= 24 && hora >= 00) {
            System.out.println("Digite os minutos abaixo, de 00 à 60: (não inclua os segundos)");
            min = leitor.nextInt();

            if (min <= 60 && min >= 00) {
                System.out.println("Digite os segundos abaixo, de 00 à 60: ");
                seg = leitor.nextInt();

                if (seg <= 60 && seg >= 00) {
                    int segPosMeiaNoite = (hora * 3600) + (min * 60) + seg;
                    System.out.println("Após a meia noite se passaram " + segPosMeiaNoite + " segundo(os).");

                    int segParaMeiaNoite = (24 * 3600) - segPosMeiaNoite;
                    System.out.println("Faltam " + segParaMeiaNoite + " segundo(os) para a meia noite.");
                } else {
                    System.out.println("Digite os segundos com formato de 00 à 60, caso contrário não funcionará.");
                }
            } else {
                System.out.println("Digite os minutos com formato de 00 à 60, caso contrário não funcionará.");
            }

        } else {
            System.out.println("Digite às horas com formato de 00 à 24, sem incluir minutos ou segundos, caso contrário não funcionará.");
        }

    }

}