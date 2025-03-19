package ejerciciosTienda;

public class Tipo {
    private boolean esPerecedero;
    private int iva;

    public Tipo(boolean esPerecedero, int iva) {
        this.esPerecedero = esPerecedero;
        this.iva = iva;
    }

    public boolean esPerecedero() { return esPerecedero; }
    public int getIva() { return iva; } 

    @Override
    public String toString() {
        return "Tipo: " + (esPerecedero ? "Perecedero" : "No perecedero") + 
               " | IVA: " + iva + "%";
    }
}
