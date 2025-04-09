package Ejercicio1;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
    public double calcularArea() {
        return Math.PI *radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2* Math.PI *radio;
    }
}
