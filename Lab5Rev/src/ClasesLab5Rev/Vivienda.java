package ClasesLab5Rev;

public class Vivienda extends Cuenta implements Depositable {
    private long precioVivienda;
    private String tipoVivienda;

    public Vivienda(int numero, Persona titular, long precioVivienda, String tipoVivienda) {
        super(numero, titular);
        this.precioVivienda = precioVivienda;
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public void deposito(long valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Vivienda [precioVivienda=" + precioVivienda + ", tipoVivienda=" + tipoVivienda + ", " + super.toString() + "]";
    }
}

