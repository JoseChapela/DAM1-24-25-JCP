/**E0706. Escribir un programa que lea por teclado una hora cualquiera y un número n que
representa una cantidad en segundos. El programa mostrará la hora introducida y las n
siguientes, que se diferencian en un segundo. Para ello hemos de diseñar previamente la
clase Hora que dispone de los atributos hora, minuto y segundo. Los valores de los
atributos se controlaran mediante métodos set/get. */

package ud3.ejerciciosPrueba;

public class Hora {
    
    private int hora;
    private int minuto;
    private int sec;

    //CONSTRUCTORES

    Hora (int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.sec = segundo;
    }
    
    //METODOS

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
}
