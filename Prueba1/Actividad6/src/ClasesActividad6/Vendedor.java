package ClasesActividad6;

public class Vendedor extends Empleado {
    private double totalVentas;

    public Vendedor(String id, String nombre, int edad, int añoIngreso, double salarioBasico, double totalVentas) {
        super(id, nombre, edad, añoIngreso, salarioBasico);
        this.totalVentas = totalVentas;
    }

    public double calcularComision() {
        return totalVentas * 0.15;
    }

    @Override
    public double calcularBonificacion() {
        return Antiguedad() > 20 ? 100000 : 0;
    }

    @Override
    public double liquidarNomina() {
        return salarioBasico + calcularComision() + calcularBonificacion();
    }

    @Override
    public String toString() {
        return "Vendedor: "+ super.toString() + ", Ventas: $" + totalVentas + ", Comisión: $" + calcularComision() + ", Descuentos: $" + calcularBonificacion() + ", Neto Pagado: $" + liquidarNomina();
    }

}
