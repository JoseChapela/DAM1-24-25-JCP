package ud5.practicas.rol;

public class AppCombateSingular {
    public static void main(String[] args) {
        
        Personaje p1 = new Personaje("Boromir", "Humano");
        Personaje p2 = new Personaje ("Legolas", "Elfo");

        //ORDEN DE ATAQUE SEGÚN AGILIDAD

        Personaje[] ordenPelea = QuienVa (p1, p2);

        //ATAQUE HASTA MUERTE DE UN PERSONAJE

        pelea(ordenPelea[0], ordenPelea[1]);
    }

    static Personaje[] QuienVa (Personaje p1, Personaje p2) {

        Personaje primero, segundo;

        if (p1.getAgilidad() > p2.getAgilidad()) {

            primero = p1;
            segundo = p2;
        } else if (p1.getAgilidad() > p2.getAgilidad()) {

            primero = p2;
            segundo = p1;
        } else {

            primero = p1;
            segundo = p2;
            if (Math.round(Math.random()) == 0) {

                primero = p2;
                segundo = p1;
            } 
        }

        Personaje[] tabla = {primero, segundo};

        return tabla;
    }

    static void pelea(Personaje primero, Personaje segundo) {

        int contador = 1;

        primero.mostrar();
        segundo.mostrar();

        while (primero.getHp() > 0 && segundo.getHp() > 0) {

            System.out.println();
            System.out.println("RONDA " + contador);
            contador++;

            System.out.println();
            System.out.println(primero.getNombre() + " (" + primero.getHp() + ") ataca a " + segundo.getNombre() + " (" + segundo.getHp() + ")");

            int ataque1 = primero.atacar(segundo);

            if (ataque1 > 0) {

                System.out.println();
                System.out.println(segundo.getNombre() + " ha recibido " + ataque1 + " ptos de daño");
            } else {

                System.out.println();
                System.out.println(segundo.getNombre() + " ha esquivado el ataque de " + primero.getNombre());
            }


            System.out.println();
            System.out.println("----------------------------------------------------------");

            if (segundo.getHp() > 0) {

                System.out.println();
                System.out.println(segundo.getNombre() + " (" + segundo.getHp() + ") ataca a " + primero.getNombre() + " (" + primero.getHp() + ")");

                int ataque2 = segundo.atacar(primero);

                if (ataque2 > 0) {

                    System.out.println();
                    System.out.println(primero.getNombre() + " ha recibido " + ataque2 + " ptos de daño");
                } else {
    
                    System.out.println();
                    System.out.println(primero.getNombre() + " ha esquivado el ataque de " + segundo.getNombre());
                }

                System.out.println();
                System.out.println("**********************************************************");
            }
        }

        String mostrar = primero.estaVivo() ? "EL GANADOR ES..." + primero.getNombre() : segundo.getNombre();

        System.out.println();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(mostrar);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println();
        primero.mostrar();
        segundo.mostrar();
    }
}
