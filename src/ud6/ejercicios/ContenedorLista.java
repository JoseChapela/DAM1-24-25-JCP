package ud6.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

import ud5.practicas.Inmobiliaria.Casa;

public class ContenedorLista<T> implements Pila<T>{

    T[] objetos;

    
    public ContenedorLista(T[] t) {
        objetos = t;
    }

    void insertarAlPrincipio(T nuevo){
        objetos = Arrays.copyOf(objetos,objetos.length + 1); 
        System.arraycopy(objetos, 0, objetos, 1, objetos.length);
        objetos[0] = nuevo;
    }
    void insertarAlFinal(T nuevo){
        objetos = Arrays.copyOf(objetos,objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }
    T extraerDelPrincipio(){
        return objetos[0];
    }
    T extraerDelFinal(){
        return objetos[objetos.length-1];
    }
    void ordenar(){
        Arrays.sort(objetos);
    }

    @Override
    public String toString() {
        return Arrays.toString(objetos);
    }

    public void apilar (T e) {

        insertarAlFinal(e);
    }

    public T desapilar () {
        
        return extraerDelFinal(); 
    }
    
    public static void main(String[] args) {
        
        Pila<Integer> lista = new ContenedorLista<>(new Integer[0]);
        
        boolean flag=true;
        int num;
        Scanner sc = new Scanner(System.in);

        while(flag) {
            System.out.println("Introduce un número positivo:");
            num = sc.nextInt();
            if (num >= 0) {
                lista.apilar(num);
            } else {
                flag=false;
            }   
        }
        
        //un for con desapilar

    }
}
