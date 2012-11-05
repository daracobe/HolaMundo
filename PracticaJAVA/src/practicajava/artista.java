/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Contreras Berbesi
 */
public class artista {
    
    private String nombre;
    private int anioNacimiento;
  
    
    
    public artista(String nomb, int anio)
    {
        nombre = nomb;
        anioNacimiento = anio;
    }
    
    /**
     *
     * @return
     */
    public int getanonacimiento()
    {
        return 0;
    }
    
    public void setanonacimiento(int anon)
    {
        try
        {
            InputStreamReader  teclado = new InputStreamReader(System.in);
            BufferedReader  anio_entrada = new BufferedReader(teclado);
            System.out.println("Ingresar Año de nacimiento del artista:");
            anioNacimiento = Integer.parseInt(anio_entrada.readLine());
        }
        catch (IOException ex){
                    System.out.println("Error en artista");
              }
        
    }
    
    public String getnombre(){
        
        
      return null;
    }
    
    public void setnombre() throws IOException
    {
        try
        {
            InputStreamReader  teclado = new InputStreamReader(System.in);
            BufferedReader  artista_entrada = new BufferedReader(teclado);
            System.out.println("Ingresar Nombre del artista:");
            nombre = artista_entrada.readLine();
         }
        catch (IOException ex){
                    System.out.println("Error en artista");
              }
        
        
    
        
    }


}
