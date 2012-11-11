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
    private static List<Disco> ListaDiscos = null;
    private static List<Pelicula> listaPeliculas = null;
    private static List<Artista> listaArtista = null;
    private static Artista Artista;

    public static void main(String[] args) throws IOException {

        int max_artista = 0;
        int nro_artista = 0;
        int anioEdicion = 0;
        int anio_Nacimiento = 0;
        int opcion = 0;
        String nombre_a = "";
        String titulo = "";
        listaArtista = new ArrayList<Artista>();
        listaLibros = new ArrayList<Libro>();
        ListaDiscos = new ArrayList<Disco>();
        listaPeliculas = new ArrayList<Pelicula>();

        do {
            System.out.println("Menú");
            System.out.println("1.- Crear Artista");
            System.out.println("2.- Obra");
            System.out.println("3.- Película");
            System.out.println("4.- Reportes");
            System.out.println("5.- Salir" + "\n");

            InputStreamReader lector = new InputStreamReader(System.in);
            BufferedReader leer = new BufferedReader(lector);

            opcion = Integer.parseInt(leer.readLine());

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese Cantidad de Artistas:");
                    max_artista = Integer.parseInt(leer.readLine());
                    nro_artista = 0; 
                    while (nro_artista < max_artista) {
                        Artista auxArtista = new Artista();
                        System.out.println("Ingresar Nombre del Artista [" + (nro_artista + 1) + "]:");
                        nombre_a = leer.readLine();

                        System.out.println("Ingresar Año de Nacimiento del Artista [" + (nro_artista + 1) + "]:");
                        anio_Nacimiento = Integer.parseInt(leer.readLine());

                        nro_artista++;

                        auxArtista.setnombre(nombre_a);
                        auxArtista.setanonacimiento(anio_Nacimiento);

                        listaArtista.add(auxArtista);
                    }

                    break;

                case 2:
                    subMenuObra(listaArtista);
                    break;

                case 3:
                    subMenuPelicula(listaArtista);
                    break;
                case 4:
                    subMenuReportes(listaArtista, ListaDiscos, listaLibros, listaPeliculas);
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo");

            }

        } while (opcion != 5);
    }

    static public void subMenuObra(List<Artista> listaArtista) throws IOException {
        int opcion = 0;
        int maximoElementos = 0;
        Libro libro;
        Disco disco;
        


        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);

        do {
            System.out.println("Sub-menú de Obra:\n");
            System.out.println(" Obra:");
            System.out.println("    1.- Crear libro");
            System.out.println("    2.- Buscar libro");
            System.out.println("    3.- Consultar editorial y páginas");
            System.out.println(" Disco:");
            System.out.println("    4.- Crear disco");
            System.out.println("    5.- Buscar disco");
            System.out.println("    6.- Consultar discográfica y canciones");
            System.out.println("7.- Salir" + "\n");

            opcion = Integer.parseInt(leer.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cantidad de libros a cargar: ");
                    maximoElementos = Integer.parseInt(leer.readLine());
                   

                    for (int i = 0; i < maximoElementos; i++) {
                        System.out.println("Libro [" + (i + 1) + "]: ");
                        Artista auxArtista = new Artista();
                        auxArtista = asignarObra(listaArtista);
                        libro = new Libro();
                        //Enviarle a libros el artista
                        libro.cargarDatos(auxArtista);
                        listaLibros.add(libro);
                    }

                    System.out.println("¡Carga exitosa!");
                    break;

                case 2:
                    String tituloBuscar;
                    System.out.println("Ingrese el título del libro a buscar: ");
                    tituloBuscar = leer.readLine().toLowerCase();

                    libro = new Libro();
                    libro.buscar(tituloBuscar, listaLibros);
                    break;

                case 3:
                    String editorialBuscar;
                    System.out.println("Ingrese el nombre de la editorial a consultar: ");
                    editorialBuscar = leer.readLine().toLowerCase();

                    libro = new Libro();
                    libro.consultarEditorial(editorialBuscar, listaLibros);
                    break;
                case 4:
                    System.out.println("Ingrese cantidad de discos a cargar: ");
                    maximoElementos = Integer.parseInt(leer.readLine());
                    

                    for (int i = 0; i < maximoElementos; i++) {
                        System.out.println("Disco [" + (i + 1) + "]: ");
                        Artista auxArtista = new Artista();
                        auxArtista = asignarObra(listaArtista);
                        disco = new Disco();
                        //Enviarle a libros el artista
                        disco.cargarDatos(auxArtista);
                        ListaDiscos.add(disco);
                    }

                    System.out.println("¡Carga exitosa!");
                    break;
                case 5:
                   
                    System.out.println("Ingrese el título del disco a buscar: ");
                    tituloBuscar = leer.readLine();
                    disco = new Disco();
                    disco.buscar(tituloBuscar, ListaDiscos);
                    break;
                case 6:
                    String DiscograficaBuscada;
                    System.out.println("Ingrese la empresa Discográfica a buscar: ");
                    DiscograficaBuscada = leer.readLine();
                    disco = new Disco();
                    disco.consultarDiscografica(DiscograficaBuscada, ListaDiscos);
                    break;
               
                default:
                    System.out.println("Intente de nuevo: " + "\n");
                    break;
            }
        } while (opcion != 7);
    }

    static public void subMenuPelicula(List<Artista> listaArtista) throws IOException {
        int opcion = 0;
        int CantPeliculas = 0;
        Pelicula peli;
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);

        do {
            System.out.println("\n" + "Sub-menú de Película\n");
            System.out.println(" 1.- Crear Película");
            System.out.println(" 2.- Buscar Película");
            System.out.println(" 3.- Consultar Productora");
            System.out.println(" 4.- Salir");

            opcion = Integer.parseInt(leer.readLine());

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese cantidad de peliculas a cargar: ");
                    CantPeliculas = Integer.parseInt(leer.readLine());
                    
                    for (int cPeli = 0; cPeli < CantPeliculas; cPeli++) {
                        System.out.println("Película [" + (cPeli + 1) + "]: ");
                        Artista auxArtista = new Artista();
                        auxArtista = asignarObra(listaArtista);
                        peli = new Pelicula();
                        peli.cargarDatos(auxArtista);
                        listaPeliculas.add(peli);
                    }
                    System.out.println("¡Carga exitosa!");
                    break;
                case 2:
                    String PeliculaBuscar;
                    peli = new Pelicula();
                    System.out.println("Ingrese nombre de la Película a buscar: ");
                    PeliculaBuscar = leer.readLine().toLowerCase();
                    peli.BuscarPelicula(PeliculaBuscar, listaPeliculas);
                    break;

                case 3:
                    String ProductoraBuscar;
                    peli = new Pelicula();
                    System.out.println("Ingrese el nombre de la Productora a consultar: ");
                    ProductoraBuscar = leer.readLine().toLowerCase();
                    peli.ConsultarProductora(ProductoraBuscar, listaPeliculas);
                    break;

                default:
                    System.out.println("Opción Inválida, intente de nuevo: ");
                    break;
            }
        } while (opcion != 4);
    }

    static private Artista asignarObra(List<Artista> listArtista) throws IOException {

        String nombArtista;
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);

        System.out.println("Ingrese nombre del artista de la obra: ");
        nombArtista = leer.readLine();

        int posArtista = 0;

        //Busco el Artista a asignar la Obra        
        for (int cArtis = 0; cArtis < listArtista.size(); cArtis++) {
            if (listArtista.get(cArtis).getnombre().equals(nombArtista)) {
                posArtista = cArtis;
                break;
            }
        }
        
        return listArtista.get(posArtista);
                    
    }
              
    private static void subMenuReportes(List<Artista> listaArtista, List<Disco> ListaDiscos, List<Libro> listaLibros, List<Pelicula> listaPeliculas) throws IOException {
        int opcion = 0;
        int CantPeliculas = 0;
        Pelicula peli;
        InputStreamReader lector = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(lector);


        do {
            System.out.println("\n" + "Sub-menú de Reportes\n");
            System.out.println(" 1.- Listado de Obras");
            System.out.println(" 2.- Listado de Películas");
            System.out.println(" 3.- Buscar todas las obras de un autor");
            System.out.println(" 4.- Buscar todas las películas de un autor");
            System.out.println(" 5.- Salir" + "\n");
            opcion = Integer.parseInt(leer.readLine());

            switch (opcion) {
                case 1:

                    System.out.println("Estas son las obras registradas: ");
                    System.out.println("LIBROS:");
                    try {
                        for (Libro elemento : listaLibros) {
                            elemento.imprimir();
                            System.out.println("");
                        }
                    } catch (NullPointerException excepcion) {
                        System.out.println("No hay libros registrados");
                    }
                    System.out.println("DISCOS:");
                    try {
                        for (Disco elemento : ListaDiscos) {
                            elemento.imprimir();
                            System.out.println("");
                        }
                    } catch (NullPointerException excepcion) {
                        System.out.println("No hay Discos registrados.");
                    }
                    break;
                case 2:
                    try{
                    for (Pelicula elemento : listaPeliculas) {
                        elemento.imprimir();
                        System.out.println("");
                    }
                    }catch(NullPointerException excepcion){
                        System.out.println("No hay Peliculas registradas.");
                    }
                    
                    break;

                case 3:
                    String AutorABuscar = "";
                    System.out.println("Indique el autor:");
                    AutorABuscar = leer.readLine().toLowerCase();
                    System.out.println("LIBROS");                    
                    for (Libro elemento : listaLibros) {
                        try{
                       if (elemento.getAutor().getnombre().toLowerCase().equals(AutorABuscar.toLowerCase())) {
                           elemento.imprimir();
                           System.out.println("");
                       }
                        }catch(Exception excepcion){
                            System.out.println("elemento: " + elemento.getAutor().getnombre());
                        }
                    }
                    System.out.println("DISCOS");
                    for (Disco elemento : ListaDiscos) {
                        if (elemento.getAutor().getnombre().toLowerCase().equals(AutorABuscar.toLowerCase())) {
                            elemento.imprimir();
                            System.out.println("");
                        }
                    }

                    break;
                case 4:
                    String AutorBuscado = null;
                    System.out.println("Indique el autor:");
                    AutorBuscado = leer.readLine();
                    System.out.println("PELICULAS");
                    try{
                    for (Pelicula elemento : listaPeliculas) {
                        if (elemento.getAutor().getnombre().toLowerCase().equals(AutorBuscado.toLowerCase())) {
                            elemento.imprimir();
                            System.out.println("");
                        }
                    }
                    }catch(NullPointerException excepcion){
                        System.out.println("No hay peliculas registradas.");
                    }
                    break;                
                default:
                    System.out.println("Opción Inválida, intente de nuevo: ");
                    break;
            }
        } while (opcion != 5);
    }
}
