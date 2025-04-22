package Clases_Financiera_MuchaPlata;

public class Vivienda extends Cuenta {
    private double precioVivienda;
    private String tipoVivienda;

    public Vivienda(String numeroProducto, int anioApertura, Titular titular, double saldo,
                    double precioVivienda, String tipoVivienda) {
        super(numeroProducto, anioApertura, titular, saldo);
        this.precioVivienda = precioVivienda;
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public void mostrarContenido() {
    	System.out.println("---------------------------🤑🤑🤑 Financiera Mucha Plata 🤑🤑🤑---------------------------------------------------------------");
    	System.out.println("​​👋​ Bienvenido ​​👋​");
    	System.out.println("Titular: " + Titular.getNombre() + " - " + Titular.getCorreo());
    	System.out.println("Su Cuenta de Vivienda: " + NumeroProducto + " - Año: " + AnioApertura + " - Saldo: $" + Saldo);
        System.out.println("Tipo: " + tipoVivienda + " - Precio Vivienda: $" + precioVivienda);
        System.out.println("​​​​​​​​ Cargando........");
        System.out.println("---------------------------​------ 🏡​ Cuenta de Vivienda ​🏡​---------------------------------------------------------------");
    }
}