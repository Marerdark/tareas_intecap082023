//array unidimensional que muestre solo numeros impares del 0 al 100
public class ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = new int [50];
        int ayuda =0;
        
        for (int i =1; i <=100; i+=2){
         
    
                numeros[ayuda]=i;
                ayuda++;
                
            
        }
    System.out.println("numero impares");
    for (int i=0; i< numeros.length;i++) {
          System.out.println(numeros[i]+" ");
      } 
    }
}