package ud5.interfacesejercicios.futbolista;

import java.util.Comparator;

public class ComparadorFutbolista_nombre implements Comparator {

    public int compare( Object ob1, Object ob2) {

        return ((Futbolista)ob1).nombre.compareTo(((Futbolista)ob2).nombre);
    }
}
