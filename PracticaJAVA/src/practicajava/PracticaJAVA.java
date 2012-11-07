/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicajava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Caceres Oswaldo
 * @author Contreras Dariana
 * @author Duque Fidel
 * @author Galvis Mayra
 * @author Useche Miguel
 */
public class PracticaJAVA {

    static public List<Libro> listaLibros = null;

    public static void main(String[] args) throws IOException {

        int max_artista = 0;
        int nro_artista = 0;
        int anioEdicion = 0;
        int anio_Nacimiento = 0;
        int opcion = 0;
        String nombre_a = "";
        String titulo = "";
        

        
        List<Artista> listaArtista = null;

        Artista auxArtista = new Artista();
        
    do{
        System.out.println("1.- Ingresar Artista");
        System.out.println("2.- Ingresar Obras");
        System.out.println("3.- Ingresar Disco");
        System.out.println("4.- Ingresar Pelicula");
        System.out.println("5.- Salir");

        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader   leer = new BufferedReader(lector);

        opcion = Integer.parseInt(leer.readLine());

        switch(opcion)
        {
            case 1:
                listaArtista = new ArrayList<Artista>();
                System.out.println("Ingrese Cantidad de artistas:");
                max_artista = Integer.parseInt(leer.readLine());
                
                while(nro_artista < max_artista)
                {
                  System.out.println("Ingresar Nombre del artista:");
                  nombre_a = leer.readLine();
                  
                  System.out.println("Ingresar Año de nacimiento del artista:");
                  anio_Nacimiento = Integer.parseInt(leer.readLine());

                  nro_artista ++;
                  
                  auxArtista.setnombre(nombre_a);
                  auxArtista.setanonacimiento(anio_Nacimiento);
                  
                  //FALTABA ESTO
                  listaArtista.add(auxArtista);
                 }

                break;

            case 2:
                asignarObra(listaArtista);
                subMenuObra();
                break;

            case 3:
            case 4:
                

            default:
                System.out.println("Opción inválida.");
        
        }
                
        }while(opcion != 5);
    }

   static public void subMenuObra() throws IOException {
        int opcion = 0;
        int maximoElementos = 0;
        Libro libro;

        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);

        do {
            System.out.println("Sub-menú de Obra");
            System.out.println("==");
            System.out.println(" Obra");
            System.out.println("    1.- Crear libro");
            System.out.println("    2.- Buscar libro");
            System.out.println("    3.- Consultar editorial y páginas");
            System.out.println(" Disco");
            System.out.println("    4.- Crear disco");
            System.out.println("    5.- Buscar disco");
            System.out.println("    6.- Consultar discográfica y canciones");
            System.out.println("9.- Salir");

            opcion = Integer.parseInt( leer.readLine() );

            switch (opcion){
                case 1:
                    System.out.println("Ingrese cantidad de libros a cargar: ");
                    maximoElementos = Integer.parseInt(leer.readLine());
                    listaLibros = new ArrayList<Libro>();

                    for (int i = 0; i < maximoElementos; i++) {
                        libro = new Libro();
                        libro.cargarDatos();
                        listaLibros.add(libro);
                    }

                    System.out.println("¡Carga exitosa!");
                    break;

                case 2:
                    String tituloBuscar ;
                    System.out.println("Ingrese el título del libro a buscar: ");
                    tituloBuscar = leer.readLine().toLowerCase();

                    libro = new Libro();
                    libro.buscar(tituloBuscar, listaLibros);
                    break;

                case 3:
                    String editorialBuscar ;
                    System.out.println("Ingrese el nombre de la editorial a consultar: ");
                    editorialBuscar = leer.readLine().toLowerCase();

                    libro = new Libro();
                    libro.consultarEditorial(editorialBuscar, listaLibros);
                    break;

                default:
                    System.out.println("Opción Inválida, intente de nuevo: ");
                    break;
            }
        }while(opcion != 9);
    }

    private static void asignarObra(List<Artista> listArtista) throws IOException {
        
        int cantidadObra;
        String nombArtista;
        List<Obra> listaObras = new ArrayList<Obra>() ;
          
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader   leer = new BufferedReader(lector);
        
        System.out.println("Ingrese cantidad de obras: ");
        cantidadObra = Integer.parseInt(leer.readLine());
              
        System.out.println("Ingrese nombre del artista de la obra: ");
        nombArtista = leer.readLine();
            
        int posArtista = 0;
        
        //Busco el Artista a asignar la Obra
        for(int cArtis = 0; cArtis < listArtista.size(); cArtis++)
        {
           
            if(listArtista.get(cArtis).getnombre().equals(nombArtista))
            {
                posArtista = cArtis;
                break;
            }
        }
        //Creo el objeto Obra para esa Artista
        for(int cObra = 0 ; cObra < cantidadObra; cObra++)
        {
            Obra auxObra = new Obra();
            auxObra.cargarDatos();
            // Le envio a la clase Obra, el objeto del artista correspondiente
            // Ubicado en la lista de  clase Artista
            auxObra.setAutor(listArtista.get(posArtista));
            listaObras.add(auxObra);
        }
    }
}
