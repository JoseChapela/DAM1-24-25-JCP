package ud5.practicas.rol;

import java.util.Arrays;

public class AppCombateGrupos {
    public static void main(String[] args) {
        
    

        int numGrupo1 = Personaje.intAleatorioEntre(3, 6);
        int numGrupo2 = Personaje.intAleatorioEntre(3, 6);
        boolean flag = false;

        Personaje[] grupo1 = new Personaje[numGrupo1];
        Personaje[] grupo2 = new Personaje[numGrupo2];

        for (int i = 0; i < grupo1.length; i++) {

            grupo1[i] = AppCreaPersonaje.crearPersonaje();
        }

        for (int i = 0; i < grupo1.length; i++) {

            grupo2[i] = AppCreaPersonaje.crearPersonaje();
        }
        
        while (flag) {

            Personaje p1 = grupo1[(int)Math.random()*numGrupo1];
            Personaje p2 = grupo2[(int)Math.random()*numGrupo2];

            Personaje[] batalla = AppCombateSingular.quienVa(p1, p2);
            AppCombateSingular.pelea(p1, p2);

            if (!p1.estaVivo()) {

                int indice;

                for (int i = 0; i < grupo1.length; i++) {

                    if (grupo1[i].equals(p1)) indice = i;
                }

            }
        }
    }
}
