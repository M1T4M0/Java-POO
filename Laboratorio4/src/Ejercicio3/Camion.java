package Ejercicio3;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Camión 🚚 : " + marca + " " + modelo + " - " + color);
    }
}
