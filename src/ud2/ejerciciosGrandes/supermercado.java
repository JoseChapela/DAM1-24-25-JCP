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

import java.util.Scanner;

public class supermercado {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int decision = 1, cantidad=0,moneda, pago;
        double precio=0, total=0;

        while (decision  <= 5 && decision >= 1 ) {
            System.out.println("Introducir unidades: (1)");
            System.out.println("Conócenos: (2)");
            System.out.println("Ver cantidad total: (3)");
            System.out.println("Cobrar: (4)");
            System.out.println("Reiniciar: (5)");
            System.out.println("SALIR: (0)");
            decision = sc.nextInt();
            
            
            switch (decision) {
                case 1: System.out.println("Introduce el precio del producto:");
                        precio = sc.nextDouble();
                        System.out.println("Introduce cantidad de unidades");
                        cantidad = sc.nextInt();
                    
                    break;

                case 2: System.out.println("Aún no actualizado esta página. \nPerdón por las molestias \n");
                    
                    break;

                case 3: System.out.printf("\nEl total son: %.2f euros", total);
                    
                    break;

                case 4: 
                        System.out.println("En efectivo (0) o tarjeta(1) ?");
                        moneda = sc.nextInt();

                        switch (moneda) {

                            case 0: System.out.println("Introduzca cantidad con la que va a pagar: ");
                                    pago = sc.nextInt();

                                    if (pago<total) {
                                        System.out.println("Cantidad insuficiente");
                                        
                                    } else {
                                        System.out.println(aDevolver(total, pago));
                        
                                    }
                                break;
                            case 1: System.out.println("Procesado");

                                break;
                            default:
                                break;
                        }
                    
                    break;

                case 5: total = precio = cantidad = 0;

                    break;

                case 0: //salir
            
                default: System.out.println("RESPUESTA FUERA DE RANGO \nPOR FAVOR LEA LAS INSTRUCCIONES Y VUELVA A ELEGIR");
                    break;
            }
            total += (precio*cantidad);
        }

        System.out.println("GRACIAS POR VISITARNOS");
    }

    public static String aDevolver (double precio, double dinero) {

        String vuelta="";
        double billete500, billete200, billete100, billete50, billete20, billete10, billete5, moneda2, moneda1, centimo;
        billete500 = precio/500;
        precio %= 500;
        billete200 = precio/200;
        precio %= 200;
        billete100 = precio/100;
        precio %= 100;
        billete50 = precio/50;
        precio %= 50;
        billete20 = precio/20;
        precio %= 20;
        billete10 = precio/10;
        precio %= 10;
        billete5 = precio/5;
        precio %= 5;
        moneda2 = precio/2;
        precio %= 2;
        moneda1 =centimo=precio;

        return vuelta = String.format("Serán: \n %.0f Billetes de 500 \n %.0f Billetes de 200 \n %.0f Billetes de 100 \n %.0f Billetes de 50 \n %.0f Billetes de 20 \n %.0f Billetes de 10 \n %.0f Billetes de 5 \n %.0f Monedas de 2 euros  \n %.0f Monedas de 1 euro \n %.2f céntimos", billete500, billete200, billete100, billete50, billete20, billete10, billete5, moneda2, moneda1, centimo);

    }

}
