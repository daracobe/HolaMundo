/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

    Pelicula(){
    
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
    
    public void cargarDatos(Artista nombre_artista) throws IOException{
        int cant_interpretes = 0;
        int anio_Nacimiento = 0;
        String nombre_a = "";
        
        BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));
        super.cargarDatos();
        System.out.println("Ingrese Productora: ");
        this.productora = leer.readLine();
        System.out.println("Ingrese cantidad de interpretes a cargar: ");
        cant_interpretes = Integer.parseInt(leer.readLine());
        Artista[] inerterpretes = new Artista[cant_interpretes];
            for (int cInter = 0; cInter < cant_interpretes; cInter++) {
                System.out.println("Ingresar Nombre del Interprete:");
                nombre_a = leer.readLine();
                System.out.println("Ingresar Año de nacimiento del Interprete:");
                anio_Nacimiento = Integer.parseInt(leer.readLine());
                interpretes[cInter].setnombre(nombre_a);
                interpretes[cInter].setanonacimiento(anio_Nacimiento);
            }

    }
    
    public void BuscarPelicula(String PeliculaBuscar, List<Pelicula> listaPeliculas) {
        for (Pelicula elemento : listaPeliculas){
            if(PeliculaBuscar.equals(elemento.getTitulo().toLowerCase())){
                elemento.imprimir();
            }
        }
    }
    
    public void ConsultarProductora(String ProductoraBuscar, List<Pelicula> listaPeliculas){
        for (Pelicula elemento : listaPeliculas){
            if(ProductoraBuscar.equals(elemento.getProductora().toLowerCase())){
                System.out.println("Productora: " + elemento.getProductora());
            }
        }
    }
}
