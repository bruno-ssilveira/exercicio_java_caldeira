import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                    Sicredi Consórcios
                
                Antes de iniciar a compra de um automóvel, precisamos de algumas informações.
                """);

        System.out.println("Primeiro, digite abaixo a sua idade: ");
        int idade = leitor.nextInt();

        if (idade < 18) {
            System.out.println("Você precisa ser de maior para iniciar a compra de um automóvel na Sicredi Consórcios. Ficaremos felizes em ajudar quando completar seus 18 anos!");
        }

    }

}
