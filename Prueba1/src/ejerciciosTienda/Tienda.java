package ejerciciosTienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    private static ArrayList<Productos> productosDisponibles = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Agregarr
        productosDisponibles.add(new Productos(101, "Pan", new Tipo(true, 5), new Fecha(2025, 4, 15)));
        productosDisponibles.add(new Productos(102, "Leche", new Tipo(true, 19), new Fecha(2025, 5, 10)));
        productosDisponibles.add(new Productos(103, "Teclado", new Tipo(false, 0), null));

      
        mostrarProductos();
        buscarProducto();
    }

    public static void mostrarProductos() {
        System.out.println("\n Productos disponibles:");
        for (Productos p : productosDisponibles) {
            System.out.println(p);
        }
    }

    public static void buscarProducto() {
        System.out.print("\n Ingrese el código del producto a buscar: ");
        int codigo = entrada.nextInt();

        boolean encontrado = false;
        for (Productos p : productosDisponibles) {
            if (p.getCodigo() == codigo) {
                System.out.println("Producto encontrado: " + p);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}
