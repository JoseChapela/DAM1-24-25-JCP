/**
 * BuscarFilaMayorSuma. Escribe un método en Java que reciba una matriz de enteros y
determine y devuelva la fila que tiene la mayor suma de sus elementos
 */

package ud4.prueba0121;

public class BuscarFilaMayorSuma {
    public static void main(String[] args) {
    
    }

    private static int[] FilaMayor (int[][] matriz) {

        if (matriz == null) return null;
        int[] sumas = new int[matriz.length];
        if (matriz.length == 0) return sumas;

        int maximo = 0;
        int fila = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumas[i] += matriz[i][j];
            }
            if (sumas[i]>maximo) {
                fila = i;
                maximo = sumas[i];
            }
        }

        int[] respuesta = new int[matriz[fila].length];
        respuesta = matriz[fila];

        return respuesta;
    }
    
}
