import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos soldados acha que os 300 espartanos irão enfrentar?");
        int soldados = leitor.nextInt();

        int answer = 200000;

        if (soldados < 300000) {
            System.out.println("Um pouco mais!");
        } else if (soldados > 300000){
            System.out.println("Um pouco menos!");
        } else {
            System.out.println("Certo mizeravi!");
        }
    }
}