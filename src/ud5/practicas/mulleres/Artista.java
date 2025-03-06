package ud5.practicas.mulleres;

public class Artista extends MullerTraballadora {

    String estilo;

    public Artista(String nome, String apelidos, int anoNacemento, String estilo) {
        
        super(nome, apelidos, anoNacemento);
        this.estilo = estilo;
    }

    String descricionContribucion() {

        return estilo;
    }

    String mostrar() {

        return nome + " " + apelidos + " destacou na arte co estilo: " + estilo;
    }

}
