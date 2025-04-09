package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class AppFiguras {
    public static void main(String[] args) {
        List<Figuras> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 3));
        figuras.add(new Triangulo(3, 4, 5));

        for (Figuras formas : figuras) {
            System.out.println("El Área es: " + formas.calcularArea());
            System.out.println("EL Perímetro es: " + formas.calcularPerimetro());
            System.out.println("--------------Calculator--------------");
        }
    }
}
