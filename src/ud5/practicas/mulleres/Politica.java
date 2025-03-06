package ud5.practicas.mulleres;

public class Politica extends MullerTraballadora implements IActivista {

    String causa;

    public Politica(String nome, String apelidos, int anoNacemento, String causa) {
        
        super(nome, apelidos, anoNacemento);
        this.causa = causa;
    }

    public String getCausaDefendida() {

        return causa;
    }

    String descricionContribucion() {
   
        return causa;
    }

    String mostrar() {

        return nome + " " + apelidos + " foi unha política e activista destacada por: " + causa;
    }
    
}
