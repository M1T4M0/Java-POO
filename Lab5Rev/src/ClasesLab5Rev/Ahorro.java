package ClasesLab5Rev;

import java.time.LocalDate;

public class Ahorro extends Cuenta implements Depositable, Retirable {
    private LocalDate fechaUlRetiro;
    private long valor;

    public Ahorro(int numero, Persona titular) {
        super(numero, titular);
        this.fechaUlRetiro = LocalDate.now();
    }

    @Override
    public void retirar(long valor) {
        saldo -= valor;
        fechaUlRetiro = LocalDate.now();
    }

    @Override
    public void deposito(long valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Ahorro [fechaUlRetiro=" + fechaUlRetiro + ", valor=" + valor + ", " + super.toString() + "]";
    }
}
