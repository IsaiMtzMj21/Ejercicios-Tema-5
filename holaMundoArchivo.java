import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class holaMundoArchivo {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("/home/eugenio/archivo/archivo.txt"));
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        Scanner entra = new Scanner(System.in);
        System.out.print("Humano, quiero que introduzcas un número: ");
        try {
            int num = entra.nextInt();
            System.out.println("Ingresaste: " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
        } finally {
            entra.close();
        }
    }
}
