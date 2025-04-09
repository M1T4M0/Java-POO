package Ejercicio3;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String color;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public abstract void mostrarInformacion();
}
