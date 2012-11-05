/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

import java.io.*;
import java.util.List;


/**
 *
 * @author Contreras Berbesi
 */
public class PracticaJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int opcion = 0;
        int cantidadObra = 0;
        String nombArtista = "";
        obra objObra;
        artista objArtista;
        
        System.out.println("2.- Ingresar Libro");
        System.out.println("3.- Ingresar Disco");
        System.out.println("4.- Ingresar Pelicula");
        
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader   leer = new BufferedReader(lector);

        opcion = Integer.parseInt(leer.readLine());
        
         System.out.println("Ingrese cantidad de obras: ");
         cantidadObra = Integer.parseInt(leer.readLine());
         
                 
         System.out.println("Ingrese nombre del artista: ");
         nombArtista = Integer.parseInt(leer.readLine());
         
        switch(opcion)
        {
            case 1: 
                break;
                
            case 2:
                for(int )
                {
                    
                }
                for(int cObra = 0 ; cObra < cantidadObra; cObra++)
                {
                    
                    
                    
                }
                
                
                
                break;
            
            
        }
        
    }
}
