package casa.inventario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInventario extends Application{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(AppInventario.class.getResource("Vista.fxml"));
        Scene scene=new Scene(root);
        primaryStage.setTitle("INVENTARIO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /* 
    public static void main(String[] args) {
        System.out.println("OPCIONES");
        System.out.println("0 - SALIR");
        System.out.println("1 - AGREGAR PRODUCTO");
        System.out.println("2 - LISTAR PRODUCTO");
        System.out.println("3 - BUSCAR PRODUCTO");

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        while (entrada!=0){
            switch (entrada) {
                case 0: System.out.println("ADIOS");
                        break;

                case 1: System.out.println("Introduce codigo");
                        int cod = sc.nextInt();
                        System.out.println("Introduce nombre");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        System.out.println("Introduce cantidad");
                        int cantidad = sc.nextInt();
                        System.out.println("Introduce precio");
                        double precio = sc.nextDouble();
                        agregarProducto(new Producto(cod, nombre, cantidad, precio));
                        break;

                case 2: listarProductos();
                        break;
                
                case 3: System.out.println("Introduce codigo");
                        cod = sc.nextInt();
                        Producto p = buscarProducto(cod);
                        if (p==null)
                            System.out.println("El producto no se encuentra en el inventario");
                        else
                            System.out.println(p);
                        break;
                default: System.out.println("Numero fuera de rango");
            }
            if (entrada==0)
                continue;
            System.out.println("OPCIONES");
            System.out.println("0 - SALIR");
            System.out.println("1 - AGREGAR PRODUCTO");
            System.out.println("2 - LISTAR PRODUCTO");
            System.out.println("3 - BUSCAR PRODUCTO");
            entrada=sc.nextInt();
        }
    }
    */

    static boolean agregarProducto(Producto producto){
        if(buscarProducto(producto.getCodigo())!=null || producto.getNombre().equals(""))
            return false;
        
        List<Producto> lista= getLista();

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/casa/inventario/inventario.dat"))){
            lista.add(producto);
            out.writeObject(lista);
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    static void listarProductos(){

        System.out.println(getLista());
    }

    static Producto buscarProducto(int codigo){
        List<Producto> lista= getLista();
        if (lista.contains(new Producto(codigo, null, 0, 0)))
            return lista.get(lista.indexOf(new Producto(codigo, null, 0, 0)));
        return null;
    }

    static List<Producto> getLista(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/casa/inventario/inventario.dat"))){
            List<Producto> p = (List<Producto>)in.readObject();
            p.sort((p1,p2)-> p1.getCodigo()-p2.getCodigo());
            return p;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return new ArrayList<Producto>();
    }
    
}
