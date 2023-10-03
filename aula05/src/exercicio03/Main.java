package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<Tarefa> listaTarefas = new ArrayList<>();

        boolean loop = true;

        while (loop) {
            System.out.println("""
                    Opções:
                                        
                    a) Criar tarefa.
                    b) Exibir tarefas.
                    c) Remover tarefa.
                    d) Sair.
                                        
                    Digite a, b, c ou d:
                    """);
            String opcao = leitor.nextLine();

            switch (opcao) {
                case "a" -> {
                    System.out.println("Digite o nome da tarefa:");
                    String nomeTarefa = leitor.nextLine();
                    System.out.println("Digite a data para a tarefa:");
                    String dataTarefa = leitor.nextLine();
                    System.out.println("Digite a descrição para a tarefa");
                    String descricaoTarefa = leitor.nextLine();
                    Tarefa tarefa = new Tarefa(nomeTarefa, dataTarefa, descricaoTarefa);
                    System.out.println("Tarefa adicionada!");
                    listaTarefas.add(tarefa);
                }
                case "b" -> {
                    for (Tarefa tarefas : listaTarefas) {
                        System.out.println("Tarefa: " + tarefas.getTitulo() + " -- " + "Data: " + tarefas.getData() + " -- " + "Descrição: " + tarefas.getDescricao());
                    }
                    System.out.println(listaTarefas.get(0));
                    System.out.println(listaTarefas.get(1));
                }
                case "c" -> {
                    System.out.println("Digite o nome da tarefa a ser removida");
                    String remova = leitor.nextLine();

                    boolean removido = false;

                    for (Tarefa i : listaTarefas) {
                        if (i.getTitulo().equalsIgnoreCase(remova)) {
                            listaTarefas.remove(i);
                            System.out.println("Objeto removido!");
                            removido = true;
                        }
                    }

                    if (!removido) {
                        System.out.println("Objeto não encontrado na lista.");
                    }
                }
                case "d" -> loop = false;
            }
        }
    }
}