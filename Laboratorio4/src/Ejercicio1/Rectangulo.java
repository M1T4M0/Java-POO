package Ejercicio1;

public class Rectangulo extends Figuras {
    private double base;
    private double altura;

   
    public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2* (base+altura);
    }
}
