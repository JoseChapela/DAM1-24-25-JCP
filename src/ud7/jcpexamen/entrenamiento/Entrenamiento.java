/**Jose Chapela Pastoriza */

package ud7.jcpexamen.entrenamiento;

import java.io.Serializable;
import java.util.Objects;

public class Entrenamiento implements Serializable{

    String nome;
    String fecha;
    double km;

    public Entrenamiento(String nome, String fecha, double km) {
        this.nome = nome;
        this.fecha = fecha;
        this.km = km;
    }

    @Override
    public String toString() {
        return nome + " - " + fecha + " - " + km;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Entrenamiento e = (Entrenamiento) obj;
        if (this.nome == e.nome)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

}
