package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class AppEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Vendedor("001", "Mariana", 1500000, 8000000));
        empleados.add(new Gerente("002", "Julian", 2000000, 500000));

        for (Empleado e : empleados) {
            System.out.println("Salario de " + e.nombre + ": " + e.calcularSalario());
        }
    }
}
