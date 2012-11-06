package practicajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author  Miguel Useche
 */
public class Libro extends Obra {
    private String editorial;
    private int nPaginas;

    Libro(){

    }

    Libro ( String title, Artista author, int anioEdicion, String edit, int paginas ){
        this.setTitulo( title );
        this.setAutor( author );
        this.setAnioEdicion( anioEdicion );
        this.editorial = edit;
        this.nPaginas = paginas;
    }

    String getEditorial( ){
        return this.editorial;
    }

    void setEditorial( String edit ){
        this.editorial = edit;
    }

    static Libro[] crearLibro(int cantidad){
        Libro[] vector = new  Libro[cantidad];

        for(int i = 0; i < vector.length; i++){

        }

        return vector;
    }

    int getNPaginas(){
        return this.nPaginas;
    }

    void setNPaginas( int paginas){
        this.nPaginas = paginas;
    }

    void imprimir( ){
        System.out.println("Titulo: " + this.getTitulo( ) );
        //System.out.println("Author: " + this.getAutor().getnombre() ); <--- Descomentar al agregar la funcionalidad
        System.out.println("Año de edición:  " + this.getAnioEdicion() );
        System.out.println("Editorial:  " + this.getEditorial() );
        System.out.println("Cantidad de páginas: " + this.getNPaginas() );
    }

    @Override
    public void cargarDatos() throws IOException{
        BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));
        super.cargarDatos();

        System.out.println("Ingrese editorial");
        this.editorial = leer.readLine();
        System.out.println("Ingrese número de páginas");
        this.nPaginas = Integer.parseInt(leer.readLine());
    }

    public void buscar(String tituloBuscar, List<Libro> listaLibros) {

        for (Libro elemento : listaLibros) // or sArray
        {
            if(tituloBuscar.equals(elemento.getTitulo().toLowerCase())){
                elemento.imprimir();
            }
        }
    }

    public void consultarEditorial(String editorialBuscar, List<Libro> listaLibros){

        for (Libro elemento : listaLibros) // or sArray
        {
            if(editorialBuscar.equals(elemento.getEditorial().toLowerCase())){
                System.out.println("Titulo: " + elemento.getTitulo() + " Paginas: " + elemento.getNPaginas() );
            }
        }
    }
}
