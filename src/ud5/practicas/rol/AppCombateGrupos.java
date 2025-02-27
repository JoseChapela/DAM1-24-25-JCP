package ud5.practicas.rol;

public class AppCombateGrupos {
    public static void main(String[] args) {

        final int NUM_MIN_INVOLUCRADOS = 1;
        final int NUM_MAX_INVOLUCRADOS = 2;

        Personaje[] grupo1 = crearGrupo(NUM_MIN_INVOLUCRADOS, NUM_MAX_INVOLUCRADOS);
        Personaje[] grupo2 = crearGrupo(NUM_MIN_INVOLUCRADOS, NUM_MAX_INVOLUCRADOS);

        mostrarEquipos(grupo1, grupo2);

        System.out.println();
        System.out.println();
        System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡FIGHT!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println();

        while (algunoVivo(grupo1) && algunoVivo(grupo2)) {

            Personaje p1 = grupo1[(int)Math.random()*grupo1.length];
            Personaje p2 = grupo2[(int)Math.random()*grupo2.length];
            if (!p1.estaVivo() || !p2.estaVivo()) continue;

            Personaje[] batalla = AppCombateSingular.quienVa(p1, p2);
            AppCombateSingular.pelea(batalla[0], batalla[1]);
                
        }

        if (algunoVivo(grupo1)) {

            System.out.println();
            System.out.println("VICTORIA DEL EQUIPO 1");
        } else {

            System.out.println();
            System.out.println("VICTORIA DEL EQUIPO 2");
        }
    }

    static void mostrarEquipos(Personaje[] grupo1, Personaje[] grupo2) {

        System.out.println();
        System.out.println("**********************");
        System.out.println("**********************");
        System.out.println("MIEMBROS DEL EQUIPO 1: ");
        System.out.println("**********************");
        System.out.println("**********************");

        for (int i = 0; i < grupo1.length; i++) {

            grupo1[i].mostrar();
        }

        System.out.println();
        System.out.println("**********************");
        System.out.println("**********************");
        System.out.println("MIEMBROS DEL EQUIPO 2: ");
        System.out.println("**********************");
        System.out.println("**********************");

        for (int i = 0; i < grupo2.length; i++) {

            grupo2[i].mostrar();
        }
    }

    static Personaje[] crearGrupo (int numMin, int numMax) {

        int numGrupo = Personaje.intAleatorioEntre(numMin, numMax);

        Personaje[] grupo = new Personaje[numGrupo];

        for (int i = 0; i < grupo.length; i++) {

            grupo[i] = AppCreaPersonaje.crearPersonaje();
        }
        return grupo;
    }    

    static boolean algunoVivo (Personaje[] grupo) {

        for (int i = 0; i < grupo.length; i++) {

            if (grupo[i].estaVivo()) return true;      
        }
        return false;
    }
}
