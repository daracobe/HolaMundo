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

        int max_artista = 0;
        int nro_artista = 0;
        String nombre_a = "";
        int anio_Nacimiento = 0;
        int opcion = 0;
        int cantidadObra = 0;
        int cantidadArtista = 0;
        String nombArtista = "";
        String titulo = "";
        int anioEdicion = 0;
        List<Obra> listaObras = null ;
        Artista objArtista;

        System.out.println("1.- Ingresar Artista");
        System.out.println("2.- Ingresar Libro");
        System.out.println("3.- Ingresar Disco");
        System.out.println("4.- Ingresar Pelicula");

        InputStreamReader  teclado_nro = new InputStreamReader(System.in);
        BufferedReader  nro_entrada = new BufferedReader(teclado_nro);


        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader   leer = new BufferedReader(lector);

        opcion = Integer.parseInt(leer.readLine());

        System.out.println("Ingrese Cantidad de artistas:");
        max_artista = Integer.parseInt(nro_entrada.readLine());

         System.out.println("Ingrese cantidad de obras: ");
         cantidadObra = Integer.parseInt(leer.readLine());


        switch(opcion)
        {
            case 1:
                while(nro_artista < max_artista)
                {
                  InputStreamReader  teclado = new InputStreamReader(System.in);
                  BufferedReader  artista_entrada = new BufferedReader(teclado);
                  System.out.println("Ingresar Nombre del artista:");
                  nombre_a = artista_entrada.readLine();
                  System.out.println("Ingresar Año de nacimiento del artista:");
                  anio_Nacimiento = Integer.parseInt(artista_entrada.readLine());

                  nro_artista ++;
                 }

                break;

            case 2:
            case 3:
            case 4:
                System.out.println("Ingrese cantidad de obras: ");
                cantidadObra = Integer.parseInt(leer.readLine());

                System.out.println("Ingrese nombre del artista de la obra: ");
                nombArtista = leer.readLine();

                //Busco el Artista a asignar la Obra
                for(int cArtis = 0; cArtis < cantidadArtista; cArtis++)
                {
                    //objArtista = ;
                }
                //Creo el objeto Obra para esa Artista
                for(int cObra = 0 ; cObra < cantidadObra; cObra++)
                {
                    Obra auxObra = new Obra();

                    System.out.println("Ingrese titulo de la obra");
                    titulo = leer.readLine();
                    System.out.println("Ingrese año de edicion");
                    anioEdicion = Integer.parseInt(leer.readLine());

                    auxObra.setTitulo(titulo);
                    auxObra.setAnioEdicion(anioEdicion);
                    listaObras.add(auxObra);
                }




        }

    }
}
