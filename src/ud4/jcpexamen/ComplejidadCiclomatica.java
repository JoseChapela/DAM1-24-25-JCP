//José Chapela Pastoriza

package ud4.jcpexamen;

public class ComplejidadCiclomatica {

    private static int complejidadCiclomatica(int[][] grafo) {

        int numAristas = 0;
        for (int i = 0; i < grafo.length; i++) {
            numAristas += grafo[i].length;
        }
        return numAristas - grafo.length + 2;
    }

    public static void main(String[] args) {
        
        int[][] grafo1 = {
            {1},
            {3, 5},
            {1},
            {2, 4},
            {6},
            {6},
            {}
           };

           System.out.println(complejidadCiclomatica(grafo1));

           int[][] grafo2 = {
            {1, 6},
            {2, 5},
            {3, 4},
            {4},
            {1},
            {0},
            {}
           };

           System.out.println(complejidadCiclomatica(grafo2));

    }

    
}
