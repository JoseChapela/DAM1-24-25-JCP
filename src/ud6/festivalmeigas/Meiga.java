package ud6.festivalmeigas;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Meiga {
    // Atributos
    String nome;
    String alcume;
    Collection<Feitizo> feitizosFavoritos;
    Map<String, Integer> ingredientes;

    // Constructores
    Meiga( String nome, String alcume, Collection<Feitizo> feitizosFavoritos, Map<String, Integer> ingredientes) {
        this.nome = nome;
        this.alcume=alcume;
        this.feitizosFavoritos=feitizosFavoritos;
        this.ingredientes=ingredientes;
        
    }

    // Métodos

    static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> feitizos) {

        Collection<Feitizo> feitizosRnd = new HashSet<>();
        for (Feitizo f : feitizos) 
            if (Math.round(Math.random())>0)
                feitizosRnd.add(f);
        
        return feitizosRnd;
    }

    static Map<String, Integer> getIngredientesRnd(Collection<String> ingredientes, int cantidad) {

        Random rnd = new Random();
        Map<String,Integer> ingredientesRnd = new HashMap<>();
        for (String ingrediente : ingredientes) 
            if (Math.round(Math.random())>0)
                ingredientesRnd.put(ingrediente, rnd.nextInt(1, cantidad+1));
        
        return ingredientesRnd;
    }

    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        Random rnd = new Random();
    
        String[] nomes = {"Uxía", "Lúa", "Iria", "Noa"};
        String[] alcumes = {"A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema"};
    
        Meiga[] meigas = new Meiga[nomes.length];

        // Obtén todos os feitozos de exemplo e todos os seus ingredientes únicos
        Collection<Feitizo> feitizosExemplo = List.of(Feitizo.crearFeitizosExemplo());
        Collection<String> ingredientesExemplo = Feitizo.ingredientesUnicos(feitizosExemplo);

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            String alcume = alcumes[i];
            // Xera unha colección cunha selección aleatoria de feitizos de exemplo para asignar á meiga
            Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);
            // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada un de exemplo para asignar á meiga
            Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);
    
            // Crea a meiga e a engade ao array
            meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
        }

        return meigas;

    }

}
