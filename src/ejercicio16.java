
//mostrar numeros del 1 al 100 en filas de 5 (1-2-3-4-5) (6-7-8-9-10)
public class ejercicio16 {

    public static void main(String[] args) {
        int ayuda = 1;

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "-");
            if (ayuda % 5 == 0) {
                System.out.println(); // Cambiar de línea después de imprimir 5 números
            }
            ayuda++;
        }
    }
}
