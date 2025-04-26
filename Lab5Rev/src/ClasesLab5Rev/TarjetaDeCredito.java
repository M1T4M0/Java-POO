package ClasesLab5Rev;

import java.time.LocalDate;

public class TarjetaDeCredito extends Cuenta implements Depositable {
    private long cupo;
    private LocalDate fechaUltimaCompra;
    private long valor;

    public TarjetaDeCredito(int numero, Persona titular, long cupo) {
        super(numero, titular);
        this.cupo = cupo;
        this.fechaUltimaCompra = LocalDate.now();
    }

    @Override
    public void deposito(long valor) {
        saldo += valor;
    }

    public void comprar(long valor) {
        if(valor <= cupo) {
            saldo -= valor;
            cupo -= valor;
            fechaUltimaCompra = LocalDate.now();
        }
    }

    @Override
    public String toString() {
        return "Tarjeta [cupo=" + cupo + ", fechaUltimaCompra=" + fechaUltimaCompra + ", valor=" + valor + ", " + super.toString() + "]";
    }
}
