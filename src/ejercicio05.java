import java.util.Scanner;

public class ejercicio05 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        
        System.out.println("Ingrese dia:");
        int dia = sp.nextInt();
        
        System.out.println("Ingrese mes:");
        int mes = sp.nextInt();
        
        System.out.println("Ingrese ano:");
        int ano = sp.nextInt();
        
        boolean fechaCorrecta = false;
        
        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                if (dia >= 1 && dia <= 28) {
                    fechaCorrecta = true;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    fechaCorrecta = true;
                }
            } else {
                if (dia >= 1 && dia <= 31) {
                    fechaCorrecta = true;
                }
            }
        }
        
        if (fechaCorrecta) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha no es correcta.");
        }
        
    }

}
