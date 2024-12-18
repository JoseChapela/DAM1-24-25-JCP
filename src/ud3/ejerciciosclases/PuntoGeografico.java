package ud3.ejerciciosclases;

public class PuntoGeografico {

    private double latitud;
    private double longitud;
    private String name;

    //CONSTRUCTORES

    PuntoGeografico(String name, double latitud, double longitud) {

        if (latitud > 90 || latitud < -90) throw new IllegalArgumentException("Latitud fuera de rango");
        if (latitud >= 180 || latitud <= -180) throw new IllegalArgumentException("Longitud fuera de rango");
        

        this.latitud = latitud;
        this.longitud = longitud;
        this.name = name;   
    }

    PuntoGeografico (String name) {

        this(name, 0, 0);
    }

    PuntoGeografico (double latitud, double longitud) {

        this(null, latitud, longitud);
    }

    //MÉTODOS

    private String degreesToString (double num) {

        double degree, minute, sec;

        degree = (int)num;
        minute =(num - degree) * 60;
        sec = (minute - (int)minute) * 60;
        return String.format("%.0f grados %.0f minutos %.0f segundos", degree, minute, sec);
    }

    public void mostrar () {

        System.out.println(degreesToString(latitud));
        System.out.println(degreesToString(longitud));
    }

    public String urlGoogleMaps() {
       
        return String.format("https://www.google.es/maps/@%0.7f,%0.7f,12z", latitud, longitud);
    }

    public String urlOpenStreetMaps() {
        
        return String.format("https://www.openstreetmap.org/#map=14/%0.7f/%0.7f", latitud, longitud);
    }

    public String urlNominatimXml() {

        return String.format("https://nominatim.openstreetmap.org/reverse?format=xml&lat=%0.7f&lon=%0.7f&zoom=14", latitud, longitud);
    }

    public String urlNominatimJson() {

        return String.format("https://nominatim.openstreetmap.org/reverse?format=jsonv2&lat=%0.7f&lon=%0.7f", latitud, longitud);
    }

    public PuntoGeografico randomPoint () {

        double latitud = (Math.random()*(180))-90; //puede tocar el -90
        double longitud = (Math.random()*(360))-180; //puede tocar el -180

        PuntoGeografico x = new PuntoGeografico(latitud, longitud);
        return x;
    }



    public static void main(String[] args) {

        double latitud = 23.5;
        double longitud = 22.345;
        
       PuntoGeografico x = new PuntoGeografico(latitud, longitud);
       x.mostrar();
    }

}
