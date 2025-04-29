package ud6.festivalmeigas;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class Meiga implements Comparable<Meiga>{
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

    public static void main(String[] args) {
        
        Meiga[] meigas = crearMeigasExemplo();
        System.out.println("*************************************");
        System.out.println("SIN ORDENAR");
        System.out.println("*************************************");
        System.out.println(Arrays.toString(meigas));
        System.out.println("*************************************");
        System.out.println("ORDEN NATURAL (NOMBRE)");
        System.out.println("*************************************");
        Arrays.sort(meigas);
        System.out.println(Arrays.toString(meigas));
        System.out.println();
        System.out.println("*************************************");
        System.out.println("ORDEN DE ALCUME");
        System.out.println("*************************************");
        sortByAlcume(meigas);
        System.out.println(Arrays.toString(meigas));
        System.out.println("*************************************");
        System.out.println("ORDEN POR NÚMERO DE INGREDIENTES");
        System.out.println("*************************************"); 
        sortByNumIngredientes(meigas);
        System.out.println(Arrays.toString(meigas));
    }

    // Métodos

    @Override
    public String toString() {

        String cad = nome + " - " + alcume + "\n\n";
        for(Feitizo f : feitizosFavoritos)
            cad += f.toString() + "\n";
        cad += "\n";
        Set<Map.Entry<String, Integer>> vistaIngredientes = ingredientes.entrySet();
        for (Map.Entry<String, Integer> i : vistaIngredientes)
            cad += i.getKey() + " - " + i.getValue() + "\n";
        
        return cad + "\n************\n";
    }

    @Override
    public int compareTo(Meiga m) {

        return nome.compareTo(m.nome);
    }

    static void sortByAlcume(Meiga[] meigas) {

        Arrays.sort(meigas, Comparator.comparing(Meiga::getAlcume));
    }

    static void sortByNumIngredientes(Meiga[] meigas) {

        Arrays.sort(meigas, Comparator.comparing(Meiga::contarIngredientes));
    }

    int contarIngredientes() {
        Collection <Integer> numIngredientes = ingredientes.values();
        int cantidad=0;
        for (Integer i : numIngredientes)
            cantidad+=i;
        return cantidad;
    }

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

    public static Meiga[] crearMeigasExemplo() {
    
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
    void lanzarFeitizo(Feitizo f ) {

        Set<String> ing = ingredientes.keySet();
        if(ing.containsAll(f.ingredientes)){
            for (String i : f.ingredientes)
                ingredientes.put(i, ingredientes.get(i)-1);
            System.out.println(nome + " - " + f.getNome());
        }
    }

    //GETTERS Y SETTERS

    public String getNome() {
        return nome;
    }

    public String getAlcume() {
        return alcume;
    }

    public Collection<Feitizo> getFeitizosFavoritos() {
        return feitizosFavoritos;
    }

    public Map<String, Integer> getIngredientes() {
        return ingredientes;
    }

}
