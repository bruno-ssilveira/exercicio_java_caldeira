import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    public Calculadora calculadora = new Calculadora();

    @Test
    void somarComSucesso(){
        double soma = calculadora.soma(1, 2);
        Assertions.assertEquals(3, soma);
    }

    @Test
    void subtracaoComSucesso(){
        double subtracao = calculadora.subtracao(1, 2);
        Assertions.assertEquals(-1, subtracao);
    }

    @Test
    void multiplicacaoComSucesso(){
        double multiplicacao = calculadora.multiplicacao(1, 2);
        Assertions.assertEquals(2, multiplicacao);
    }

    @Test
    void divisaoComSucesso(){
        double divisao = calculadora.divisao(1, 2);
        Assertions.assertEquals(0.5, divisao);
    }

    @Test
    void raizQuadradaComSucesso(){
        double raizQuadrada = calculadora.raizQuadrada(4);
        Assertions.assertEquals(2, raizQuadrada);
    }

    @Test
    void potenciaComSucesso(){
        double potencia = calculadora.potencia(3, 2);
        Assertions.assertEquals(9, potencia);
    }
}