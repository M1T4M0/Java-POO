package Clases_Financiera_MuchaPlata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Financiera {
    private List<Cuenta> cuentas = new ArrayList<>();

    public void crearCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void deposito(String numeroProducto, double valor) {
        for (Cuenta c : cuentas) {
            if (c.NumeroProducto.equals(numeroProducto)) {
                c.Saldo += valor;
            }
        }
    }

    public void retiro(String numeroProducto, double valor) {
        for (Cuenta c : cuentas) {
            if (c.NumeroProducto.equals(numeroProducto)) {
                c.Saldo -= valor;
            }
        }
    }

    public void mostrarCuentas() {
        for (Cuenta c : cuentas) {
            c.mostrarContenido();
            System.out.println();
        }
    }

    public void mostrarCuentasAhorro() {
        for (Cuenta c : cuentas) {
            if (c instanceof Ahorro) {
                c.mostrarContenido();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Financiera f = new Financiera();

        Titular t1 = new Titular(1, "Ana Pérez", "ana@email.com");
        Titular t2 = new Titular(2, "Luis Gómez", "luis@email.com");
        Titular t3 = new Titular(3, "Julian Martinez","Julian@email.com");

        f.crearCuenta(new Ahorro("AH01", 2022, t1, 5000.0, "21/07/2019", 300.0));
        f.crearCuenta(new Vivienda("VV01", 2021, t2, 30000, 250000, "VIS"));
        f.crearCuenta(new Corriente("J021", 2012, t3, 21000.0, "20/05/2021", 212, "Transferencia"));

        int opcion;

        do {
            System.out.println("\n====== Menú Financiera Mucha Plata ======");
            System.out.println("1. Crear nueva cuenta de Ahorro");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar todas las cuentas");
            System.out.println("5. Mostrar solo cuentas de Ahorro");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese datos del titular:");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    Titular titular = new Titular(999, nombre, correo);
                    System.out.print("Número de producto: ");
                    String numero = sc.nextLine();
                    System.out.print("Año de apertura: ");
                    int anio = sc.nextInt();
                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Fecha último retiro (dd/mm/aaaa): ");
                    String fecha = sc.nextLine();
                    System.out.print("Valor del último retiro: ");
                    double valorRetiro = sc.nextDouble();
                    Cuenta nueva = new Ahorro(numero, anio, titular, saldo, fecha, valorRetiro);
                    f.crearCuenta(nueva);
                    System.out.println("✅ Cuenta creada con éxito.");
                    break;

                case 2:
                    System.out.print("Número de cuenta a depositar: ");
                    String depNum = sc.nextLine();
                    System.out.print("Valor a depositar: ");
                    double depVal = sc.nextDouble();
                    f.deposito(depNum, depVal);
                    System.out.println("✅ Depósito exitoso.");
                    break;

                case 3:
                    System.out.print("Número de cuenta a retirar: ");
                    String retNum = sc.nextLine();
                    System.out.print("Valor a retirar: ");
                    double retVal = sc.nextDouble();
                    f.retiro(retNum, retVal);
                    System.out.println("✅ Retiro realizado.");
                    break;

                case 4:
                    f.mostrarCuentas();
                    break;

                case 5:
                    f.mostrarCuentasAhorro();
                    break;

                case 6:
                    System.out.println("👋 Cerrando sesión. ¡Gracias por usar la Financiera Mucha Plata!");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
