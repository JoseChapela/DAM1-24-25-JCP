package ud3.ejerciciosPrueba;

import ud3.ejercicios.Punto;

public class Prueba { 
    public static void main(String[] args) {

        double x = -1;
        double y = 0;
        double x2 = 3;
        double y2 = 0;

        Punto punto = new Punto (x, y);
        Punto punto2 = new Punto (x2, y2);
       
        System.out.println( punto.distanciaEuclidea(punto2));
    }
}
