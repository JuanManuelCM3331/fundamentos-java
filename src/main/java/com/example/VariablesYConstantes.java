package main.java.com.example;

public class VariablesYConstantes {
    public void demostrarDeclaracionAsignacion() {
        int edad = 18; // asigno las variables con un valor inicial
        double altura = 1.62;
        char inicial = 'J';
        boolean esEstudiante = true;
        String nombre = "Juan";

        System.out.println(edad); //las imprimo
        System.out.println(altura);
        System.out.println(inicial);
        System.out.println(esEstudiante);
        System.out.println(nombre);
    }

    public void demostrarConstantes() {//asigno a las constantes un valor, y la escribo en mayuscula para identificarla.
        final double PI = 3.1416;
        final int DIAS_SEMANA = 7;

        System.out.println(PI);
        System.out.println(DIAS_SEMANA);
    }

    public static void main(String[] args) {//el metodo main. 
        VariablesYConstantes obj = new VariablesYConstantes();
        obj.demostrarDeclaracionAsignacion();
        obj.demostrarConstantes();
    }
}
