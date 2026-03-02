package main.java.com.example;
public class ArreglosUnidimensionales {

    public void declararCrearInicializar() {
        // Forma 1: Primero dices que existe, luego le das el tamaño (vacío)
        int[] misNumeros; 
        misNumeros = new int[3]; // Aquí caben 3 números, pero por ahora son puro 0

        // Forma 2: Todo de un solo golpe con valores ya puestos
        int[] misNotas = {10, 8, 9, 7}; // Java ya sabe que el tamaño es 4
        
        System.out.println("¡Arrays listos!");
    }

    public void mostrarLongitud() {
        String[] nombres = {"Ana", "Beto", "Carla"};
        // El .length te dice cuántos cajones tiene el array
        int tamaño = nombres.length; 
        System.out.println("En este array caben " + tamaño + " nombres.");
    }

    public void recorrerConForClasico() {
        int[] puntos = {100, 200, 300};
        // Usamos 'i' para ir tocando cada cajón, desde el 0 hasta el final
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("En el cajón " + i + " hay: " + puntos[i]);
        }
    }

    public void recorrerConForEach() {
        String[] juegos = {"Zelda", "Mario", "Sonic"};
        // "Por cada 'juego' que encuentres en la lista de 'juegos'..."
        for (String juego : juegos) {
            System.out.println("Jugando a: " + juego);
        }
    }
    
    // Este método recibe un array como si fuera un paquete
    public void aceptarArray(int[] datos) {
        System.out.println("Recibí un paquete con " + datos.length + " datos.");
    }

    // Este método "fabrica" un array y te lo entrega
    public int[] retornarArray() {
        int[] nuevo = {1, 2, 3};
        return nuevo; // Aquí soltamos el array para que alguien más lo use
    }
}
