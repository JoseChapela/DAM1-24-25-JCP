/**EP0711. Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un
libro. Deberá disponer de métodos para incrementar la página leída, para obtener
información de la última página que se ha leído y para comenzar desde el principio una
nueva lectura del mismo libro. */

package ud3.ejerciciosPrueba;

public class MarcaPagina {

    /*private String libro;
    private int numPages;*/
    private int page;

    MarcaPagina ( String libro, int numPages, int page) {

        /*this.libro = libro;
        this.numPages = numPages;*/
        this.page = page;
    }

    public void plusPage(){

        this.page++;
    }

    public int getPage(){

        return this.page;
    }
    
    public void resetLibro(){

        this.page = 0;
    }

    public MarcaPagina() {
    }

    public void setPage(int page){

        if (page >= 0) this.page = page;
    }
}
