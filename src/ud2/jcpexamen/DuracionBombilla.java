/**José Chapela Pastoriza */

package ud2.jcpexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class DuracionBombilla {
    public static void main(String[] args) {
        int n = 1000, m = 10, o = 0;

        System.out.println(causaFinBombilla(n, m, o));

    }

    public static String causaFinBombilla(int totalDuracion, int maxEncendidas, int usoDuracion) {

        String linea;

        if (maxEncendidas * usoDuracion * totalDuracion != 0 && maxEncendidas >= 0 && usoDuracion >= 0
                && totalDuracion >= 0 && usoDuracion <= 10) {

            if (maxEncendidas * usoDuracion == totalDuracion)
                linea = "ENCENDIDOS + HORAS";

            else if (maxEncendidas * usoDuracion > totalDuracion)
                linea = "ENCENDIDOS";

            else
                linea = "HORAS";

        } else
            linea = "ERROR";

        return linea;
    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

    
}
