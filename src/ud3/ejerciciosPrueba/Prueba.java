package ud3.ejerciciosPrueba;

import ud3.ejercicios.Calendario;

public class Prueba { 
    public static void main(String[] args) {

        int anho = -1;
        int mes = 12;
        int dia = 31;
        int dia2 = 31;

        Calendario calendar = new Calendario (anho, mes, dia);
        calendar.mostrar();          
        calendar.incrementarAnho(1);
        calendar.mostrar();

    }
}
