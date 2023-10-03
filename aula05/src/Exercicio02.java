import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Random random = new Random();

        int number = random.nextInt(100);

        int[] lista = new int[10];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(1, 100);
        }

        for (int i : lista) {
            System.out.println(i);
        }

        System.out.println("Insira um número entre 1-100: ");
        int n = leitor.nextInt();

        boolean contem = false;

        for (int i : lista) {
            if (i == n) {
                contem = true;
                break;
            }
        }

        if (contem) {
            System.out.println("Este número contém na lista.");
        } else {
            System.out.println("Este número não contém na lista.");
        }
    }
}