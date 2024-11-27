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
    private double saldo = 0;


    CuentaCorriente (String dni, String nombre) {

        this.dni = dni;
        this.nombre = nombre;
        
    }

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

}