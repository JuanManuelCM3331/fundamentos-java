package main.java.com.example;

public class ArreglosBidimensionales {
    package main.java.com.example;

    public void declararCrearMatrices() {
        // Imagina esto como una tabla de Excel de 3 filas y 2 columnas
        int[][] miTabla = new int[3][2]; 

        // También puedes llenarla de una vez con valores
        int[][] matrizDirecta = {
            {1, 2}, // Fila 0
            {3, 4}, // Fila 1
            {5, 6}  // Fila 2
        };
        System.out.println("Matriz creada con éxito.");
    }

    public void recorrerMatriz() {
        int[][] matriz = { {10, 20}, {30, 40} };

        // El primer 'for' recorre las FILAS
        for (int i = 0; i < matriz.length; i++) {
            // El segundo 'for' recorre las COLUMNAS de esa fila
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("En la fila " + i + ", columna " + j + " hay un: " + matriz[i][j]);
            }
        }
    }

    public void ejemploUsosTipicos() {
        int[][] precios = { {10, 5}, {20, 10} };
        int total = 0;

        for (int i = 0; i < precios.length; i++) {
            for (int j = 0; j < precios[i].length; j++) {
                total += precios[i][j]; // Vamos sumando cada número al total
            }
        }
        System.out.println("La suma de todos los precios es: " + total);
    }
}
