package instrumentos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //arreglo invocando a todos los instrumentos
        Instrumento[] instrumentos = {
            new Guitarra(),
            new Piano(),
            new Bateria(),
            new Saxofon(),
            new Flauta()
        };
        int opcion = 0;
        //menu dentro de un do while para hacerlo ciclico
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Tocar un instrumento");
            System.out.println("2. Ejecutar una cancion");
            System.out.println("3. Tocar todos los instrumentos");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                // Tocar un instrumento
                System.out.println("Instrumentos:");
                System.out.println("1. Guitarra");
                System.out.println("2. Piano");
                System.out.println("3. Bateria");
                System.out.println("4. Saxofon");
                System.out.println("5. Flauta");
                System.out.print("Elige un instrumento (1-5): ");
                int index = scanner.nextInt();
                instrumentos[index - 1].tocarSonido();

            } else if (opcion == 2) {
                // Ejecutar canción
                System.out.println("Instrumentos:");
                System.out.println("1. Guitarra");
                System.out.println("2. Piano");
                System.out.println("3. Bateria");
                System.out.println("4. Saxofon");
                System.out.println("5. Flauta");
                System.out.print("Elige un instrumento (1-5): ");
                int index = scanner.nextInt();
                instrumentos[index - 1].ejecutarCancion();

            } else if (opcion == 3) {
                System.out.println("Tocando todos los instrumentos:");
                for (Instrumento ins : instrumentos) { //recorre todos los instrumentos
                    ins.tocarSonido();   //representa un instrumento a la vez
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("ERROR");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
