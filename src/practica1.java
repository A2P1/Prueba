package src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class practica1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "cp-national-datafile-csv.csv"; // Reemplaza con la ruta de tu archivo

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Mostrar contenido del archivo");
            System.out.println("2. Otra opción (personaliza según tus necesidades)");
            System.out.println("3. Otra opción (personaliza según tus necesidades)");
            System.out.println("4. Salir");

            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    mostrarContenidoArchivo(nombreArchivo);
                    break;
                case 2:
                    // Implementa la lógica para la opción 2
                    System.out.println("Opción 2 seleccionada. Personaliza según tus necesidades.");
                    break;
                case 3:
                    // Implementa la lógica para la opción 3
                    System.out.println("Opción 3 seleccionada. Personaliza según tus necesidades.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }

    private static void mostrarContenidoArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
