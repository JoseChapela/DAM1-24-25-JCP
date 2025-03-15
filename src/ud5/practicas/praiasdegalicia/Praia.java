package ud5.practicas.praiasdegalicia;

import java.util.Arrays;
import java.util.Comparator;

public class Praia implements Comparable{
    private int id;
    private String nome;
    private String concello;
    private String provincia;
    private double lat;
    private double lon;

    //CONSTRUCTORES

    public Praia() {
    }

    public Praia(int id) {
        this.id = id;
    }

    public Praia(int id, String nome, String concello, String provincia) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Praia(int id, String nome, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    //MÉTODOS

    //toString
    @Override
    public String toString() {

        return String.format("%s (%s)", nome, concello);
    }

    //compareTo
    @Override
    public int compareTo (Object o) {

        return id - ((Praia)o).id;
    }

    //mostrarDetalles
    public void mostrarDetalles() {

        System.out.printf("%d - %s - %s - %s - (%f, %f)\n", id, nome, concello, provincia, lat, lon);
    }

    //imprimirLista
    public static void imprimirLista(Praia[] praias, int numPraias) {

        for (int i = 0; i < numPraias; i++) praias[i].mostrarDetalles();;
    }

    //Ordenar de Norte a Sur
    public static Praia[] sortLatitudNorteSur(Praia[] p) {

        Praia[] aux = Arrays.copyOf(p, p.length);
        
        Comparator compararNorteSur = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
    
                double dif = (((Praia)o2).lat - ((Praia)o1).lat)*100000;
                if (dif > 0) return 1;
                else if (dif < 0) return -1;
                else return 0;
            }
        };
        Arrays.sort(aux, compararNorteSur);
        return aux;
    }

    //Ordenar de Norte a Sur
    public static Praia[] sortProvinciaConcelloNome(Praia[] p) {

        Praia[] aux = Arrays.copyOf(p, p.length);
        
        Comparator compararProvincia = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
    
                return ((Praia)o1).provincia.compareTo(((Praia)o2).provincia);
            }
        };

        Comparator compararConcello = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
    
                return ((Praia)o1).concello.compareTo(((Praia)o2).concello);
            }
        };

        Comparator compararNome = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
    
                return ((Praia)o1).nome.compareTo(((Praia)o2).nome);
            }
        };

        Arrays.sort(aux, compararProvincia.thenComparing(compararConcello).thenComparing(compararNome));
        return aux;
    }

    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

}
