//adicionar item, remover item, exibir lista
package exercicio04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Compra> listaDeCompras = new ArrayList<>();

        boolean loop = true;

        while (loop) {
            System.out.println("""
                    OPÇÕES DA LISTA
                                        
                    a) Adicionar item.
                    b) Remover item.
                    c) Exibir a lista.
                    d) Sair.
                                        
                    """);
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "a" -> {
                    System.out.println("Digite o nome do item para adicionar:");
                    String nomeItem = leitor.nextLine();

                    System.out.println("Digite a data de validade do item:");
                    String dataValidade = leitor.nextLine();

                    Compra compra = new Compra(nomeItem, dataValidade);

                    listaDeCompras.add(compra);
                }
                case "b" -> {
                    System.out.println("Digite o nome do item que deseja remover da lista:");
                    String removeItem = leitor.nextLine();

                    Iterator<Compra> iterator = listaDeCompras.iterator();

                    boolean removido = false;

                    while (iterator.hasNext()) {
                        Compra compra = iterator.next();
                            if (compra.getNome().equalsIgnoreCase(removeItem)) {
                                iterator.remove();
                                System.out.println("Item removido!");
                                removido = true;
                            }
                    }

                    if (!removido) {
                        System.out.println("Item não encontrado na lista.");
                    }
                }
                case "c" -> {
                    for (Compra compras : listaDeCompras) {
                        System.out.println("Item: " + compras.getNome() + " -- Data de Validade: " + compras.getDataDeValidade());
                    }
                }
                case "d" -> loop = false;
            }
        }
    }
}