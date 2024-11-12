package ud2.ejerciciosGrandes;

import java.util.Scanner;

public class supermercado {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int decision = 13, cantidad=0;
        double precio=0, total=0;

        while (decision  <= 4 && decision >= 0 ) {
            System.out.println("Introducir unidad: (1)");
            System.out.println("Algo: (2)");
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

                case 2: //cantidad
                    
                    break;

                case 3: System.out.printf("El total es: %0.2", total);
                    
                    break;

                case 4: System.out.println("En efectivo (0) o tarjeta(1) ?");
                        int moneda;
                        moneda = sc.nextInt();
                        switch (moneda) {
                            case 0:
                                
                                break;
                            case 1:

                                break;
                            default:
                                break;
                        }
                    
                    break;

                case 5: //reiniciar

                    break;

                case 0: //salir
            
                default: //fallo
                    break;
            }
            total += precio*cantidad;
        }
    }

}
