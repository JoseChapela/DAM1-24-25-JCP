/**Os radares de tramo consisten en colocar dúas cámaras en dous puntos dunha estrada para comprobar canto tempo tarda un vehículo en percorrer ese tramo. Segundo o teorema de Bonnet-Lagrange ou do valor medio, se a velocidade media dun vehículo ao recorrer o tramo supera a velocidade máxima permitida, podemos asegurar (aínda que non o viramos) que nalgún punto do traxecto superouse a velocidade permitida. 

Por exemplo: si colocamos as cámaras separadas 10Km nun tramo cuxa velocidade está limitada a 110Km/h, e un coche tarda 5 minutos (300) en ser visto pola segunda cámara, saberemos que a súa velocidade media foi de 120Km/h, e polo tanto nalgún sitio superou o límite de velocidade aínda que ao pasar por debaixo das dúas cámaras o coche fose a 80Km/h.

Implementa unha función coa seguinte declaración que acepte como parámetros de entrada a distancia en km, o tempo en segundos e o límite de velocidade en km/h e que devolva 0 se non se superou o límite ou, en caso contrario, o exceso de velocidade en km/h.

static int excesoVelocidade(double distancia, int tempo, int limite);
 */


package ud2.ejerciciosGrandes;

public class Radar {

    static int excesoVelocidade (double distancia, int tempo, int limite){

        tempo /= 60;
        double velocidad = distancia/tempo;
        if (velocidad <= limite) return 0;

        return (int)(velocidad - limite);
    }
    public static void main(String[] args) {

        

        
    }
    
}
