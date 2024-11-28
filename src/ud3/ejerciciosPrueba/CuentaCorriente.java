/**E0701. Diseñar la clase cuentacorriente, que almacena los datos: DNI y nombre del
titular, asi como el saldo. Las operaciones típicas con una cuenta corriente son:
● Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
● Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación,
si existe saldo suficiente.
● Ingresar dinero: se incrementa el saldo.
● Mostrar información: muestra la información disponible de la cuenta corriente. */

package ud3.ejerciciosPrueba;

public class CuentaCorriente  {

    private String dni;
    private String nombre;
    private double saldo;
    private static String banco;

    //CONSTRUCTORES__________________________________

    CuentaCorriente (String dni, String nombre) {

        this.dni = dni;
        this.nombre = nombre;
        
    }

    //METODOS________________________________________

    
    
    public void sacarDinero (int cantidad){

        if (this.saldo >= cantidad){

            this.saldo -= cantidad;
            System.out.println("Nuevo saldo: "+this.saldo);
        
        } else {

            System.out.println("Saldo insuficiente");
        }
    }

    public void ingresarDinero (int cantidad){

        this.saldo += cantidad;

    }

    public double getSaldo () {

        return this.saldo;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

}