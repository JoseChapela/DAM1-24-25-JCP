//José Chapela Pastoriza

package ud6.jcpexamen.festivalmeigas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AppFestival {

    public static void main(String[] args) {
        System.out.println("\nFESTIVAL DE MEIGAS");
        System.out.println("==================\n");
        // Crea un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());

        // TODO: Ordena as Meigas de menor a maior número de feitizos
        List<Meiga> meigas = new ArrayList<>();
        meigas.addAll(List.of(meigasExemplo));
        meigas.sort((c1, c2) -> c1.getFeitizos().size()-c2.getFeitizos().size());

        // Para cada meiga do festival, imprime os seus datos, lanza os
        // feitizos posibles, e imprime os puntos obtidos.

        Map<Meiga, Integer> mapa = new HashMap<>();

        for (Meiga meiga : meigasExemplo) {
            System.out.println("MEIGA: ");
            System.out.println(meiga);
            int puntos = meiga.lanzarFeitizos();
            System.out.println("TOTAL PUNTOS: " + puntos + "\n\n");
            mapa.put(meiga, puntos);
        }

        // Amosa a clasificación final do festival
        System.out.println("Clasificación Final do Festival: ");
        Set<Map.Entry<Meiga, Integer>> mapaFin = mapa.entrySet();
        

        System.out.println("\nFIN DO FESTIVAL DE MEIGAS\n");
    }

}
