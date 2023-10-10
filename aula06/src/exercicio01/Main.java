package exercicio01;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Stack<Livros> pilha = new Stack<>();

        int tamanhoPilha = 5;
        for (int i = 0; i < tamanhoPilha; i++) {
            System.out.println("Nome do livro:");
            String nomeLivro = leitor.nextLine();
            System.out.println("Categoria do livro:");
            String categoriaLivro = leitor.nextLine();

            Livros livro = new Livros(nomeLivro,categoriaLivro);
            pilha.push(livro);
        }

        for (Livros i : pilha) {
            System.out.println("\nLivro: " + i.getTitulo());
        }

        System.out.println("\nQual categoria de livros deseja ver? [terror, comedia, suspense, drama, fantasia ou ação]");
        String categoriaLivro = leitor.nextLine();

        for (Livros i : pilha) {
            if (i.getCategoria().equalsIgnoreCase(categoriaLivro)) {
                System.out.println("\nLivro: " + i.getTitulo());
            }
        }

        for (int i = 5; i != 0; i--) {
            pilha.pop();
        }

        System.out.println("Pilha de livros: " + pilha);
    }
}