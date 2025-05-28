/**Jose Chapela Pastoriza */

package ud7.jcpexamen.web;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class GeneraWeb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String titulo, descripcion, texto, url, nomeArchivo;

        System.out.println("GENERADOR WEB");
        System.out.println("---PARAMETROS---");
        System.out.println("Introduce nombre de archivo a guardar:");
        nomeArchivo = sc.nextLine();
        System.out.println("Introduce Título");
        titulo = sc.nextLine();
        System.out.println("Introduce Descripción");
        descripcion = sc.nextLine();
        System.out.println("Introduce Texto Enlace");
        texto = sc.nextLine();
        System.out.println("Introduce URL Enlace");
        url = sc.nextLine();

        generarPaginaWeb(titulo, descripcion, texto, url, nomeArchivo);
    }

    static void generarPaginaWeb(String titulo, String descripcion, String texto, String url, String nomeArchivo) {

        try (BufferedWriter out = new BufferedWriter(
                new FileWriter("src/ud7/jcpexamen/web/" + nomeArchivo + ".html"))) {
            out.write("<html>");
            out.newLine();
            out.write("<head>");
            out.newLine();
            out.write("<title>" + titulo + "</title>");
            out.newLine();
            out.write("<meta charset=\"utf-8\">");
            out.newLine();
            out.write("</head>");
            out.newLine();
            out.newLine();
            out.write("<body>");
            out.newLine();
            out.write("<h1>" + titulo + "</h1>");
            out.newLine();
            out.newLine();
            out.write("<p>" + descripcion + ". <br/>");
            out.newLine();
            out.write("<a href=\"" + url + "\">" + texto + "</a>");
            out.newLine();
            out.write("</p>");
            out.newLine();
            out.newLine();
            out.write("</body>");
            out.write("</html>");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}