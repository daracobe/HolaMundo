/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

/**
 *
 * @author Contreras Berbesi
 */
public class Artista {

    private String nombre;
    private int anioNacimiento;



    public Artista()
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

    /**
     *
     * @param anon
     */
    public void setanonacimiento(int anon)
    {
        anon = anioNacimiento;
    }

    public int getanonacimiento()
    {

        return anioNacimiento;
    }

}
