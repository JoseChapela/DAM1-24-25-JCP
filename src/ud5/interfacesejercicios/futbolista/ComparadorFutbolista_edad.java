package ud5.interfacesejercicios.futbolista;

import java.util.Comparator;

public class ComparadorFutbolista_edad implements Comparator {

    public int compare (Object ob1, Object ob2) {

        return ((Futbolista)ob1).edad - ((Futbolista)ob2).edad;
    }
    
}
