package ud5.ejercicios.E0801;

public class Hora {

    private int hora;
    private int minuto;
    
    //CONSTRUCTOR

    Hora (int hora, int minuto) {

        this.hora = hora;
        this.minuto = minuto;
    }

    //MÉTODOS

    void inc () {

        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }
        if (hora == 24) hora = 0;  
    }

    boolean setMinuto (int valor) {

        if (valor >= 0 && valor <= 59) {

            minuto = valor;
            return true;
        }
        return false;
    }

    boolean setHora (int valor) {

        if (valor >= 0 && valor <= 23) {

            hora = valor;
            return true;
        }
        return false;
    }

    public String toString () {

        return String.format("%2.0s:%2.0s", hora, minuto);
    }

    public static void main(String[] args) {
        
        Hora hora = new Hora(3, 23);
        System.out.println(hora.toString());
    }
    
}
