
//hacer que en cada casilla se mueva un arroba @ en un 8*8 y las vacias un-
public class ejercicio18 {

    public static void main(String[] args) {
        char[][] matriz = new char[8][8];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + j) % 2 == 0 ? '@' : '-';
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
