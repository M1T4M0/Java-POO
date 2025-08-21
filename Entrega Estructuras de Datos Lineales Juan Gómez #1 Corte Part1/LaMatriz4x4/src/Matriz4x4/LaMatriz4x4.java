package Matriz4x4;

public class LaMatriz4x4 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Matriz por las columnas:");
        for (int col = 0; col < 4; col++) {
            for (int fila = 0; fila < 4; fila++) {
          System.out.print(matriz[fila][col] + "\t");
            }

            System.out.println();
        }

        System.out.println("\nPrimera diagonal:");
        for (int i = 0; i < 4; i++) {
    System.out.print(matriz[i][i] + "\t");
        }
    }
}