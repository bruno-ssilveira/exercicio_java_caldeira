package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<String> listaTarefas = new ArrayList<>();

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

            if (opcao.equals("a")) {
                System.out.println("Digite o nome da tarefa:");
                String nomeTarefa = leitor.nextLine();

                System.out.println("Digite a data para a tarefa:");
                String dataTarefa = leitor.nextLine();

                System.out.println("Digite a descrição para a tarefa");
                String descricaoTarefa = leitor.nextLine();

                System.out.println("Tarefa adicionada!");

                listaTarefas.add("Tarefa: " + nomeTarefa + "\nData: " + dataTarefa + "\nDescrição: " + descricaoTarefa);
            } else if (opcao.equals("b")) {
                for (String tarefas : listaTarefas) {
                    System.out.println(tarefas);
                }
            } else if (opcao.equals("d")){
                loop = false;
            }
        }
    }
}
