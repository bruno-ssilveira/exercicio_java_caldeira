package exercicio03;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, String> listaTelefonica = new TreeMap<>();

        Scanner reader = new Scanner(System.in);

        Agenda newContact;

        boolean play = true;

        while(play) {
            System.out.println("""
                    OPÇÕES
                    1) Adicionar contato.
                    2) Ver a lista de contatos.
                    3) Ver a lista por Zona de Localidade.
                    4) Sair.
                    """);
            String option = reader.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.println("Nome: ");
                    String name = reader.nextLine();

                    System.out.println("Número de telefone: ");
                    String phoneNumber = reader.nextLine();

                    System.out.println("Endereço: ");
                    String address = reader.nextLine();

                    System.out.println("Zona de localidade: ");
                    String zone = reader.nextLine();

                    newContact = new Agenda(name, phoneNumber, address, zone);

                    listaTelefonica.put(newContact.getName(), newContact.getPhoneNumber());
                }
                case "2" -> {
                    System.out.println("\nCONTACT LIST\n");
                    for (String contact : listaTelefonica.keySet()) {
                        String phone = listaTelefonica.get(contact);
                        System.out.println("Nome: " + contact + ", Telefone: " + phone);
                    }
                }
                case "3" -> {
                    System.out.println("burnout");
                }
                case "4" -> {
                    play = false;
                }
                default -> {
                    System.out.println("As opções são 1, 2 ou 3.");
                }
            }
        }
    }

}
