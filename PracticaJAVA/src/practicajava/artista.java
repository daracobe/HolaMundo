/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

/**
 *
 * @author Contreras Berbesi
 */
public class artista {
    
    private String nombre;
    private int anioNacimiento;
  
    
    
    public artista()
    {
        
    }

    public void setnombre(String nombre_a) 
    {
       nombre = nombre_a;
    
    }
    
    public String getnombre()
    {
        return nombre;
    }
    
    public void setanonacimiento(int anon)
    {
        anon = anioNacimiento;  
    }
     
    public int getanonacimiento()
    {
        
        return anioNacimiento;
    }

}
