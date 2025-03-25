/*E1202. Implementar, con tipos genéricos, la clase Contenedor, donde podremos 
guardar tantos objetos como deseemos. Para ello utilizaremos una tabla, que inicialmente 
tendrá tamaño cero y se irá redimensionando según añadamos o eliminemos elementos. 
La clase, además del constructor y toString(), tendrá los siguientes métodos: 
●  void insertarAlPrincipio(T nuevo) 
●  void insertarAlFinal(T nuevo) 
●  T extraerDelPrincipio()  */

package ud6.ejercicios;

public class Contenedor <K>{

    K[] tabla;
}
