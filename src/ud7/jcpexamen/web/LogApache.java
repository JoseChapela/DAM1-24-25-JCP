/**Jose Chapela Pastoriza */

package ud7.jcpexamen.web;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class LogApache {

    static String path = "src/ud7/jcpexamen/web/bacharelato_access.log";

    public static void main(String[] args) {
        System.out.println(totalAccesos(path));
        System.out.println(totalAccesosIncorrectos(path));
        System.out.println(listarDirecciones(path));
    }

    private static Map<String, Integer> listarDirecciones(String path2) {
        int contador = 0;
        Map<String, Integer> mapa = new TreeMap<>();
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {

            String linea = in.readLine();
            while (linea != null) {
                String ip = linea.substring(0, linea.indexOf(" "));
                if (mapa.containsKey(ip))
                    mapa.put(ip, mapa.get(ip) + 1);
                else
                    mapa.put(ip, 1);

                linea = in.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return mapa;
    }

    static int totalAccesos(String path) {

        int contador = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {

            String linea = in.readLine();
            while (linea != null) {
                contador++;
                linea = in.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return contador;
    }

    static int totalAccesosIncorrectos(String path) {

        int contador = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {

            String linea = in.readLine();
            while (linea != null) {
                if (linea.contains("\" 404 "))
                    contador++;
                linea = in.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return contador;
    }

}
