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
    private Artista[] interpretes = null;
    private String artistaNombre;
   
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
        System.out.println("Artista: " + this.artistaNombre);
        System.out.println("Título de la Película: " + this.getTitulo());
        System.out.println("Año de Edición: " + this.getAnioEdicion());
        System.out.println("Interpretes: "); 
        for (int i = 0; i < interpretes.length  ; i++) {
            System.out.println("["+(i+1)+"]"+ this.interpretes[i].getnombre()+" - Año Nacimiento: "+this.interpretes[i].getanonacimiento());
        }
        System.out.println("Productora: " + this.getProductora());
    }
    
    public void cargarDatos(Artista nombre_artista) throws IOException{
        int cant_interpretes = 0;
        int anio_Nacimiento = 0;
        String nombre_a = "";

        BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));
        super.cargarDatos();
        this.artistaNombre = nombre_artista.getnombre();
        System.out.println("Ingrese Productora: ");
        this.productora = leer.readLine();
        System.out.println("Ingrese cantidad de interpretes a cargar: ");
        cant_interpretes = Integer.parseInt(leer.readLine());
             interpretes = new Artista[cant_interpretes];
             
            for (int cInter = 0; cInter < cant_interpretes; cInter++) {
                System.out.println("Ingresar Nombre del Interprete ["+(cInter+1)+"]:");
                nombre_a = leer.readLine();
                System.out.println("Ingresar año de nacimiento del Interprete ["+(cInter+1)+"]:");
                anio_Nacimiento = Integer.parseInt(leer.readLine());
                Artista auxiliarArtista = new Artista();
                auxiliarArtista.setnombre(nombre_a);
                auxiliarArtista.setanonacimiento(anio_Nacimiento);
                interpretes[cInter] = auxiliarArtista;
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
