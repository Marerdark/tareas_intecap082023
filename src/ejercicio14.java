//array unidimensional que muestre los nombres iniciales de los alumnos del curso (10 nombres)
import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[10];

        System.out.println("Ingresa 10 nombres:");

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Los nombres ingresados son:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        scanner.close();
    }
}