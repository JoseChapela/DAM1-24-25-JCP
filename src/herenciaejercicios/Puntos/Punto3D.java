package herenciaejercicios.Puntos;

public class Punto3D extends Punto {

    int z;

    //CONSTRUCTORES

    Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    //MÉTODOS

    double distancia (Punto3D otroPunto) {

        return Math.sqrt(Math.pow(x-otroPunto.x, 2) + Math.pow(y-otroPunto.y, 2) + Math.pow(z-otroPunto.z, 2));
    }

    boolean equals(Punto3D otroPunto) {

        return this.equals(otroPunto);
    }
}
