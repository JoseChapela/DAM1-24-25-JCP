//Jose Chapela Pastoriza

package ud5.jcpexamen;

import java.util.Arrays;

public class Host implements Comparable{

    // Tu código aquí

    String nombre;
    String mac;
    String ip;
    static final String MASCARARED = "255.255.0.0";
    static final String PUERTAENLACE = "192.168.0.11";
    static final String SERVIDORDNS = "192.168.0.9";

    public Host(String nombre, String ip, String mac) {

        if (nombre.equals(null))
            throw new IllegalArgumentException("El nombre no puede ser nulo");

        if(!validarIP(ip))
            throw new IllegalArgumentException("La dirección IP no usa ese formato");

        if(!validarMAC(mac))
            throw new IllegalArgumentException("La dirección MAC no usa ese formato");

        //comprobarIP

        this.nombre = nombre;
        this.mac = mac;
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {

        String macAjena = ((Host)o).mac;
        macAjena = macAjena.replace(":", "-");
        String macPropia = mac.replace(":", "-");

        if (macPropia.equals(macAjena)) return true;
        return false;
    }

    @Override
    public String toString() {

        return String.format(nombre + " (" + ip + " / " + mac + ")");
    }

    @Override
    public int compareTo(Object o){

        return nombre.compareTo(((Host)o).nombre);
    }


    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103};
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }

        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }
}
