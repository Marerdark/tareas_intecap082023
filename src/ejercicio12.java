//array unidimensional que muestre solo numeros pares del 0 al 100
public class ejercicio12 {
    public static void main(String[] args) {
        int[] numeros = new int [51];
        int ayuda =0;
        
        for (int i =0; i <=100; i++){
            if (i% 2 ==0) {
                numeros[ayuda]=i;
                ayuda++;
                
            }
        }
      for (int numero:numeros) {
          System.out.println(numero);
      } 
    }
}
