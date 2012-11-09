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
    private String artistaNombre;
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

    static Libro[] crearLibro(int cantidad) throws IOException{
        Libro[] vector = new  Libro[cantidad];
        Artista artista = new Artista();
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < vector.length; i++){
                vector[i] = new Libro();

                System.out.println("Ingrese el nombre del artista del libro");
                artista.setnombre(lector.readLine());
                vector[i].cargarDatos(artista);
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
        System.out.println("Artista: " + this.artistaNombre);
        System.out.println("Titulo: " + this.getTitulo( ) );
        System.out.println("Año de edición:  " + this.getAnioEdicion() );
        System.out.println("Editorial:  " + this.getEditorial() );
        System.out.println("Cantidad de páginas: " + this.getNPaginas() );
    }


    public void cargarDatos(Artista nombre_artista) throws IOException{
        BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));
        super.cargarDatos();
        this.artistaNombre = nombre_artista.getnombre();

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
