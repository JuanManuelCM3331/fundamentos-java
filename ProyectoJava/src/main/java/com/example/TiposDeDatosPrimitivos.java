package main.java.com.example;

public class TiposDeDatosPrimitivos {
    public void demostrarEnteros() {
        byte b = 100; // es para numeros enteros cortos, osea de un byte.
        short s = 1000; // es para numeros enteroos de varios bits.
        int i = 100000; // es para numeros enteros estandar.
        long l = 10000000000L; // es para numeros enteros grandes, que se requiere mas espacio de memoria.

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    };

    public void demostrarFlotantes() {
        float f = 1.0332f;// para decimales cortos o estandar
        double d = 1.0452345634;// para decimales largos y precisos, pero ocupa muchos msa recursos

        System.out.println(f);
        System.out.println(d);
    };

    public void demostrarCaracteres() {
    char c = 'A'; // para un solo caracter, se representa con comillas simples
    System.out.println(c);
    };

    public void demostrarBooleanos() {
        boolean b1 = true; // para valores logicos, puede ser true o false
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
    };

    public void demostrarValoresPorDefecto() {
    // en este caso, los tipos de datos en java no tienen valores por defecto, porque deben ser inicializados,
    // en caso de no inicializarlos, disparara un error de compilacion.
    };
}
