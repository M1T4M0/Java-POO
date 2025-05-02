package ClasesActividad6;

public class Repartidor extends Empleado {
    private int numeroRepartos;
    private char zona;

    public Repartidor(String id, String nombre, int edad, int añoIngreso, double salarioBasico, int numeroRepartos, char zona) {
        super(id, nombre, edad, añoIngreso, salarioBasico);
        this.numeroRepartos = numeroRepartos;
        this.zona = zona;
    }

    private void validarZona() {
        if (zona != 'A' && zona != 'B' && zona != 'C') {
            zona = 'C'; // deje la zona C como por decfecto  para que funcione
        }
    }

    public double calcularValorRepartos() {
        return numeroRepartos * 10000;
    }

    @Override
    public double calcularBonificacion() {
        return (Antiguedad() > 5 && zona == 'C') ? 50000 : 0;
    }
    @Override
    public double liquidarNomina() {
       validarZona(); 
    	    double total = salarioBasico + calcularValorRepartos() + calcularBonificacion();
    	    return total * 0.90; //Descuenta el 10%
    	}

    
    @Override
    public String toString() {
    return "Repartidor: " + super.toString() +
      ", Repartos: " + numeroRepartos +
        ", Valor Repartos: $" + calcularValorRepartos() +
          ", Descuentos: $" + calcularBonificacion() +
             ", Neto Pagado: $" + liquidarNomina();
        }

    }

