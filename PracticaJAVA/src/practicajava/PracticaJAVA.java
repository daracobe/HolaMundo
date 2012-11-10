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

    private static List<Libro> listaLibros = null;
    private static List<Pelicula> listaPeliculas = null;
    private static Artista Artista;

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
        System.out.println("1.- Crear Artista");
        System.out.println("2.- Obra");
        System.out.println("3.- Película");
        System.out.println("4.- Reportes");
        System.out.println("5.- Salir" + "\n");

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
                auxArtista = asignarObra(listaArtista);
                subMenuObra(auxArtista);
                break;

            case 3:
                auxArtista = asignarObra(listaArtista);
                subMenuPelicula(auxArtista);
                break;
            case 4:


            default:
                System.out.println("Opción inválida.");

        }

        }while(opcion != 5);
    }

   static public void subMenuObra(Artista objArtista) throws IOException {
        int opcion = 0;
        int maximoElementos = 0;
        Libro libro;


        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);

        do {
            System.out.println("Sub-menú de Obra\n");
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
                        //Enviarle a libros el artista
                        libro.cargarDatos(objArtista);
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
   
   static public void subMenuPelicula(Artista objArtista) throws IOException {
        int opcion = 0;
        int CantPeliculas = 0;
        Pelicula peli = new Pelicula();
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);

        do {
            System.out.println("Sub-menú de Película\n");
            System.out.println(" 1.- Crear Película");
            System.out.println(" 2.- Buscar Película");
            System.out.println(" 3.- Consultar Productora");
            System.out.println(" 4.- Salir");

            opcion = Integer.parseInt( leer.readLine() );

            switch (opcion){
                case 1:
                    System.out.println("Ingrese cantidad de peliculas a cargar: ");
                    CantPeliculas = Integer.parseInt(leer.readLine());
                    listaPeliculas = new ArrayList<Pelicula>();
                    for (int cPeli = 0; cPeli < CantPeliculas; cPeli++) {
                        peli.cargarDatos(objArtista);
                        listaPeliculas.add(peli);
                    }
                    System.out.println("¡Carga exitosa!");
                    break;
                case 2:
                    String PeliculaBuscar ;
                    System.out.println("Ingrese nombre de la Película a buscar: ");
                    PeliculaBuscar = leer.readLine().toLowerCase();
                    peli.BuscarPelicula(PeliculaBuscar, listaPeliculas);
                    break;

                case 3:
                    String ProductoraBuscar ;
                    System.out.println("Ingrese el nombre de la Productora a consultar: ");
                    ProductoraBuscar = leer.readLine().toLowerCase();
                    peli.ConsultarProductora(ProductoraBuscar, listaPeliculas);
                    break;

                default:
                    System.out.println("Opción Inválida, intente de nuevo: ");
                    break;
            }
        }while(opcion != 4);
    }

   static private Artista asignarObra(List<Artista> listArtista) throws IOException {

        int cantidadObra;
        String nombArtista;
        List<Obra> listaObras = new ArrayList<Obra>() ;

        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader   leer = new BufferedReader(lector);

        System.out.println("Ingrese cantidad de obras: ");
        cantidadObra = Integer.parseInt(leer.readLine());

        System.out.println("Ingrese nombre del artista de las obras: ");
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

        return listArtista.get(posArtista);
        //Creo el objeto Obra para esa Artista
        /* for(int cObra = 0 ; cObra < cantidadObra; cObra++)
        {
            Obra auxObra = new Obra();
            auxObra.cargarDatos();
            // Le envio a la clase Obra, el objeto del artista correspondiente
            // Ubicado en la lista de  clase Artista
            auxObra.setAutor(listArtista.get(posArtista));
            listaObras.add(auxObra);
        } */
    }
}
