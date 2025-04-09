package Ejercicio2;

public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected double salarioBase;

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}
