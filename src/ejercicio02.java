import java.util.Scanner; 
public class ejercicio02 {

  
    public static void main(String[] args) {
       Scanner sp = new Scanner (System.in);
       System.out.println("Ingrese su numero");
       int No_1 = sp.nextInt();
    
       
       if (No_1 >= 0) {
           System.out.println ("Positivo");
       }
       
       else {
           System.out.println("Negativo");
       }
       
       
    }
    
}