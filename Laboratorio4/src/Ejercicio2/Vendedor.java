package Ejercicio2;

public class Vendedor extends Empleado {
    private double totalVentas;

    public Vendedor(String id, String nombre, double salarioBase, double totalVentas) {
        super(id, nombre, salarioBase);
        this.totalVentas = totalVentas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVentas * 0.05);
    }
}
