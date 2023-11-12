public class Calculadora {

    public double soma(double n1, double n2) {
        return n1 + n2;
    }

    public double subtracao(double n1, double n2){
        return n1 - n2;
    }

    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    public double divisao(double n1, double n2){
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("O divisor precisa ser diferente de 0");
            return 0.00;
        }
    }

    public double raizQuadrada(double n1){
        if(n1 > 0) {
            return Math.sqrt(n1);
        } else {
            System.out.println("O radicando precisa ser maior que 0");
            return 0.00;
        }
    }

    public double potencia(double n1, double n2){
        return Math.pow(n1, n2);
    }

}