package main.java.com.example;

public class EstructurasCondicionales {
    
    public void ejemploIf() {
        int edad = 20;
        // Si se cumple esto, entramos. Si no, Java pasa de todo.
        if (edad >= 18) { 
            System.out.println("Puedes pasar al club.");
        }
    }

    public void ejemploIfElse() {
        boolean tieneLlave = false;
        if (tieneLlave) {
            System.out.println("Abres la puerta.");
        } else { 
            // El 'else' es el "si no" de toda la vida. El plan B.
            System.out.println("Llamas al timbre.");
        }
    }

    public void ejemploIfElseIfElse() {
        int semaforo = 2; 
        if (semaforo == 1) {
            System.out.println("Pasar");
        } else if (semaforo == 2) { 
            // Por si la primera pregunta falló, pero quieres preguntar otra cosa.
            System.out.println("Precaución");
        } else {
            // Si nada de lo de arriba funcionó, caemos aquí por descarte.
            System.out.println("Parar");
        }
    }

    public void ejemploSwitch() {
        int mes = 1;
        // El switch es como un menú. Vas directo a la opción que coincida.
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break; // ¡Ojo! Sin este 'break', Java se sigue de largo al siguiente case.
            case 2:
                System.out.println("Febrero");
                break; 
            default:
                // Esto es como el "else". Si no fue ni 1 ni 2, sale esto.
                System.out.println("Otro mes");
        }
    }

    public void ejemploSwitchExpression() {
        String clima = "Lluvia";
        // Aquí el switch es "inteligente" y te guarda el resultado en una variable directamente.
        String accion = switch (clima) {
            case "Sol" -> "Usar gafas"; // La flechita hace todo el trabajo y no necesita break.
            case "Lluvia" -> "Usar paraguas";
            default -> "Quedarse en casa";
        }; // Importante: este switch termina en punto y coma porque es una asignación.
        System.out.println(accion);
    }
}