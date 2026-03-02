package main.java.com.example;

public class ConversionDeTipos {

    void demostrarCastingImplicito() {
        int entero = 100; 
        double decimal = entero; //conversion implicita de entero a flotante
        System.out.println(decimal); // dara como resultado 100.0
    }

    void demostrarCastingExplicito() {
        double decimal = 9.78;
        int entero = (int) decimal;// Paso de decimal a entero, por lo que pierde el decimal y queda mas impreciso
        System.out.println(entero);
    }

    public static void main(String[] args) {// esto es solo un objeto de la clase ConversionDeTipos para llamar a los métodos
        ConversionDeTipos obj = new ConversionDeTipos();
        obj.demostrarCastingImplicito();
        obj.demostrarCastingExplicito();
    }
}
