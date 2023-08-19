
//Mostrar en la primera fila Nombre, apellido, telefono, cumpleaños, dpi y luego los datos
import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] datos = new String[6][5];
        String[] etiquetas = { "Nombre", "Apellido", "Teléfono", "Cumpleaños", "DPI" };

        System.out.println("Ingresa los datos personales:");

        // Llenar la matriz de datos
        for (int i = 0; i < datos[0].length; i++) {
            System.out.print(etiquetas[i] + ": ");
            datos[0][i] = scanner.nextLine();
        }

        // Mostrar etiquetas de campos
        for (int i = 0; i < etiquetas.length; i++) {
            System.out.print(etiquetas[i] + "\t");
        }
        System.out.println();

        // Mostrar los datos
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
