import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> product = Arrays.asList(
                new Produto("tenis", 1, 2),
                new Produto("meia", 2, 3),
                new Produto("carteira", 3, 4),
                new Produto("relógio", 4, 5),
                new Produto("boné", 6, 7),
                new Produto("cinto", 7, 8),
                new Produto("camisa", 8, 11)
        );

        Produto maisCaro = product.stream()
                .max(Comparator.comparing((Produto::getPreco)))
                .orElse(null);

        if(maisCaro != null){
            System.out.println("produto mais caro: " + maisCaro.getNome() + " e seu preço é R$" + maisCaro.getPreco());
        } else {
            System.out.println("Não há nenhum produto na lista!");
        }

        double total = product.stream()
                .map(produto -> produto.getPreco() * produto.getQuantidade())
                .reduce(0.0, (subtotal, valorProdutoPorQuantidade) -> subtotal + valorProdutoPorQuantidade);

        System.out.println("preço total dos produtos: R$" + total);

        List<Produto> acimaDeDez = product.stream()
                .filter(produto -> produto.getQuantidade() > 10)
                .collect(Collectors.toList());

        System.out.println("produtos com quantidade maior que 10: ");
        acimaDeDez.forEach(produto -> System.out.println(produto.getNome() + ": R$" + produto.getPreco() + ", Quantidade: " + produto.getQuantidade()));
    }
}