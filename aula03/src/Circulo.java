import java.text.DecimalFormat;

public class Circulo {
    private double raio;
    private double area;
    private double circunferencia;

    public double getRaio() {
        return this.raio;
    }
    public double getArea() {
        return this.area;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calculaArea() {
        this.area = Math.round(Math.PI * this.raio * this.raio);
        System.out.println("A área do círculo é: " + area);
    }

    public void calculaCircunferencia() {
        this.circunferencia = Math.round(2 * Math.PI * this.raio);
        System.out.println("A circunferência do círculo é: " + circunferencia);
    }

    public void definirRaio(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
        } else {
            System.out.println("O raio deve ter um valor positivo.");
        }
    }

    public void theCircle() {
        System.out.println("\n***************" + "\nO CÍRCULO" + "\nPossui um raio de: " + this.raio + "\nUma área de: " + this.area + "\nE uma circunferência de: " + this.circunferencia + "\n***************");

    }

    public void sameCircle(double compare) {
        if (this.raio == compare) {
            System.out.println("Os círculos são iguais, possuem o mesmo raio.");
        } else {
            System.out.println("Os círculos são diferentes, não possuem o mesmo raio.");
        }
    }

    public void diameter() {
        double diameter = Math.round(this.raio * 2);
        System.out.println("O diâmetro do círculo é: " + diameter);
    }

    public void shadowArea(double area1, double area2) {
        if (area1 > area2) {
            double shadowArea = Math.round(Math.PI * (area1 - area2));
            System.out.println("\nA área sombreada entre os dois círculos concêntricos de diferentes raios é: " + shadowArea);
        } else if (area2 > area1) {
            double shadowArea = Math.round(Math.PI * (area2 - area1));
            System.out.println("\nA área sombreada entre os dois círculos concêntricos de diferentes raios é: " + shadowArea);
        }
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);
        circulo1.definirRaio(6);
        circulo1.calculaArea();
        circulo1.calculaCircunferencia();
        circulo1.theCircle();
        circulo1.diameter();
        Circulo circulo2 = new Circulo(5);
        circulo2.calculaArea();
        circulo2.calculaCircunferencia();
        circulo2.theCircle();
        circulo2.sameCircle(circulo1.getRaio());
        circulo1.shadowArea(circulo1.getArea(), circulo2.getArea());
    }
}
