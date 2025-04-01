/*
E1204. Implementar una aplicación que pida por consola números enteros no negativos 
hasta que se introduce un -1. Los números se irán insertando en una colección, 
pudiéndose repetir. Al terminar, se mostrará la colección por pantalla.  
A continuación, se mostrarán todos los valores pares. Por último, se eliminarán todos los 
múltiplos de 3 y se mostrará por pantalla la colección resultante. 
Practica el uso de iteradores y bucles for-each para recorrer la colección. 
 
 */

package ud6.ejercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class E1204 {
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        Collection<Integer> listaEnteros = new ArrayList<>();

        System.out.println("Introduce números enteros no negativos");

        do {

            num = sc.nextInt();
            if(num>=0) listaEnteros.add(num);
        }while(num!=-1);

        Iterator<Integer> it = listaEnteros.iterator();
        while (it.hasNext()) {

            Integer entero = it.next();
            System.out.println(entero);
        }
    }
    
}
