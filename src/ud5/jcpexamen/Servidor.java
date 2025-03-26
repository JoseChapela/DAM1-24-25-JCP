//Jose Chapela Pastoriza

package ud5.jcpexamen;

import java.util.Arrays;

public class Servidor extends Host implements Comparable{
    
    // Tu código aquí

    Servicios[] lista = new Servicios[0];

    public Servidor(String nombre, String ip, String mac) {
            super(nombre, ip, mac);
            
    }

    boolean addServicio(String nombre, int puerto, String protocolo) {

        if (lista.length != 0) {

            for (int i = 0; i < lista.length; i++) {

                if (lista[i].numPuerto == puerto && lista[i].protocolo.equals(protocolo)) return false;
            }
        }

        lista = Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1] = new Servicios(nombre, puerto, protocolo);
        return true;
    }


    public String toString(){

        String cad = String.format(nombre + " (" + ip + ")\n");
        for (int i = 0; i < lista.length; i++) {

            cad += lista[i].toString();
        }

        return cad;
    }

    public int compareTo(Object o) {

        return ((Servidor)o).lista.length - lista.length;
    }


    
        public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");        

        Servidor[] servidores = { s1, s2, s3 };
        for (Servidor s : servidores) {
            System.out.println(s);
        }

        // Tu código aquí

        System.out.println("Servidores ordenados descendentemente por número de servicios");
        System.out.println("================================================================");
        System.out.println();

        Arrays.sort(servidores);
        for (Servidor s : servidores) {
            System.out.println(s);
        }

    }
}
