package exercicio05;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        LinkedList<Impressao> listaDeImpressao = new LinkedList<>();

        boolean loop = true;
        while (loop) {
            System.out.println("""
                    \nOPÇÕES
                                    
                    a) Adicionar documento a fila de impressão.
                    b) Imprimir documentos da fila de impressão.
                    c) Sair.
                    """);
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "a" -> {
                    System.out.println("Nome do documento:");
                    String nomeDocumento = leitor.nextLine();
                    System.out.println("Número de páginas:");
                    int numeroPaginas = leitor.nextInt();

                    Impressao impressao = new Impressao(nomeDocumento, numeroPaginas);
                    listaDeImpressao.add(impressao);
                }
                case "b" -> {
                    System.out.println("Imprimindo documentos:");

                    for (Impressao i : listaDeImpressao) {
                        System.out.println(i.getNome());
                    }
                }
                case "c" -> loop = false;
            }
        }
    }
}