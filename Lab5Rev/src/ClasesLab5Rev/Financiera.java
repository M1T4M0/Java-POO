package ClasesLab5Rev;

import java.util.ArrayList;
import java.util.List;

public class Financiera {
    private List<Cuenta> cuentas = new ArrayList<>();

    public void crearCuentas() {
        Persona p1 = new Persona(1, "Juan Pérez", "juanperez@email.com");
        Persona p2 = new Persona(2, "María Gómez", "mariagomez@email.com");
        Persona p3 = new Persona(3, "Carlos Ruiz", "carlosruiz@email.com");

        Ahorro ahorro1 = new Ahorro(1001, p1);
        Ahorro ahorro2 = new Ahorro(1002, p2);
        Corriente corriente1 = new Corriente(2001, p1);
        Corriente corriente2 = new Corriente(2002, p3);
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(3001, p2, 5000);
        TarjetaDeCredito tarjeta2 = new TarjetaDeCredito(3002, p3, 7000);
        Vivienda vivienda1 = new Vivienda(4001, p1, 120000000, "Apartamento");
        Vivienda vivienda2 = new Vivienda(4002, p2, 150000000, "Casa");

        cuentas.add(ahorro1);
        cuentas.add(ahorro2);
        cuentas.add(corriente1);
        cuentas.add(corriente2);
        cuentas.add(tarjeta1);
        cuentas.add(tarjeta2);
        cuentas.add(vivienda1);
        cuentas.add(vivienda2);

        ahorro1.deposito(2000);
        corriente1.deposito(3000);
        tarjeta1.deposito(1000);
        vivienda1.deposito(50000);

        ahorro1.retirar(500);
        corriente1.retirar(1000);

        tarjeta1.comprar(2000);
        ahorro2.deposito(1000);
    }

    public void mostrarCuentasPorTipo() {
        System.out.println("-------------------------------------------------- Cuentas de Ahorro --------------------------------------------------------------");
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof Ahorro) {
                System.out.println(cuenta);
            }
        }

        System.out.println("\n-------------------------------------------------- Viviendas -------------------------------------------------------------");
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof Vivienda) {
                System.out.println(cuenta);
            }
        }

        System.out.println("\n-------------------------------------------------- Corrientes ----------------------------------------------------------------------");
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof Corriente) {
                System.out.println(cuenta);
            }
        }

        System.out.println("\n-------------------------------------------------- Tarjetas de Crédito ----------------------------------------------------------------");
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof TarjetaDeCredito) {
                System.out.println(cuenta);
            }
        }
    }

    public static void main(String[] args) {
        Financiera financiera = new Financiera();
        financiera.crearCuentas();
        System.out.println("------ Finaciera Mucha Plata ----------");
        System.out.println("------ Bienvenido ------");
        System.out.println(">>> Cuentas después de depósitos y retiros:");
        financiera.mostrarCuentasPorTipo();
    }
}
