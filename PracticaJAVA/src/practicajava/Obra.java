/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

/**
 *
 * @author Contreras Berbesi
 */
public class Obra {

    private String titulo;
    private Artista autor;
    private int anioEdicion;


    public Obra(){

    }

    public String getTitulo()
    {
        return titulo;
    }


    public void setTitulo(String nomTitulo)
    {
        titulo = nomTitulo;
    }

    public Artista getAutor()
    {
        return autor;
    }

    public void setAutor(Artista objArti)
    {
        autor = objArti;
    }

    public int getAnioEdicion()
    {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioE)
    {
        anioEdicion = anioE;
    }

}
