/**José Chapela Pastoriza */

package ud2.jcpexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ChiclesDeRegalo {
    public static void main(String[] args) {

        int n = 10, m = -1, o = 1;

        System.out.println(totalChicles(n, m, o));

    }

    public static int totalChicles(int chiclesComprados, int cadaCuantoGratis, int chiclesGratis) {
        if (chiclesComprados < 0 || cadaCuantoGratis < 0 || chiclesGratis < 0 || chiclesGratis > cadaCuantoGratis)
            return -1;

        if (cadaCuantoGratis == 0)
            return chiclesComprados;

        int totalChicles = 0;

        totalChicles = chiclesComprados / cadaCuantoGratis * chiclesGratis;
        totalChicles += totalChicles / cadaCuantoGratis * chiclesGratis;
        totalChicles += chiclesComprados;

        return totalChicles;
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
    }

}
