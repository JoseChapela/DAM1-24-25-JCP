package herenciaejercicios;

public class CajaCarton extends Caja {

    public CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, Unidad.cm);

    }

    @Override
    double getVolumen () {

        return super.getVolumen()*0.8;
    }

    double getSuperficie() {

        return ancho*alto*4+ancho*ancho*2;
    }
    
    
}
