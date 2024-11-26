/**José Chapela Pastoriza */

package ud2.jcpexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ChiclesDeRegalo {
    public static void main(String[] args) {

        int n = 25, m = 5, o = 1;

        System.out.println(totalChicles(n, m, o));

    }

    public static int totalChicles(int chiclesComprados, int cadaCuantoGratis, int chiclesGratis) {
        if (chiclesComprados < 0 || cadaCuantoGratis < 0 || chiclesGratis < 0 || chiclesGratis >= cadaCuantoGratis)
            return -1;

        if (cadaCuantoGratis == 0)
            return chiclesComprados;

        int total = chiclesComprados;
        int envoltorios = chiclesComprados;

        while ( envoltorios >= cadaCuantoGratis) {
            int chiclesGratuitos = (envoltorios / cadaCuantoGratis) * chiclesGratis;

            total =+ chiclesGratuitos;

            cadaCuantoGratis = (envoltorios % cadaCuantoGratis) + chiclesGratuitos;
        }

        return total;

    }

       
    @Test
    public void ChiclesRegaloTest() {
    assertEquals(31, totalChicles(25, 5, 1));
    assertEquals(6, totalChicles(5, 5, 1));
    assertEquals(111, totalChicles(100, 10, 1));
    assertEquals(-1, totalChicles(20, 2, 5));
    assertEquals(-1, totalChicles(10, -1, 0));
    assertEquals(-1, totalChicles(-1, 2, 1));
    assertEquals(-1, totalChicles(10, 1, -1));
    assertEquals(-1, totalChicles(20, 2, 2));
    assertEquals(10, totalChicles(7, 3, 1));
    assertEquals(40, totalChicles(27, 3, 1));
    assertEquals(21, totalChicles(11, 2, 1));
    assertEquals(31, totalChicles(16, 2, 1));
    assertEquals(100, totalChicles(100, 0, 0));
    assertEquals(100, totalChicles(100, 0, 1));
    assertEquals(0, totalChicles(0, 0, 1));
    assertEquals(0, totalChicles(0, 2, 1));
    }

    }
