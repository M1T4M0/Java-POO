package Ejercicio3;

public class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Motocicleta 🏍️ : " + marca + " " + modelo + " - " + color);
    }
}
