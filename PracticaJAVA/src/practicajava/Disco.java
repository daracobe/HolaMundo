/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

import java.io.*;

/**
 *
 * @author Fidel
 */
public class Disco extends Obra {

    private String discografica;
    private int nCanciones;

    public Disco(String titulo, Artista autor, int anioEdicion, String discografia, int nCanciones) {
        //super(titulo,autor,anioEdicion);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnioEdicion(anioEdicion);
        this.discografica = discografia;
        this.nCanciones = nCanciones;
    }

    public String getDiscografica() {
        return this.discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public int getNCanciones() {
        return this.nCanciones;
    }

    public void setNCanciones(int ncanciones) {
        this.nCanciones = ncanciones;
    }

    public void imprimir() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Año de Edición: " + this.getAnioEdicion());
        System.out.println("Empresa Discografica: " + this.getDiscografica());
        System.out.println("Número de Canciones: " + this.getNCanciones());
    }

    public void cargarDatos() throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        super.cargarDatos();

        System.out.println("Ingrese Discográfica");
        this.discografica = leer.readLine();
        System.out.println("Ingrese Número de Canciones");
        this.nCanciones = Integer.parseInt(leer.readLine());

    }

    public Disco[] crearDisco(int cantidad, Artista autor) throws IOException {
        Disco[] discos = new Disco[cantidad];
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < discos.length; i++) {
            discos[i].setAutor(autor);
            System.out.println("Ingrese Título: ");
            discos[i].setTitulo(leer.readLine());
            System.out.println("Ingrese Año de Edición: ");
            discos[i].setAnioEdicion(Integer.parseInt(leer.readLine()));
            System.out.println("Ingrese Empresa Discográfica: ");
            discos[i].setDiscografica(leer.readLine());
            System.out.println("Ingrese el Número de Canciones: ");
            discos[i].setNCanciones(Integer.parseInt(leer.readLine()));
        }

        return discos;
    }

    public void buscar(String Titulo, Disco[] discos) {
        for (int i = 0; i < discos.length; i++) {
            if (discos[i].getTitulo().toLowerCase().equals(Titulo.toLowerCase())) {
                discos[i].imprimir();
            }

        }
    }

    public void consultarDiscografica(String Discografica, Disco[] discos) {
        for (int i = 0; i < discos.length; i++) {
            if (discos[i].getDiscografica().toLowerCase().equals(Discografica.toLowerCase())) {
                System.out.println("Título: " + discos[i].getTitulo() + ", Número de canciones: " + discos[i].getNCanciones());
            }

        }
    }
}
