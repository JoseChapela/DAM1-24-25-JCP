package ud5.interfacesejercicios.alumnos;

import java.util.Comparator;

public class ComparadorAlumno_edad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        return ((Alumno)o1).edad - ((Alumno)o2).edad;
    }
}
