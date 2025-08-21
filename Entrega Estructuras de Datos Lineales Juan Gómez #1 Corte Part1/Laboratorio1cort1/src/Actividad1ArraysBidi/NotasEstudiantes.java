package Actividad1ArraysBidi;

import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;                          // 5 estudiantess
        int[] codigo = new int[n];          // arreglo 1D (códigos)
        String[] nombre = new String[n];    // arreglo 1D (nombres)
        // Matriz 2D: filas={  C1, C2, C3, DEF} y columnas=estudiantes
        double[][] notas = new double[4][n];

        // Aqui Ingreso los datos por columna (estudiante a estudiante)
        for (int col = 0; col < n; col++) {
            System.out.println("\nEstudiante #" + (col + 1));

            System.out.print("Código: ");
            codigo[col] = sc.nextInt();
            sc.nextLine(); // para limpiar

            System.out.print("Nombre: ");
            nombre[col] = sc.nextLine();

            // 3 cortes -> todas las filas excepto la última que es la (definitiva)
            for (int fila = 0; fila < notas.length - 1; fila++) {
                System.out.print("Nota Corte " + (fila + 1) + ": ");
                notas[fila][col] = sc.nextDouble();
            }

            // 2) Calcular definitiva (30%, 30%, 40%)
            notas[3][col] = notas[0][col] * 0.30
                          + notas[1][col] * 0.30
                          + notas[2][col] * 0.40;
        }

        // se busca por codigo 
        System.out.print("\nIngrese el código a buscar: ");
        int buscarCodigo = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (codigo[i] == buscarCodigo) { pos = i; break; }
        }

        if (pos != -1) {
            System.out.printf("Encontrado: %d  %s  C1=%.2f  C2=%.2f  C3=%.2f  DEF=%.2f%n",
                    codigo[pos], nombre[pos],
                    notas[0][pos], notas[1][pos], notas[2][pos], notas[3][pos]);
        } else {
            System.out.println("No existe un estudiante con ese código.");
        }

        // Listado completo y promedio del curso
        double sumaDef = 0;
        System.out.println("\nCODIGO  NOMBRE             C1    C2    C3   DEF");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-7d %-18s %.2f %.2f %.2f %.2f%n",
                    codigo[i], nombre[i],
                    notas[0][i], notas[1][i], notas[2][i], notas[3][i]);
            sumaDef += notas[3][i];
        }
        System.out.printf("Promedio del curso: %.2f%n", (sumaDef / n));

        sc.close(); // opcional pero lo dejo
    }
}
//Juan Gómez 

