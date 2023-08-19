public class ejercicio09 {

    public static void main(String[] args) {
      int i = 1;

        while (i <= 10) {
            System.out.println("tablas de multiplicar del " + i + ":");
            int mult = 1;
            while (mult <= 10) {
                int resultado = i * mult;
                System.out.println(i + " x " + mult + " = " + resultado);
                mult++;
            }
            System.out.println(" ");
            i++;
        }
    }
}

