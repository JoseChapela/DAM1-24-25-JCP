package ud5.practicas.Inmobiliaria;

import java.util.Comparator;

public class ComparadorPrecioVenta implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        return ((Inmueble)o1).precioAlquiler - ((Inmueble)o2).precioAlquiler;
    }
    
}
