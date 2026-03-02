package main.java.com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {// el metodo main y el escaner para recibir los datos de la consola

        Scanner sc = new Scanner(System.in);

        leerVariosTipos(sc);
        manejarSaltoDeLineaPendiente(sc);

        sc.close(); // Buena práctica
    }

    public static void leerVariosTipos(Scanner sc) {// metodo para leer varios tipos de datos

        System.out.println("=== Leer varios tipos ===");

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        System.out.print("Ingrese un número decimal: ");
        double decimal = sc.nextDouble();

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.next();

        sc.nextLine(); // limpiar salto pendiente

        System.out.print("Ingrese una línea completa: ");
        String linea = sc.nextLine();

        System.out.println("\nResultados:");
        System.out.println("Entero: " + numero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Palabra: " + palabra);
        System.out.println("Línea completa: " + linea);
    }

    public static void manejarSaltoDeLineaPendiente(Scanner sc) {// metodo para manejar el salto de linea pendiente

        System.out.println("\n=== Manejo del salto de línea pendiente ===");

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();// lee un entero pero deja el salto de línea pendiente

        sc.nextLine(); // consumir salto pendiente

        System.out.print("Ingrese su nombre completo: ");// ahora lee la línea completa sin problemas
        String nombre = sc.nextLine();// lee el nombre completo

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
    }
}

