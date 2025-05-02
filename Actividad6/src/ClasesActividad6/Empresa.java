package ClasesActividad6;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
//Vendedor, Identificación, Nombre, Edad, Año de Ingreso, Salario Básico, Total Ventas, Valor Comisión, Descuentos, Neto Pagado” 
//Repartidor, Identificación, Nombre, Edad, Año de Ingreso, Salario Básico, Numero Repartos, Valor Pagado Repartos, Descuentos, Neto Pagado”
        empleados.add(new Vendedor("101", "Pachita Pérez", 33, 2012, 1500000, 5000000));
        empleados.add(new Vendedor("102", "Pachito Ruiz", 42, 2002, 1600000, 3000000)); //Recibira 100000 por antiguedad que se calcula 2025-2002 = 23>20 esto sale de la clase Vendedor donde si Antiguedad() > 20 ? 100000 : 0;
        empleados.add(new Vendedor("103", "Pachota Neiva", 41, 2002, 1300000, 2000000));
        empleados.add(new Repartidor("201", "Juanita Gómez", 28, 2016, 1300000, 15, 'C'));//Como es de la zona C recibit¿ra un bono de 50000
        empleados.add(new Repartidor("202", "Juanito Mejía", 50, 2010, 1450000, 20, 'Z')); // zona inválida
        empleados.add(new Repartidor("203", "Johan Lopez", 31, 2011, 1320000, 22, 'C'));

        System.out.println("--------------------------------------------------------------- Nómina de Empleados Mucha Plata --------------------------------------------------------------------");
        
        System.out.println("---------------------------------------------------------------------- Nómina: Vendedores --------------------------------------------------------------------------");
        for (Empleado e : empleados) {
            if (e instanceof Vendedor) {
                System.out.println(e);
            }
        }

        System.out.println("\n------------------------------------------------------------------- Nómina: Repartidores -------------------------------------------------------------------------");
        for (Empleado e : empleados) {
            if (e instanceof Repartidor) {
                System.out.println(e);
            }
        }

       
    }
}
