/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;
import java.io.*;
/**
 *
 * @author Oswaldo
 */
public class Pelicula extends Obra {
    private String productora;
    private Artista[] interpretes;
   
    public Pelicula(String titulo, Artista autor, int anioEdicion, String productora, Artista[] interpretes) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnioEdicion(anioEdicion);
        this.productora = productora;
        this.interpretes = interpretes;
    }
    
    public Artista[] getInterpretes(){
        return this.interpretes;
    }
    
    public void setInterpretes(Artista[] interpretes){
        this.interpretes = interpretes;
    }
    
    public String getProductora(){
        return this.productora;
    }
    
    public void setProductora(String productora){
        this.productora = productora;
    }
    
    public void imprimir() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Año de Edición: " + this.getAnioEdicion());
        System.out.println("Interpretes: " + this.getInterpretes());
        System.out.println("Productora: " + this.getProductora());
    }
    
    public void cargarDatos() throws IOException{
        BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));
        super.cargarDatos();
        System.out.println("Ingrese Productora: ");
        this.productora = leer.readLine();
        System.out.println("Ingrese Interpretes: ");
        //this.interpretes = leer.readLine();
    }
}
