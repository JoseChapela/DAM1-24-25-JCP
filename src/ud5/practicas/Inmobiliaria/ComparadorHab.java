package ud5.practicas.Inmobiliaria;

import java.util.Comparator;

public class ComparadorHab implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
      
        int hab = ((Inmueble)o1).numHabitaciones - ((Inmueble)o2).numHabitaciones;
    
        if (hab == 0) return ((Inmueble)o2).metrosCuadrados - ((Inmueble)o1).metrosCuadrados;

        return hab;
    }
    
}
