package ClasesActividad6;

public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected int edad;
    protected int añoIngreso;
    protected double salarioBasico;

    public Empleado(String id, String nombre, int edad, int añoIngreso, double salarioBasico) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.añoIngreso = añoIngreso;
        this.salarioBasico = salarioBasico;
        
    }
    public int Antiguedad() {
        return 2025 - añoIngreso;
    }

    public double calcularBonificacion() {
        return Antiguedad() > 10 ? salarioBasico * 0.05 : 0;
    }

 
    public abstract double liquidarNomina();

    @Override
    public String toString() {
        return "ID" + id + " Nombre: "+ nombre + ", Edad: " + edad + ", Año Ingreso: " + añoIngreso + ", Salario Base: $" + salarioBasico;
    }

    }

