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

    public void cargarDatos() throws IOException{
        BufferedReader leer = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Ingrese titulo de la obra");
        this.titulo = leer.readLine();
        System.out.println("Ingrese año de edicion");
        this.anioEdicion = Integer.parseInt(leer.readLine());
    }
}
