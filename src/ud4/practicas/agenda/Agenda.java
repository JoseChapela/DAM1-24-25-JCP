/*
 * Agenda
Implementa una agenda que permita almacenar los datos de contacto (nombre, apellidos,
teléfono, correo electrónico) de personas conocidas.
El programa presentará repetidamente un menú con las siguientes opciones:
1. Añadir contacto: solicitará por teclado la información de una persona y lo añadirá a
la agenda.
2. Listar contactos: mostrará un listado resumido de los contactos en la agenda, cada
uno en una línea, indicando un índice de contacto.
3. Eliminar contacto: Solicitará un número de contacto y, si es válido, lo eliminará de
la agenda.
4. Vaciar agenda: Eliminará todos los contactos de la agenda.
5. Buscar contacto: Solicitará por teclado el nombre del contacto y, si se encuentra,
mostrará el resto de la información. Si existe más de un contacto con el mismo
nombre?
6. SALIR [0]
 */


package ud4.practicas.agenda;

import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int entrada = 13;
        Contacto[] agenda = new Contacto[0];
        
        System.out.println("AGENDA DE CONTACTOS");
        System.out.println("*************************");
       
        while (entrada != 0) {

            System.out.println();
            menu();
            try {
                entrada = sc.nextInt();
            } catch (Exception e) {
                System.out.println();
                System.out.println("Introduce un número");
                sc.next();
                continue;
            }

            System.out.println();
            
            switch (entrada) {

                case 1:
                    try {
                        System.out.println("Introduce el nombre:");
                        String nombre = sc.next();
                        System.out.println("Introduce los apellidos:");
                        String apellidos = sc.next();
                        System.out.println("Introduce el teléfono:");
                        int telefono = sc.nextInt();
                        System.out.println("Introduce el email:");
                        String email = sc.next();
                        Contacto persona = new Contacto(nombre, apellidos, telefono, email);
                        agenda = newContact(persona, agenda);
                    } catch (Exception e) {
                        System.out.println();
                        System.out.println("Datos no válidos");
                        sc.next();
                        continue;
                    }
                    break;

                case 2:
                    listContacts(agenda);
                    break;

                case 3:
                    System.out.println("Introduce el número de contacto a eliminar:");
                    int num = 0;
                    
                    try {
                        num = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println();
                        System.out.println("Carácter no válido");
                        sc.next();
                        continue;
                    }
                
                    try {
                        agenda = deleteContact(num, agenda);
                    } catch (Exception e) {
                        System.out.println();
                        System.out.println(e.getMessage());
                    }  
                    break;

                case 4:
                    agenda = deleteAllContacts(agenda);
                    break;

                case 5:
                    System.out.println("Introduce el nombre del contacto a buscar:");
                    String nombreBuscar = sc.next();
                    searchContact(nombreBuscar, agenda);
                    break;

                case 0:
                    System.out.println("Hasta luego");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        sc.close();
    }

    private static void menu() {

        System.out.println("1. Añadir contacto");
        System.out.println("2. Listar contactos");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Vaciar agenda");
        System.out.println("5. Buscar contacto");
        System.out.println("0. SALIR");
    }

    private static Contacto[] newContact(Contacto persona, Contacto[] agenda ) {

        Contacto[] aux = new Contacto[agenda.length+1];
        System.arraycopy(agenda, 0, aux, 0, agenda.length); 
        aux[aux.length -1] = persona;
        return aux;
    }

    private static void listContacts(Contacto[] agenda) {

        System.out.println("--------CONTACTOS-------");
        System.out.println();
        
        for (int i = 0; i < agenda.length; i++) {

            System.out.println("CONTACTO " + (i+1));
            System.out.println(agenda[i].getNombre() + " " + agenda[i].getApellidos());
            System.out.println(agenda[i].getTelefono());
            System.out.println(agenda[i].getEmail());
            System.out.println();
            System.out.println("*******************************************************");
            System.out.println();
        } 
    }

    private static Contacto[] deleteContact(int num, Contacto[] agenda) {

        if (num < 1 || num > agenda.length) {

            throw new IllegalArgumentException("Número de contacto no existente");
        }

        Contacto[] aux = new Contacto[agenda.length-1];
        int j = 0;
        num --;

        for (int i = 0; i < agenda.length; i++) {

            if (i != num) {

                aux[j] = agenda[i];
                j++;
            }
        }
        return aux;
    }

    private static Contacto[] deleteAllContacts(Contacto[] agenda) {

        Contacto[] aux = new Contacto[0];
        return aux;
    }

    private static void searchContact(String nombre, Contacto[] agenda) {

        System.out.println("--------COINCIDENCIAS-------");
        System.out.println();

        for(int i = 0; i < agenda.length; i++) {

            if (agenda[i].getNombre().equals(nombre) ) {

                System.out.println(agenda[i].getNombre() + " " + agenda[i].getApellidos());
                System.out.println(agenda[i].getTelefono());
                System.out.println(agenda[i].getEmail());
                System.out.println();
                System.out.println("*******************************************************");
                System.out.println();
            }
        }
    }
    
}
