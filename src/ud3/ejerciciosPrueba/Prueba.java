package ud3.ejerciciosPrueba;

public class Prueba {
    public static void main(String[] args) {

        String nombre = "Jose", dni = "1";
        
        CuentaCorriente p = new CuentaCorriente();
        p.crearCuenta(dni, nombre );
        p.ingresarDinero(200);
        System.out.println(p.getSaldo());

        CuentaCorriente p2 = new CuentaCorriente();
    }
    
}
