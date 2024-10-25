/**Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación
 * solicitará el aforo máximo del local, el precio por entrada (suponemos que todas las
 * entradas tienen el mismo precio) y el número de entradas vendidas. Hay que tener
 * en cuenta que si el número de entradas vendidas no supera 20% del aforo del
 * local, se cancela el concierto. Si el número de entradas vendidas no supera el 50%
 * del aforo del local, se realiza una rebaja del 25% del precio de la entrada.
 */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class EJPROPUESTO {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int aforoMaximo, numEntradas;
        double precioEntrada, precioTotal;
        boolean concierto, rebaja = false;
        String respuesta, respuestaBase;

        System.out.println("DINERO RECAUDADO");
        System.out.println("Introduce el aforo máximo del local: ");
        aforoMaximo = sc.nextInt();
        System.out.println("Introduce el precio por entrada");
        precioEntrada = sc.nextInt();
        System.out.println("Introduce el número de entradas vendidad");
        numEntradas = sc.nextInt();
        sc.close();
        
        if ( numEntradas <= aforoMaximo  && numEntradas > aforoMaximo*0.2 ) {

            concierto = true;
            
            if ( numEntradas <= aforoMaximo*0.5) {

            concierto = true;
            rebaja = true;
            precioEntrada *= 0.5;
            
            } 
        
        }else {
            concierto = false;

        }

        precioTotal = precioEntrada*numEntradas;

        respuestaBase = " El dinero recaudado es: %.2f \n El precio por entrada es: %.2f";
        respuesta = !concierto? "No se celebrará el concierto" : rebaja ? String.format(respuestaBase + "\n Se ha aplicado una rebaja del 50 por ciento ", precioTotal,precioEntrada ) : String.format( respuestaBase, precioTotal, precioEntrada) ;

        System.out.println(respuesta);
        
    }
    
}
