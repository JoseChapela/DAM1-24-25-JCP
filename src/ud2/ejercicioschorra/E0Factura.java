/**Factura (Factura.java). Escribe un programa para emitir la factura de compra de un producto,
introduciendo el precio del producto y el número de unidades compradas. La factura deberá añadir
al total un IVA (Impuesto del Valor Añadido) del 21%. Si el precio final con IVA es superior a 100
euros se aplicará un descuento del 5%. */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0Factura {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final double IVA = 1.21, DESCUENTO = 0.95;

        double precio, uds;

        System.out.println("Introduce precio del producto en euros:");
        precio = sc.nextDouble();
        System.out.println("Introduce el número de unidades:");
        uds = sc.nextDouble();
        sc.close();

        precio *= IVA * uds;

        if (precio > 100) {
            precio *= DESCUENTO;
            
        } 
        System.out.printf("La factura será de: %.2f", precio," euros");


        }
       
    }
    

