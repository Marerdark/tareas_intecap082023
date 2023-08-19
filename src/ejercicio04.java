import java.util.Scanner;

public class ejercicio04 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        int No_1 = sp.nextInt();
        System.out.println("Ingrese numero 2");
        int No_2 = sp.nextInt();
        System.out.println("Ingrese numero 3");
        int No_3 = sp.nextInt();

        if (No_1 == No_2 && No_2 == No_3) {
            System.out.println("Los tres números son iguales");
        } else if (No_1 >= No_2 && No_1 >= No_3) {
            if (No_2 >= No_3) {
                System.out.println(No_1 + "\n" + No_2 + "\n" + No_3);
            } else {
                System.out.println(No_1 + "\n" + No_3 + "\n" + No_2);
            }
        } else if (No_2 >= No_1 && No_2 >= No_3) {
            if (No_1 >= No_3) {
                System.out.println(No_2 + "\n" + No_1 + "\n" + No_3);
            } else {
                System.out.println(No_2 + "\n" + No_3 + "\n" + No_1);
            }
        } else {
            if (No_1 >= No_2) {
                System.out.println(No_3 + "\n" + No_1 + "\n" + No_2);
            } else {
                System.out.println(No_3 + "\n" + No_2 + "\n" + No_1);
            }
        }
    }
}
