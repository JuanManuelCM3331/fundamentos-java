package main.java.com.example;

public class EstructurasDeRepeticion {

    public void ejemploWhile() {
        int vueltas = 1;
        while (vueltas <= 3) {
            System.out.println("Vuelta número: " + vueltas);
            vueltas++; // Si olvidas esto, el bucle no para nunca (bucle infinito)
        }
    }

    public void ejemploDoWhile() {
        int intentos = 0;
        do {
            // Esto se ejecuta al menos UNA vez sí o sí
            System.out.println("Intentando conectar...");
            intentos++;
        } while (intentos < 1); 
    }

    public void ejemploForClasico() {
        // Empiezas en 0, llegas hasta 4, y vas de 1 en 1
        for (int i = 0; i < 5; i++) {
            System.out.println("Contando: " + i);
        }
    }

    public void ejemploForAnidado() {
        for (int hora = 1; hora <= 2; hora++) {
            for (int minuto = 1; minuto <= 3; minuto++) {
                // Por cada 'hora', este de adentro da todas sus vueltas
                System.out.println("Hora: " + hora + " Min: " + minuto);
            }
        }
    }

    public void ejemploBreakContinue() {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) continue; // "¡Sáltate el 2 y sigue con el siguiente!"
            if (i == 4) break;    // "¡Corta todo y salte del bucle ya!"
            System.out.println("Número: " + i);
        }
    }
    public void ejemploEtiquetas() {
        bucleExterno: // Le ponemos nombre al de afuera
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) break bucleExterno; // Rompe el de afuera desde adentro
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }

}
