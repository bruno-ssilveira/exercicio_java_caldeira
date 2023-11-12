import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class exercicio01 {

    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<>();

        pessoas.add("Pessoa1");
        pessoas.add("Pessoa2");
        pessoas.add("Pessoa2");
        pessoas.add("Pessoa2");
        pessoas.add("Pessoa3longa");
        pessoas.add("Pessoa4");
        pessoas.add("Pessoa1");
        pessoas.add("Pessoa5");
        pessoas.add("Pessoa5");
        pessoas.add("Pessoa6");

        System.out.println("O número total de strings na lista é: " + pessoas.stream().count());
        System.out.println("A string mais longa da lista é: " + pessoas.stream().max(Comparator.comparing(String::length)).get());

        Map<Object, Long> repeticaoString = pessoas.stream()
                .collect(Collectors.groupingBy(string -> string, Collectors.counting()));

        Map<Object, Long> maisFrequentes = repeticaoString.entrySet().stream()
                .sorted(Map.Entry.<Object, Long>comparingByValue().reversed())
                .limit(5).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("cinco mais frequentes: ");
        maisFrequentes.forEach((string, vezes) ->  {
            System.out.println(string + ", " + vezes + " vezes");
        });
    }

}
