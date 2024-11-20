/**José Chapela Pastoriza */

package ud2.jcpexamen;

public class DuracionBombilla {
    public static void main(String[] args) {
        int n = 1000, m = 10, o = 0;

        System.out.println(causaFinBombilla(n, m, o));

    }

    public static String causaFinBombilla(int totalDuracion, int maxEncendidas, int usoDuracion) {

        String linea;

        if (maxEncendidas * usoDuracion * totalDuracion != 0 && maxEncendidas >= 0 && usoDuracion >= 0
                && totalDuracion >= 0 && usoDuracion <= 10) {

            if (totalDuracion / usoDuracion == maxEncendidas)
                linea = "ENCENDIDOS + HORAS";

            else if (totalDuracion / usoDuracion > maxEncendidas)
                linea = "ENCENDIDOS";

            else
                linea = "HORAS";

        } else
            linea = "ERROR";

        return linea;
    }

}
