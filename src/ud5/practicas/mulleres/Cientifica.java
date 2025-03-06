package ud5.practicas.mulleres;

public class Cientifica extends MullerTraballadora implements IPionera{

    String descubrimento;

    public Cientifica(String nome, String apelidos, int anoNacemento, String descubrimento) {
            
        super(nome, apelidos, anoNacemento); 
        this.descubrimento = descubrimento;
    }

    String descricionContribucion() {

        return descubrimento;
    }

    public String getDescubrimentoOuAporte() {

        return descubrimento;
    }

    String mostrar() {

        return nome + " " + apelidos + " foi unha científica que descubriu: " + descubrimento;
    }
    
}
