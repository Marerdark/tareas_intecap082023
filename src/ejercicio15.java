
//array que muestre los numeros primos del 1 al 100 (Nota: son 25)
public class ejercicio15 {

    public static void main(String[] args) {
        int[][] numerosPrimos = new int[5][5]; // Una matriz 5x5 para almacenar los números primos

        int contador = 0;
        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                numerosPrimos[contador / 5][contador % 5] = i;
                contador++;
            }
        }

        System.out.println("Matriz de números primos del 1 al 100:");
        for (int i = 0; i < numerosPrimos.length; i++) {
            for (int j = 0; j < numerosPrimos[i].length; j++) {
                System.out.print(numerosPrimos[i][j] + "\t");
            }
            System.out.println();
    
     }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }}