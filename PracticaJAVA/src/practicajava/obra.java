/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

/**
 *
 * @author Contreras Berbesi
 */
public class obra {
    
    private String titulo;
    private artista autor;
    private int anioEdicion;
   
    
    public obra(){
        
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    
    public void setTitulo(String nomTitulo)
    {
        titulo = nomTitulo;
    }
    
    public artista getAutor()
    {
        return autor;
    }
    
    public void setAutor(artista objArti)
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
