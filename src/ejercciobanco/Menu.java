package ejercciobanco;

import java.util.Scanner;

public class Menu {
    public static Scanner sp = new Scanner(System.in);
    
    public static void mostrarMenu() {
        EjercicioBanco ob1 = new EjercicioBanco("Emerson", "Gomez", 300);
        EjercicioBanco ob2 = new EjercicioBanco("Marvin", "Martinez", 500);

        while (true) {
            System.out.println("***********************");
            System.out.println("* 1. Mostrar Cuenta   *");
            System.out.println("* 2. Abonar Cuenta    *");
            System.out.println("* 3. Debitar Cuenta   *");
            System.out.println("* 4. Salir            *");
            System.out.println("***********************");

            int opcion = sp.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese 1 para cuenta 1 o 2 para cuenta 2");
                    int valorMostrar = sp.nextInt();
                    if (valorMostrar == 1) {
                        ob1.mostrar();
                    } else {
                        ob2.mostrar();
                    }
                    break;
                case 2:
                    System.out.println("Ingrese 1 para cuenta 1 o 2 para cuenta 2");
                    int valorAbonar = sp.nextInt();
                    System.out.println("Ingrese el valor a abonar");
                    int montoAbonar = sp.nextInt();
                    if (valorAbonar == 1) {
                        ob1.abonar(montoAbonar);
                    } else {
                        ob2.abonar(montoAbonar);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese 1 para cuenta 1 o 2 para cuenta 2");
                    int valorDebitar = sp.nextInt();
                    System.out.println("Ingrese el valor a debitar");
                    int montoDebitar = sp.nextInt();
                    if (valorDebitar == 1) {
                        ob1.debitar(montoDebitar);
                    } else {
                        ob2.debitar(montoDebitar);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}
