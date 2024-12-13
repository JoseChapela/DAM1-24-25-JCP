/**Implementa un programa que simule el proceso de cobro en la caja de un supermercado.

Para calcular el importe total que debe pagar cada cliente el programa solicitará introducir el precio de cada producto, expresado en euros con hasta 2 decimales, y la cantidad de unidades del mismo, expresado como un número entero.
El programa deberá controlar los posibles errores o excepciones en la entrada de datos por teclado, informando al usuario y permitiendo repetir la entrada. 
La condición para finalizar la introducción de productos queda a criterio del programador. Puede ser, por ejemplo, introducir un importe igual a cero o negativo.
Una vez terminado de introducir los productos, el programa mostrará el importe total de la compra y solicitará al usuario el medio de pago elegido por el cliente: “con tarjeta” o “en efectivo”.
Si el método de pago elegido es “con tarjeta”, se dará por finalizada la compra de ese cliente.
Si el método de pago elegido es “en efectivo”, entonces se solicitará el importe pagado por el cliente y se calculará el cambio a devover, desglosando dicha cantidad en billetes y monedas de € y de 1 céntimos de euro.
Una vez finalizada la compra de un cliente el programa solicitará si se desea repetir el proceso para un nuevo cliente.
 */

package ud2.ejerciciosGrandes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class supermercado {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int decision = 13, cantidad=1,moneda;
        double precio=0, total=0, aPagar=0;

        do {

            System.out.println();
            System.out.println("*************************");
            System.out.println("Introducir producto: (1)");
            System.out.println("Conócenos: (2)");
            System.out.println("Ver cantidad total: (3)");
            System.out.println("Cobrar: (4)");
            System.out.println("Reiniciar: (5)");
            System.out.println("SALIR: (0)");
            System.out.println("*************************");
            System.out.println();

            try { decision = sc.nextInt();}
            catch (InputMismatchException e) {
                System.out.println("Entrada no recogida");
                System.out.println(e.toString());
                System.out.println();
                sc.nextLine();
                continue;

            }
           
            System.out.println();
                       
            switch (decision) {
                case 1: do {
                            System.out.println("Introduce el precio del producto:");
                            try {precio = sc.nextDouble();}
                            catch (InputMismatchException e) {
                                System.out.println("Entrada no recogida");
                                System.out.println(e.toString());
                                System.out.println();
                                sc.nextLine();
                                continue;
                
                            }
                            System.out.println();

                            System.out.println("Introduce cantidad de unidades");
                            try {cantidad = sc.nextInt();}
                            catch (InputMismatchException e) {
                                System.out.println("Entrada no recogida");
                                System.out.println(e.toString());
                                System.out.println();
                                sc.nextLine();
                                continue;
                
                            }
                            System.out.println();
                            if (precio <= 0 || cantidad  <= 0)
                            System.out.println("Precio y cantidad tiene que tener un valor mayor que 0 \n");

                        } while (precio <= 0 || cantidad  <= 0);
                        
                        total += (precio*cantidad);
                    
                    break;

                case 2: System.out.println("Aún no hemos actualizado esta página");
                        System.out.println("Estate pendiente de nuevas actualizaciones");
                        System.out.println();
                    
                    break;

                case 3: System.out.println("*****************************");
                         System.out.printf("El total son: %.2f euros \n", total);
                         System.out.println("*****************************");
                         System.out.println();
                    
                    break;

                case 4: 
                        do {
                            System.out.println("En efectivo (0) o tarjeta(1) ?");
                            try {moneda = sc.nextInt();}
                            catch (InputMismatchException e) {
                                System.out.println("Entrada no recogida");
                                System.out.println(e.toString());
                                System.out.println();
                                sc.nextLine();
                                moneda = 13;
                                continue;
                
                            }
                            System.out.println();

                            switch (moneda) {

                                case 0: do {
                                            System.out.println("Introduzca cantidad con la que va a pagar: ");
                                            try {aPagar = sc.nextDouble();}
                                            catch (InputMismatchException e) {
                                                System.out.println("Entrada no recogida");
                                                System.out.println(e.toString());
                                                System.out.println();
                                                sc.nextLine();
                                                continue;
                                
                                            }
                                        }while (aPagar <= 0);
                                        System.out.println();

                                        if (aPagar<total) {
                                            System.out.println("Cantidad insuficiente");
                                            System.out.println();
                                            
                                        } else {
                                            System.out.println(aDevolver(total, aPagar));
                                            System.out.println();
                            
                                        }
                                    break;

                                case 1: System.out.println("Procesado");
                                        System.out.println();

                                    break;

                                default: System.out.println("RESPUESTA FUERA DE RANGO \nPOR FAVOR LEA LAS INSTRUCCIONES Y VUELVA A ELEGIR");
                                        System.out.println();

                                    break;

                            }

                        } while (moneda > 1 || moneda <0);

                        do {
                            System.out.println("Desea realizar otra compra?");
                            System.out.println("Sí (1)");
                            System.out.println("No (0)");
                            try {decision = sc.nextInt();}
                            catch (InputMismatchException e) {
                                System.out.println("Entrada no recogida");
                                System.out.println(e.toString());
                                System.out.println();
                                sc.nextLine();
                                decision = 13;
                                continue;
                
                            }
                            System.out.println();
                        } while (decision != 0 && decision != 1);

                case 5: total = precio = cantidad = 0;

                    break;

                case 0: 

                    break;
            
                default: System.out.println("RESPUESTA FUERA DE RANGO \nPOR FAVOR LEA LAS INSTRUCCIONES Y VUELVA A ELEGIR");
                            System.out.println();

                    break;
            }

        } while (decision !=0);

        System.out.println("GRACIAS POR SU VISITA");
        System.out.println("PROGRAMA CERRADO");
        sc.close();
    }

    public static String aDevolver (double total, double aPagar) {

        int billete500, billete200, billete100, billete50, billete20, billete10, billete5, moneda2, moneda1, centimo, precioEntero;
        double precioReal = aPagar - total;
        String linea = "";
        precioEntero = (int)precioReal;
        centimo = (int)(Math.round((precioReal-precioEntero)*100));

        billete500 = precioEntero/500;
        precioEntero %= 500;
        linea += billete500 == 0? "" : billete500+" Billetes de 500 \n";
        billete200 = precioEntero/200;
        precioEntero %= 200;
        linea += billete200 == 0? "" : billete200+" Billetes de 200\n";
        billete100 = precioEntero/100;
        precioEntero %= 100;
        linea += billete100 == 0? "" : billete100+" Billetes de 100\n";
        billete50 = precioEntero/50;
        precioEntero %= 50;
        linea += billete50 == 0? "" : billete50+" Billetes de 50\n";
        billete20 = precioEntero/20;
        precioEntero %= 20;
        linea += billete20 == 0? "" : billete20+" Billetes de 20\n";
        billete10 = precioEntero/10;
        precioEntero %= 10;
        linea += billete10 == 0? "" : billete10+" Billetes de 10\n";
        billete5 = precioEntero/5;
        precioEntero %= 5;
        linea += billete5 == 0? "" : billete5+" Billetes de 5\n";
        moneda2 = precioEntero/2;
        precioEntero %= 2;
        linea += moneda2 == 0? "" : moneda2+" Monedas de 2 euros\n";
        moneda1 = precioEntero;
        linea += moneda1 == 0? "" : moneda1+" Monedas de 1 euros\n";

        linea += centimo + " centimos\n";

        return String.format("Serán: \n \n"+linea);

    }


}
