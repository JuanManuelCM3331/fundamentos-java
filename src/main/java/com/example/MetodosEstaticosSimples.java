package main.java.com.example;

public class MetodosEstaticosSimples {

    public static void ejemploDeclaracionLlamada() {
        // 'void' significa que no devuelve nada, solo ejecuta el código.
        System.out.println("¡Hola! Soy un método estático.");
    }

    public static void ejemploPasoParametros(String nombre, int edad) {
        // Recibe un texto y un número para usarlos adentro.
        System.out.println(nombre + " tiene " + edad + " años.");
    }

    public static int ejemploRetornoValores(int a, int b) {
        // En lugar de 'void', ponemos 'int' porque va a devolver un número.
        return a + b; // El 'return' es el resultado final.
    }
    public static void ejemploSobrecarga() {
        System.out.println("Método sin nada.");
    }

    public static void ejemploSobrecarga(String mensaje) {
        // Se llama igual, pero Java sabe cuál usar porque este recibe un String.
        System.out.println("Método con mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        // Al ser static, se llaman usando el nombre de la clase:
        MetodosEstaticosSimples.ejemploDeclaracionLlamada();
        
        // O directo si estás en la misma clase:
        ejemploPasoParametros("Juan", 25);
        
        int resultado = ejemploRetornoValores(10, 5);
        System.out.println("La suma es: " + resultado);
        
        ejemploSobrecarga();
        ejemploSobrecarga("Probando sobrecarga");
    }
}
