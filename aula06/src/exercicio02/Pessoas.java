package exercicio02;

import java.util.HashMap;
import java.util.Scanner;

public class Pessoas {
    HashMap<String, Integer> pessoas = new HashMap<>();

    public void inserirPessoasNaLista() {
        boolean play = true;

        while(play) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Nome da pessoa para inserir na lista: ");
            String pessoa = leitor.nextLine().toLowerCase();

            System.out.println("Idade da pessoa para inserir na lista: ");
            int idade = leitor.nextInt();

            pessoas.put(pessoa, idade);

            System.out.println("Deseja continuar? s/n");
            char continuar = leitor.next().charAt(0);
            if (continuar == 'n') {
                play = false;
            } else {
                System.out.println("Segue o baile.\n");
            }
        }
    }

    public void buscarIdadeDaPessoa() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome da pessoa que deseja saber a idade: ");
        String nomeIdade = leitor.nextLine().toLowerCase();

        if(pessoas.containsKey(nomeIdade)) {
            int idade = pessoas.get(nomeIdade);
            System.out.println("\n" + nomeIdade + " tem " + idade + " anos.");
        } else {
            System.out.println("Este nome não contém na lista.");
        }
    }

    public void imprimirTerceiraIdade() {
        System.out.println("Lista de pessoas na terceira idade: \n");

        for (HashMap.Entry<String, Integer> be : pessoas.entrySet()) {
            if (be.getValue() >= 60) {
                System.out.println(be.getKey() + ", " + be.getValue() + " anos.");
            }
        }
    }
}
