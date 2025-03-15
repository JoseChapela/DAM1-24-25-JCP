package ud5.practicas.praiasdegalicia;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class AppOrden {
    public static void main(String[] args) {
        
        // Carga las playas desde el fichero JSON en un array de Praias
        Praia[] praias = Util.importarPraias("praias.json");

        // Ordenar de Norte a Sur
        Praia[] praiaNorteSur = Praia.sortLatitudNorteSur(praias);

        // muestra 
        System.out.println("PRAIAS ORDENADAS POR LATITUD (de norte a sur)");
        System.out.println("=============================================");
        Praia.imprimirLista(praiaNorteSur, 10);

        System.out.println();
        System.out.println();

        // Ordenar por Provincia, Concello y nombre
        Praia[] praiaProvincia = Praia.sortProvinciaConcelloNome(praias);

        // muestra 
        System.out.println("PRAIAS ORDENADAS POR PROVINCIA, CONCELLO E NOME");
        System.out.println("=============================================");
        for (int i = 0; i < praiaProvincia.length; i++) System.out.println(i+1 + " - " + praiaProvincia[i].getProvincia() + " - " + praiaProvincia[i].getConcello() + " - " + praiaProvincia[i].getNome());
    }
    
}
