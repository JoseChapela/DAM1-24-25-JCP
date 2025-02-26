package herenciaejercicios;

public class Caja {

double ancho;
double alto;
double fondo;
enum Unidad {cm, m};
Unidad unidad;
String etiqueta;

//CONSTRUCTORES

public Caja(double ancho, double alto, double fondo, Unidad unidad) {
    
    this.ancho = ancho;
    this.alto = alto;
    this.fondo = fondo;
    this.unidad = unidad;
}

//MÉTODOS

double getVolumen() {

    if (unidad.toString() == "m" ) return ancho*alto*fondo;

    return ancho*alto*fondo/100;
}

void setEtiqueta (String etiqueta) {

    this.etiqueta = etiqueta;
}

@Override
public String toString() {

    return etiqueta + String.format("\n ancho: %f.2\n largo: %f.2\n fondo: %f.2\n",ancho, alto, fondo);
}

}
