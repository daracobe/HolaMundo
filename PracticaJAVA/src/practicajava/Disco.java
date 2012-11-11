/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

import java.io.*;
import java.util.List;

/**
 *
 * @author Fidel
 */
public class Disco extends Obra {

    private String discografica;
    private int nCanciones;
    private String ArtistaNombre;

    public Disco(String titulo, Artista autor, int anioEdicion, String discografia, int nCanciones) {
        //super(titulo,autor,anioEdicion);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnioEdicion(anioEdicion);
        this.discografica = discografia;
        this.nCanciones = nCanciones;
    }
    
    public Disco(){
    
    }

    public String getDiscografica() {
        return this.discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getNCanciones() {
        return this.nCanciones;
    }

    public void setNCanciones(int ncanciones) {
        this.nCanciones = ncanciones;
    }

    public void imprimir() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Año de Edición: " + this.getAnioEdicion());
        System.out.println("Empresa Discografica: " + this.getDiscografica());
        System.out.println("Número de Canciones: " + this.getNCanciones());
    }

    public void cargarDatos(Artista artista) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        super.cargarDatos();
        this.ArtistaNombre = artista.getnombre();

        System.out.println("Ingrese Discográfica");
        this.discografica = leer.readLine();
        System.out.println("Ingrese Número de Canciones");
        this.nCanciones = Integer.parseInt(leer.readLine());

    }

    public Disco[] crearDisco(int cantidad, Artista autor) throws IOException {
        Disco[] discos = new Disco[cantidad];
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < discos.length; i++) {
            discos[i] = new Disco();           
            discos[i].cargarDatos(autor);            
        }

        return discos;
    }

    public void buscar( String Titulo, List<Disco> listaDiscos) {
        
        for (Disco elemento : listaDiscos) // or sArray
        {
            if(Titulo.toLowerCase().equals(elemento.getTitulo().toLowerCase())){
                elemento.imprimir();
            }
        }        
    }

    public void consultarDiscografica(String Discografica, List<Disco> listaDiscos) {
        for (Disco elemento : listaDiscos){
            if(elemento.getDiscografica().toLowerCase().equals(Discografica.toLowerCase()))
                System.out.println("Título: " + elemento.getTitulo() + ", Número de canciones: " + elemento.getNCanciones());
        }        
    }
}
