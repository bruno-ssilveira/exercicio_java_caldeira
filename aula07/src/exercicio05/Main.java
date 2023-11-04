package exercicio05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Insira sua idade: ");
            int idade = leitor.nextInt();

            if (idade > 0 && idade < 150) {
                System.out.println("Idade salva! " + idade + "anos.");
            } else {
                throw new IdadeInvalidaException("Idade inválida!");
            }
        } catch (IdadeInvalidaException e){
            System.err.print(e.getMessage());
        }

    }

}
