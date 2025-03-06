package ud5.practicas.mulleres;

public abstract class MullerTraballadora {

    String nome;
    String apelidos;
    int anoNacemento;

    public MullerTraballadora(String nome, String apelidos, int anoNacemento) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.anoNacemento = anoNacemento;
    }

    abstract String descricionContribucion();
    
    int getIdade( int anoActual) {

        return anoActual - anoNacemento;
    }

    abstract String mostrar();

    public static void main(String[] args) {
        
         // Instanciación de mulleres destacadas 
    Cientifica marieCurie = new Cientifica("Marie", "Curie", 1867, "Descubriu o radio e o polonio"); 
        Artista fridaKahlo = new Artista("Frida", "Kahlo", 1907, "Surrealismo e pintura autobiográfica"); 
        Politica rosaParks = new Politica("Rosa", "Parks", 1913, "Loita polos dereitos civís e contra a segregación racial"); 
        Cientifica adaLovelace = new Cientifica("Ada", "Lovelace", 1815, "Primeira programadora da historia"); 
     
        // Array de Mulleres Traballadoras Destacadas 
        MullerTraballadora[] mulleres = {marieCurie, fridaKahlo, rosaParks, adaLovelace};

        System.out.println("=== Mulleres Traballadoras Destacadas ===");
        for (int i = 0; i < mulleres.length; i++) {

            mulleres[i].mostrar();
            System.out.println( mulleres[i].mostrar());
        }

    }
}
