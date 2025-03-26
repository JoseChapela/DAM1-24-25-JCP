//Jose Chapela Pastoriza

package ud5.jcpexamen;

import java.util.Arrays;
import java.util.Comparator;

import ud5.practicas.praiasdegalicia.Praia;

public class Cliente extends Host {

    // Tu código aquí

    enum SO {WINDOWS, LINUX, MAC, ANDROID, IOS};
    SO s;
    String resolucionPantalla;

    public Cliente(String nombre, String mac, String ip, SO s, String resolucionPantalla) {
        super(nombre, mac, ip);
        this.s = s;
        this.resolucionPantalla = resolucionPantalla;
    }

    public String toString(){

        String cad = s.toString();
        switch (cad) {
            case "WINDOW": cad = "Window"; break;
            case "LINUX": cad = "Linux"; break;
            case "MAC": cad = "Mac"; break;
            case "ANDROID": cad = "Android"; break;
            case "IOS": cad = "Ios"; break;

        }

        return String.format(nombre + " (" + cad + " " + resolucionPantalla + ")");
    }

    public static Cliente[] sortBySistema(Cliente[] c){

        Cliente[] aux = Arrays.copyOf(c, c.length);
        
        Comparator compararPorSistema = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {

                String cad1 = String.valueOf(((Cliente)o1).s);
                String cad2 = String.valueOf(((Cliente)o2).s);
                return cad1.compareTo(cad2);
            }
        };

        Arrays.sort(aux, compararPorSistema);
        return aux;
    }

    public static Cliente[] sortByResolucion(Cliente[] c){

        Cliente[] aux = Arrays.copyOf(c, c.length);
        
        Comparator compararResolucion = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
    
                String cad1 = ((Cliente)o1).resolucionPantalla;
                String cad2 = ((Cliente)o2).resolucionPantalla;

                int num11 = Integer.valueOf(cad1.substring(0, cad1.indexOf('x')));
                int num12 = Integer.valueOf(cad1.substring( cad1.indexOf('x')+1, cad1.length()-1));

                int num21 = Integer.valueOf(cad2.substring(0, cad2.indexOf('x')));
                int num22 = Integer.valueOf(cad2.substring( cad2.indexOf('x')+1, cad2.length()-1));
                
                int res1 = num11 *num12;
                int res2 = num21 *num22;

                return res2 - res1;
            }
        };

        Arrays.sort(aux, compararResolucion);
        return aux;
    }



    public static void main(String[] args) {
        System.out.println("\nClase Cliente");
        System.out.println("=============\n");        
        Cliente cWin1 = new Cliente("Cliente1", "192.168.1.2", "02:1A:2B:3C:4D:5E", SO.WINDOWS, "1920x1080");
        Cliente cLin2 = new Cliente("Cliente2", "192.168.1.3", "01:1A:2B:3C:4D:5F", SO.LINUX, "1366x768");
        Cliente cMac3 = new Cliente("Cliente3", "192.168.1.4", "04:1A:2B:3C:4D:60", SO.MAC, "2560x1440");
        Cliente cAnd4 = new Cliente("Cliente4", "192.168.1.5", "03:1A:2B:3C:4D:61", SO.ANDROID, "1080x2340");
        Cliente cIos5 = new Cliente("Cliente5", "192.168.1.6", "05:1A:2B:3C:4D:62", SO.IOS, "1170x2532");

        Cliente[] clientes = { cWin1, cLin2, cMac3, cAnd4, cIos5 };
        Arrays.sort(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }
 

        // Tu código aquí

        System.out.println();
        System.out.println("Clientes ordenados por SO");
        System.out.println("=========================");
        System.out.println();
       clientes = sortBySistema(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        } 

        System.out.println();
        System.out.println("Clientes ordenados por Resolución");
        System.out.println("=========================");
        System.out.println();
        clientes = sortByResolucion(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        } 

    }
    
}
