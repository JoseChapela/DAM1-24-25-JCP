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

public class Agenda {

    public static void main(String[] args) {
        
        Contacto[] agenda = new Contacto[0];
        Contacto persona1 = new Contacto("Amador", "Garcia", 123, "amador@gmail.com");
        Contacto persona2 = new Contacto("Victor", "Rodriguez", 321, "victor@gmail.com");

        System.out.println("introducimos 2 ocntactos y listamos");
        newContact(persona1, agenda);
        newContact(persona2, agenda);
        listContacts(agenda);
        System.out.println("buscamos contacto");
        searchContact("Amador", agenda);
        System.out.println("borramos primer contacto y listamos");
        deleteContact(persona1, agenda);
        listContacts(agenda);

}

    private static void newContact(Contacto persona, Contacto[] agenda ) {

        Contacto[] aux = new Contacto[agenda.length+1];
        System.arraycopy(agenda, 0, aux, 0, agenda.length);
        
        aux[aux.length -1] = persona;
        agenda = new Contacto[aux.length];
        System.arraycopy(aux, 0, agenda, 0, agenda.length);
    }

    private static void listContacts(Contacto[] agenda) {

        System.out.println("--------CONTACTOS-------");
        System.out.println();
        
        for (int i = 0; i < agenda.length; i++) {

            System.out.println(agenda[i].getNombre() + " " + agenda[i].getApellidos());
            System.out.println(agenda[i].getTelefono());
            System.out.println(agenda[i].getEmail());
            System.out.println();
            System.out.println("*******************************************************");
            System.out.println();
        } 
    }

    private static void deleteContact(Contacto persona, Contacto[] agenda) {

        Contacto[] aux = new Contacto[agenda.length-1];

        for (int i = 0; i < agenda.length; i++) {

            if (agenda[i] == persona) {

                System.arraycopy(agenda, 0, aux, 0, i);
                System.arraycopy(agenda, i + 1, aux, i, aux.length - i);
                agenda = new Contacto[aux.length];
                System.arraycopy(aux, 0, agenda, 0, agenda.length);
                return;
            }
        }

        System.out.println("Contacto no encontrado");
    }

    private static void deleteAllContacts(Contacto[] agenda) {

        agenda = new Contacto[0];
    }

    private static void searchContact(String nombre, Contacto[] agenda) {

        for(int i = 0; i < agenda.length; i++) {

            System.out.println("RESULTADOS:");
            System.out.println();

            if (agenda[i].getNombre() == nombre ) {

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
