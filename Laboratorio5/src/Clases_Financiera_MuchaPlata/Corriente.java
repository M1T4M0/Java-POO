package Clases_Financiera_MuchaPlata;

public class Corriente extends Cuenta {
private String fechaUltimoMovimiento;
private double valorMovimiento;
private String tipoOperacion;

public Corriente(String numeroProducto, int anioApertura, Titular titular, double saldo,
     String fechaUltimoMovimiento, double valorMovimiento, String tipoOperacion) {
        super(numeroProducto, anioApertura, titular, saldo);
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
        this.valorMovimiento = valorMovimiento;
        this.tipoOperacion = tipoOperacion;
    }

@Override
public void mostrarContenido() {
System.out.println("---------------------------🤑🤑🤑 Financiera Mucha Plata 🤑🤑🤑---------------------------------------------------------------");	
System.out.println("​​👋​ Bienvenido ​​👋​");
System.out.println("Titular: " + Titular.getNombre() + " - " + Titular.getCorreo());
System.out.println("Su Cuenta Corriente Registrada:  " + NumeroProducto + " - Año: " + AnioApertura + " - Saldo: $" + Saldo);
System.out.println("Su Ultimo Movimiento Registrado es: " + tipoOperacion + " de $" + valorMovimiento + " el " + fechaUltimoMovimiento);
System.out.println("​​​​​​​​​​​​🕜​ Cargando........");
System.out.println("---------------------------------- ​💵​ Cuenta Corriente ​💵​---------------------------------------------------------------");
    }
}