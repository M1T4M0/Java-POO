package Ejercicio2;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String id, String nombre, double salarioBase, double bono) {
        super(id, nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
