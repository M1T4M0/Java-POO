package Ejercicio3;

public class AppVehiculos {
    public static void main(String[] args) {
    	
        Vehiculo[] vehiculos = {
            new Automovil("Toyota", "Corolla", "Rojo"),
            new Motocicleta("Yamaha", "FZ", "Negro"),
            new Camion("Volvo", "FH", "Blanco")
        };

        for (Vehiculo v : vehiculos) {
            v.mostrarInformacion();
            System.out.println("-------------------------------------------");
        }
    }
}
