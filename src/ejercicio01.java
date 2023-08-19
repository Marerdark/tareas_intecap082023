import java.util.Scanner; 
public class ejercicio01{

  
    public static void main(String[] args) {
       Scanner sp = new Scanner (System.in);
       System.out.println("Ingrese numero 1");
       int No_1 = sp.nextInt();
       System.out.println("ingrese numero 2");
       int No_2 =sp.nextInt();
       if (No_1 == No_2) {
           System.out.println ("son iguales");
       }
       else {
           System.out.println("no son iguales");
       }
       
       
    }
    
}