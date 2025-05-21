package probando;

import java.util.Objects;

public class Trabajador {

    String name;
    
    public Trabajador(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override 
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trabajador other = (Trabajador) obj;
        if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
    
    
}
