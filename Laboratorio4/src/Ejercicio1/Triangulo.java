package Ejercicio1;

public class Triangulo extends Figuras {
    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s* (s - lado1) * (s - lado2) * (s - lado3)); 
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularSubPerimetro() {
        return calcularPerimetro() / 2;
    }
}
