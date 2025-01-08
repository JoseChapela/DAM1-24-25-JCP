package ud4;

public class Empleado {
    
    private String nombre;
    private float sueldo;

    //CONSTRUCTOR 

    Empleado (String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //MÉTODOS

    public static void main(String[] args) {
        
        Empleado[] t = new Empleado[3];
        Empleado e1 = new Empleado("Juan", 3000);
        Empleado e2 = new Empleado("Santiago", 2050);
        Empleado e3 = new Empleado("Javier", 1500);
        t[0] = e1; 
        t[1] = e2;
        t[2] = e3;
    }


}
