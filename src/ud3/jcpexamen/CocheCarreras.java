/**José Chapela Pastoriza */

package ud3.jcpexamen;

public class CocheCarreras {

    private String nombre;
    private double velocidadMax;
    private int numTurbosMax;
    private double autonomia;
    private double autonomiaRes;
    private int turbosRestantes;
    private double distanciaRec;

    //CONSTRUCTORES

    CocheCarreras (String nombre, double velocidadMax, int numTurbosMax, double autonomia) {

        if (velocidadMax < 1) velocidadMax = 1;
        if (velocidadMax > 100) velocidadMax = 100;
        if (numTurbosMax < 0) numTurbosMax = 0;
        if (numTurbosMax > 3) numTurbosMax = 3;
        if (autonomia < 1) autonomia = 1;

        this.nombre = nombre;
        this. numTurbosMax = numTurbosMax;
        this.autonomia = autonomia;
        distanciaRec = 0;
        turbosRestantes = numTurbosMax;
        autonomiaRes = autonomia;

    }

    CocheCarreras (String nombre, double velocidadMax, double autonomia) {

        if (velocidadMax < 1) velocidadMax = 1;
        if (velocidadMax > 100) velocidadMax = 100;
        if (autonomia < 1) autonomia = 1;
        
        this.nombre = nombre;
        this.velocidadMax = velocidadMax;
        this.autonomia = autonomia;
        numTurbosMax = turbosRestantes = 3;
        distanciaRec = 0;
        autonomiaRes = autonomia;
    }

    //MÉTODOS

    public double getAutonomiaRes() {
        
        return autonomiaRes;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public int getTurbosRestantes() {
        
        return turbosRestantes;
    }

    public double getDistanciaRec() {
        
        return distanciaRec;
    }

    public double avanzar () {

        double desplazamiento = (Math.random()* (velocidadMax -1)) + 1;
        
        if (autonomiaRes < desplazamiento) {

            desplazamiento = autonomiaRes;
            distanciaRec +=desplazamiento;
            autonomiaRes = 0;
        } else {

            autonomiaRes -= desplazamiento;
            distanciaRec += desplazamiento;
        }

        return desplazamiento;
    }

    public double usarTurbo () {

        double desplazamiento = 1.5*velocidadMax;

        if (turbosRestantes > 0 && autonomiaRes >= desplazamiento) {

            distanciaRec += desplazamiento;
            autonomiaRes -= desplazamiento;
            turbosRestantes --;
        } else if (turbosRestantes == 0 ) {

            desplazamiento = 0;
        } else {

            desplazamiento = autonomiaRes;
            distanciaRec += desplazamiento;
            autonomiaRes = 0;
        }
        return desplazamiento;
    }

    public void repostar () {

        autonomiaRes = autonomia;
        turbosRestantes = numTurbosMax;
    }

    public void reiniciarDistancia () {

        distanciaRec = 0;
    }

    public void mostrar () {

        System.out.println("Coche: " + nombre);
        System.out.println("Velocidad Máxima: " + velocidadMax + " mps");
        System.out.println("Turbos: " + turbosRestantes);
        System.out.println("Autonomía: " + Math.round(autonomiaRes) + " / " + autonomia);
    }

    public static void main(String[] args) {
        
        System.out.println("RAYO");
System.out.println("====");
CocheCarreras rayo = new CocheCarreras("Rayo", 90, 400);
rayo.mostrar();
rayo.avanzar();
rayo.usarTurbo();
rayo.mostrar();
System.out.println("TRUENO");
System.out.println("======");
CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
trueno.mostrar();
while (trueno.getAutonomiaRes() != 0)
trueno.usarTurbo();
trueno.mostrar();
trueno.repostar();
trueno.mostrar();
    }

}
