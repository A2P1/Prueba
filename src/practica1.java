package src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practica1 {

    public static void main(String[] args) {
        String nombreArchivo = "cp-national-datafile-csv.csv"; // Reemplaza con la ruta de tu archivo

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
