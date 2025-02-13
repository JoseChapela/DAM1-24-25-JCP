package casual;

public class Marcador {
    public static void main(String[] args) {
        
        boolean[][] marcador = new boolean[3][7];
        
    }

    public static int cambiosMarcador (boolean[][] marcador, int num, int posicion) {

        int contador = 0;
        boolean[][] numeros =  {
                            {true, true, true, true, true, true, false},
                            {false, true, true, false, false, false, false},
                            {true, true, false, true, true, false, true},
                            {true, true, true, true, false, false, true},
                            {false, true, true, false, false, true, true},
                            {true, false, true, true, false, true, true},
                            {true, false, true, true, true, true, true},
                            {true, true, true, false, false, false, false},
                            {true, true, true, true, true, true, true},
                            {true, true, true, true, false, true, true}};
        for (int i = 0; i < marcador[posicion].length; i++) {

            if (marcador[posicion][i] != numeros[num][i]) contador++;
        }
        marcador[posicion] = numeros[num];
        
        return contador;
    } 
    
}
