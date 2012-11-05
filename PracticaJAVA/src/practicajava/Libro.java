package practicajava;

/**
 * @author  Miguel Useche
 */
public class Libro extends Obra {
    private String editorial;
    private int nPaginas;

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

    int getNPaginas(){
        return this.nPaginas;
    }

    void setNPaginas( int paginas){
        this.nPaginas = paginas;
    }

    void imprimir( ){
        System.out.println("Titulo: " + this.getTitulo( ) );
        System.out.println("Author: " + this.getAutor().getnombre() );
        System.out.println("Año de edición:  " + this.getAnioEdicion() );
        System.out.println("Editorial:  " + this.getEditorial() );
        System.out.println("Cantidad de páginas: " + this.getNPaginas() );
    }
}
