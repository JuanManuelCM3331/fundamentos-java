package main.java.com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        int a = 10, b = 3;

        System.out.println("=== Operadores Aritméticos ===");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println();
    }

    public static void demostrarIncrementoDecremento() {
        int x = 5;

        System.out.println("=== Incremento y Decremento ===");
        System.out.println("Valor inicial: " + x);

        System.out.println("Postfijo x++: " + (x++));
        System.out.println("Después de x++: " + x);

        System.out.println("Prefijo ++x: " + (++x));

        System.out.println("Postfijo x--: " + (x--));
        System.out.println("Después de x--: " + x);

        System.out.println("Prefijo --x: " + (--x));
        System.out.println();
    }

    public static void demostrarRelacionales() {
        int a = 8, b = 5;

        System.out.println("=== Operadores Relacionales ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println();
    }

    public static void demostrarLogicos() {
        boolean p = true;
        boolean q = false;

        System.out.println("=== Operadores Lógicos ===");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));
        System.out.println();
    }

    public static void demostrarAsignacionCompuesta() {
        int x = 10;

        System.out.println("=== Asignación Compuesta ===");

        x += 5;
        System.out.println("x += 5: " + x);

        x -= 3;
        System.out.println("x -= 3: " + x);

        x *= 2;
        System.out.println("x *= 2: " + x);

        x /= 4;
        System.out.println("x /= 4: " + x);

        x %= 3;
        System.out.println("x %= 3: " + x);
        System.out.println();
    }

    public static void demostrarOperadorTernario() {
        int edad = 18;

        System.out.println("=== Operador Ternario ===");
        String resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(resultado);
    }

    public static void main(String[] args) { //el metodo main.
        demostrarAritmeticos();
        demostrarIncrementoDecremento();
        demostrarRelacionales();
        demostrarLogicos();
        demostrarAsignacionCompuesta();
        demostrarOperadorTernario();
    }
}
// no creo que tenga que comentar cada linea, es bastante autoexplicativo y simple.