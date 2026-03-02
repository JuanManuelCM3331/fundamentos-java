package main.java.com.example;

public class ManipulacionCadenas {

    public void demostrarConcatenacion() {
        String hola = "Hola";
        String mundo = " Mundo";
        
        // El clásico '+' es el más usado
        System.out.println(hola + mundo); 
        
        // El método .concat() hace exactamente lo mismo
        System.out.println(hola.concat(mundo));
    }

    public void demostrarMetodosUtiles() {
        String texto = "  Hola Java  ";

        System.out.println("Largo: " + texto.length()); // Cuenta letras y espacios
        System.out.println("Letra en 2: " + texto.charAt(2)); // ¿Qué hay en la posición 2?
        System.out.println("Recorte: " + texto.substring(2, 6)); // Corta un pedazo
        System.out.println("Grito: " + texto.toUpperCase()); // TODO A MAYÚSCULAS
        System.out.println("Limpio: " + texto.trim()); // Quita los espacios de los lados
        
        // Comparar textos (¡No uses == para Strings!)
        System.out.println("¿Es igual?: " + "Java".equals("java")); // false
        System.out.println("¿Igual sin importar mayúsculas?: " + "Java".equalsIgnoreCase("java")); // true
        
        // Buscar dentro del texto
        System.out.println("¿Contiene 'Hola'?: " + texto.contains("Hola"));
        System.out.println("¿Empieza con 'H'?: " + texto.trim().startsWith("H"));
    }

    public void demostrarInmutabilidad() {
        String s = "Hola";
        s.concat(" Mundo"); // Intentamos cambiarlo...
        
        // ¡Sigue diciendo "Hola"! Porque concat() no cambia 's', 
        // sino que crea un String nuevo que aquí se perdió.
        System.out.println("¿Cambió s?: " + s); 
        
        // Para que cambie, tendrías que hacer: s = s.concat(" Mundo");
    }

    public void usarStringBuilder() {
        // Si vas a pegar miles de textos, usar '+' es lento. 
        // StringBuilder es como un bloque de plastilina que sí puedes moldear.
        StringBuilder constructor = new StringBuilder();
        constructor.append("Hola");
        constructor.append(" ");
        constructor.append("Java eficiente");
        
        System.out.println(constructor.toString()); // Aquí ya lo volvemos String normal
    }
}
