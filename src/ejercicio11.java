import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[3][5];

        System.out.println("Ingresa 15 valores numéricos:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = scanner.nextInt();
            }
        }

        System.out.println("La matriz ingresada es:");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}

      
 
