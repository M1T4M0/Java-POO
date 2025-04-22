package Clases_Financiera_MuchaPlata;

import java.util.Date;

public class TarjetaCredito extends Cuenta {
    private double cupo;
    private Date fechaUltimaCompra;
    private double valorCompra;

    public TarjetaCredito(String numeroProducto, int anioApertura, Titular titular, double saldo,
                          double cupo, Date fechaUltimaCompra, double valorCompra) {
        super(numeroProducto, anioApertura, titular, saldo);
        this.cupo = cupo;
        this.fechaUltimaCompra = fechaUltimaCompra;
        this.valorCompra = valorCompra;
    }

    @Override
    public void mostrarContenido() {
        System.out.println("Tarjeta de Crédito - " + NumeroProducto + " - Año: " + AnioApertura + " - Saldo: $" + Saldo);
        System.out.println("Cupo: $" + cupo + " - Última compra: $" + valorCompra + " el " + fechaUltimaCompra);
        System.out.println("Titular: " + Titular.getNombre() + " - " + Titular.getCorreo());
    }
}