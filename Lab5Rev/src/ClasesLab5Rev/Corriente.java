package ClasesLab5Rev;

import java.time.LocalDate;

public class Corriente extends Cuenta implements Depositable, Retirable {
    private LocalDate fchaUltMovimeto;
    private long valor;
    private String tipoOperacion;

    public Corriente(int numero, Persona titular) {
        super(numero, titular);
        this.fchaUltMovimeto = LocalDate.now();
    }

    @Override
    public void retirar(long valor) {
        saldo -= valor;
        fchaUltMovimeto = LocalDate.now();
    }

    @Override
    public void deposito(long valor) {
        saldo += valor;
        fchaUltMovimeto = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Corriente [fchaUltMovimeto=" + fchaUltMovimeto + ", valor=" + valor + ", tipoOperacion=" + tipoOperacion + ", " + super.toString() + "]";
    }
}
