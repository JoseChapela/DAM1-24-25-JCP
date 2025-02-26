package herenciaejercicios.Puntos;

public class Punto {

    int x;
    int y;

    //CONSTRUCTORES

    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //MÉTODOS

    double distancia (Punto otroPunto) {

        return Math.sqrt(Math.pow(x-otroPunto.x, 2) + Math.pow(y-otroPunto.y, 2));
    }

    boolean equals(Punto otroPunto) {

        return this.equals(otroPunto);
    }
}
