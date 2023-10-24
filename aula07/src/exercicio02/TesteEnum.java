package exercicio02;

import java.util.Scanner;

public class TesteEnum {

    enum DiaDaSemana {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA;
    }

    public void escolherDiaDaSemana() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String dia = leitor.nextLine().toUpperCase();

        if (dia.equals(DiaDaSemana.SEGUNDA.toString())) {
            System.out.println("segundou");
        } else if (dia.equals(DiaDaSemana.TERCA.toString())) {
            System.out.println("terçou");
        } else if (dia.equals(DiaDaSemana.QUARTA.toString())) {
            System.out.println("quartou");
        } else if (dia.equals(DiaDaSemana.QUINTA.toString())) {
            System.out.println("quintou");
        } else if (dia.equals(DiaDaSemana.SEXTA.toString())) {
            System.out.println("sextou");
        } else {
            System.out.println("Dia da semana inválido.");
        }

    }

}