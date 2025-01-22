/*
 * Registro de tiempos
RegistroTiempos.java
Crea un programa que desde que se inicia registre y almacene los segundos transcurridos
desde el inicio del programa hasta cada vez que se pulsa la tecla Enter. La entrada de
tiempos finalizará cuando se introduzca la letra “F” o “f”, contabilizando también esta
entrada en el registro.
Imagina que se trata del cronómetro utilizado por un profesor de Educación física para
cronometrar los segundos que tarda el alumnado en dar 5 vueltas al campo.
Al terminar la introducción de datos, el programa imprimirá los tiempos recogidos (en
segundos), calculará la media y contabilizará el número de tiempos registrados por encima
de la media, imprimiendo los resultados.
Ejemplos:
1. Se inicia el programa y el usuario pulsa Enter al cabo de 3, 7, y 12 segundos, e
introduce una “F” 20 segundos después de iniciado el programa.
El programa imprimirá lo siguiente:
[3, 7, 12, 20]
Media = 10.5
Número de registros por encima de la media: 2
2. Se inicia el programa y el usuario introduce una “F” al cabo de 5 segundos.
El programa imprimirá lo siguiente:
[5]
Media = 5
Número de registros por encima de la media: 0
Nota: Usa el método now() de la clase LocalTime para obtener la hora del sistema
 */

package ud4.prueba0117;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class RegistroTiempos {
    public static void main(String[] args) {
    
        
        String entrada;
        long[] t = new long[0];
        int numEncimaMedia = 0;
        double media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Pulsa Enter para iniciar el cronómetro");
        sc.nextLine();
        LocalTime inicio = LocalTime.now();

        System.out.println("Pulsa Enter para registrar una marca de tiempo");
        System.out.println("Introduce F o f para finalizar el cronómetro");

        do {
            entrada = sc.nextLine();
            LocalTime marcaTiempo = LocalTime.now();
            // Obtiene el tiempo transcurrido desde el inicio del cronómetro convirtiendo las horas a segundos
            long segundosTranscurridos = marcaTiempo.toSecondOfDay() - inicio.toSecondOfDay();
            System.out.println("Tiempos transcurrido: " + segundosTranscurridos / 60 + " minutos y "
            + segundosTranscurridos % 60 + " segundos");

            t = Arrays.copyOf(t, t.length + 1);
            t[t.length-1] = segundosTranscurridos;

        } while (!entrada.equalsIgnoreCase("f"));

        System.out.println();
        System.out.println(Arrays.toString(t));
        System.out.println();
    
        for( int j = 0; j < t.length; j++) {

            media += t[j]; 
        }
        media /= t.length;

        System.out.printf("MEDIA: = %.2f", media);

        System.out.println();

        for( int j = 0; j < t.length; j++) {

            if (t[j] > media) numEncimaMedia++;
            
        }
    
        System.out.println("Número de registros por encima de la media = " + numEncimaMedia);

        sc.close();
    }
    
}

