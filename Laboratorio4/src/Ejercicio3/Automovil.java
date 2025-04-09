package Ejercicio3;

public class Automovil extends Vehiculo {
    public Automovil(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Automóvil 🚗 : " + marca + " " + modelo + " - " + color);
    }
}
