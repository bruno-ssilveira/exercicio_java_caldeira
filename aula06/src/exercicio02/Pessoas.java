package exercicio02;

import java.util.HashMap;
import java.util.Scanner;

public class Pessoas {
    HashMap<String, Integer> pessoas = new HashMap<>();

    public void inserirPessoasNaLista() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome da pessoa: ");
        String pessoa = leitor.nextLine();

        System.out.println("Idade da pessoa: ");
        int idade = leitor.nextInt();

        pessoas.put(pessoa, idade);
    }

    public void buscarIdadeDaPessoa() {
        Scanner teste = new Scanner(System.in);
        System.out.println("Nome da pessoa que deseja saber a idade: ");
        String nomeIdade = teste.nextLine();

        if(pessoas.containsKey(nomeIdade)) {
            pessoas.get(nomeIdade);
            System.out.println(nomeIdade + " tem ");
        }
    }

}
