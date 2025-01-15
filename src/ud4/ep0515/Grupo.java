/*EP0515. Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
Los alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (números enteros)
del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media del grupo en
cada trimestre y la media del alumno que se encuentra en una posición dada (que el usuario
introduce por teclado). */

package ud4.ep0515;

public class Grupo {

    private String alumno1;
    private String alumno2;
    private String alumno3;
    private String alumno4;
    private String alumno5;
    private int nota;
    private int trimestre;

    //CONSTRUCTOR

    Grupo(String alumno1, String alumno2, String alumno3, String alumno4, String alumno5, int nota, int trimestre) {

        this.alumno1 = alumno1;
        this.alumno2 = alumno2;
        this.alumno3 = alumno3;
        this.alumno4 = alumno4;
        this.alumno5 = alumno5;
        this.nota = nota;
        this.trimestre = trimestre;
    }

    public String getAlumno1() {
        return alumno1;
    }

    public String getAlumno2() {
        return alumno2;
    }

    public String getAlumno3() {
        return alumno3;
    }

    public String getAlumno4() {
        return alumno4;
    }

    public String getAlumno5() {
        return alumno5;
    }

    public int getNota() {
        return nota;
    }

    public int getTrimestre() {
        return trimestre;
    }

    
    
 
}
