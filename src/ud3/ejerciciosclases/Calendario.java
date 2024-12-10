/**EP0715. Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La clase debe disponer de los métodos:
Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y cuando, la fecha que representen sea correcta. 
void incrementarDia(): que incrementa en un día la fecha del calendario.
void incrementarMes(): que incrementa en un mes la fecha del calendario.
void incrementarAño(int cantidad): que incrementa la fecha del calendario en el número de años especificados. Ten en cuenta que el año 0 no existió. 
void mostrar(): muestra la fecha por consola.
boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.

Por simplicidad, solo tendremos en consideración que existen meses con distinto número de días, pero no tendremos en cuenta los años bisiestos.
 */

package ud3.ejerciciosclases;

public class Calendario {

    private int anho;
    private int mes;
    private int dia;

    // CONSTRUCTOR

    public Calendario(int anho, int mes, int dia) {

        this.anho = anho;

        if (anho == 0)
            this.anho = 1;

        this.mes = mes > 0 && mes < 13 ? mes : 1;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:

                this.dia = dia > 0 && dia < 32? dia : 1;

                break;

            case 2:

                this.dia = dia > 0 && dia < 30? dia : 1;
                
                break;

            default:

                this.dia = dia > 0 && dia < 31? dia : 1;

                break;
        }

    }

    // MÉTODO

    public void incrementarDia() {

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:

                if (dia != 31) {
                    dia++;
                } else {
                    dia = 1;
                    incrementarMes();
                }
                break;

            case 2:

                if (dia != 29) {
                    dia++;
                } else {
                    dia = 1;
                    incrementarMes();
                }
                break;

            default:

                if (dia != 30) {
                    dia++;
                } else {
                    dia = 1;
                    incrementarMes();
                }
                break;
        }
    }

    public void incrementarMes() {

        if (mes != 12) {
            mes++;
        } else {
            mes = 1;
            anho++;
            if (anho == 0) anho++;
        }
    }

    public void incrementarAnho(int anhos) {

        if (anhos < 0 ) anhos = Math.abs(anhos);
        anho += anhos;
        if (anho == 0) anho++;
    }

    public void mostrar() {

        String anhoDisplay = ""+anho;
        if (anho < 0) anhoDisplay = Math.abs(anho) + " A.C.";
        System.out.println(dia + "/" + mes + "/" + anhoDisplay);
    }

    public boolean iguales(Calendario otraFecha) {

        if (otraFecha.anho == anho & otraFecha.mes == mes & otraFecha.dia == dia)
            return true;
        return false;
    }
}
