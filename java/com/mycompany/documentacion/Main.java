/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.documentacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del programa.
 * Gestiona la creación de objetos y la interacción con el usuario.
 * 
 * @author Leticia
 */

public class Main {
    
    /**
     * Lista de clientes del sistema
     */
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    
    /**
     * Lista de actores del sistema
     */
    private static ArrayList<Actor> actores = new ArrayList<>();
    
    /**
     * Lista de películas del sistema
     */
    private static ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    /**
     * Lista de series del sistema
     */
    private static ArrayList<Serie> series = new ArrayList<>();
    
    /**
     * Scanner para leer entrada del usuario
     */
    private static Scanner sc = new Scanner(System.in);
    
    /**
     * Método principal que inicia el programa.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        crearObjetos();
        while(true){
            mostrarMenu();
        }
        
    }
    
    /**
     * Crea varios objetos de ejemplo y los almacena en las listas.
     * Este método se llama al iniciar el programa.
     */
    public static void crearObjetos() {
        
        clientes.add(new Cliente(1, "Pepe", 56, TipoCliente.ANUNCIO));
        clientes.add(new Cliente(2, "María", 34, TipoCliente.PREMIUM));
        clientes.add(new Cliente(3, "Juan", 28, TipoCliente.BÁSICO));

        actores.add(new Actor(1, "Tom Hanks", 67));
        actores.add(new Actor(2, "Meryl Streep", 74));
        actores.add(new Actor(3, "Leonardo DiCaprio", 49));
        actores.add(new Actor(4, "Scarlett Johansson", 39));

        peliculas.add(new Pelicula(1, "El Padrino", "/recursos/elpadrino.png", 175));
        peliculas.add(new Pelicula(2, "Inception", "/recursos/inception.png", 148));
        peliculas.add(new Pelicula(3, "Pulp Fiction", "/recursos/pulpfiction.png", 154));
        //peliculas.add(new Pelicula(4, "El Caballero Oscuro", 152));
        //peliculas.add(new Pelicula(5, "Forrest Gump", 142));
        //peliculas.add(new Pelicula(6, "Matrix", 136));
        //peliculas.add(new Pelicula(7, "Gladiador", 155));
        //peliculas.add(new Pelicula(8, "Interstellar", 169));
        //peliculas.add(new Pelicula(9, "El Señor de los Anillos", 178));
        //peliculas.add(new Pelicula(10, "Titanic", 195));

        String[] capitulosBB = {"Piloto", "El gato está en la bolsa", "Y la bolsa está en el río", "Cáncer Man", "Gray Matter"};
        int[] duracionBB = {58, 48, 48, 48, 47};
        series.add(new Serie(1, "Breaking Bad", capitulosBB, duracionBB, "/recursos/breakingbad.png"));

        String[] capitulosST = {"El desaparecido", "La rareza de la calle Maple", "Acechador", "El cuerpo"};
        int[] duracionST = {47, 55, 51, 50};
        series.add(new Serie(2, "Stranger Things", capitulosST, duracionST, "/recursos/strangerthings.png"));
        
        
        String[] capitulosGOT = {"Se acerca el invierno", "El camino real", "Lord Snow", "Lisiados y bastardos"};
        int[] duracionGOT = {62, 56, 58, 56};
        series.add(new Serie(3, "Game of Thrones", capitulosGOT, duracionGOT, "/recursos/gameofthrones.png"));
        
        /**
        String[] capitulosTOF = {"Piloto", "Fiesta de diversidad", "Estadísticas de salud", "La Alianza"};
        int[] duracionTOF = {22, 22, 22, 22};
        series.add(new Serie(4, "The Office", capitulosTOF, duracionTOF));

        String[] capitulosTC = {"Wolferton Splash", "Hyde Park Corner", "Windsor", "Acto de Dios"};
        int[] duracionTC = {57, 59, 58, 57};
        series.add(new Serie(5, "The Crown", capitulosTC, duracionTC));

        String[] capitulosFR = {"Winter Is Coming", "Central Perk", "El de la nata", "El del pulgar"};
        int[] duracionFR = {22, 22, 22, 22};
        series.add(new Serie(6, "Friends", capitulosFR, duracionFR));
        
        */

}

    
    /**
     * Muestra un menú interactivo al usuario y procesa su selección.
     * Permite al usuario ver diferentes tipos de información.
     */
    public static void mostrarMenu() {
        
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Ver todos los clientes");
            System.out.println("2. Ver todos los actores");
            System.out.println("3. Ver todas las películas");
            System.out.println("4. Ver todas las series");
            System.out.println("5. Buscar cliente por nombre");
            System.out.println("6. Ver estadísticas");
            System.out.println("0. Salir");
            System.out.println("====================================");
            System.out.print("Seleccione una opción: ");
            
            int opcion;
                
                opcion = Integer.parseInt(sc.nextLine());
                
            switch (opcion) {
                case 1:
                    mostrarClientes();
                    break;
                case 2:
                    mostrarActores();
                    break;
                case 3:
                    mostrarPeliculas();
                    break;
                case 4:
                    mostrarSeries();
                    break;
                case 5:
                    buscarCliente();
                    break;
                case 6:
                    mostrarEstadisticas();
                    break;
                case 0:
                    System.out.println("\nSe va a salir del programa");
                    System.exit(0);

                    break;
                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
            }
            
    }
    
    /**
     * Muestra la información de todos los clientes registrados.
     */
    public static void mostrarClientes() {
        System.out.println("\n========== LISTA DE CLIENTES ==========");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println((i + 1) + ". " + clientes.get(i).toString());
            }
        }
        System.out.println("=======================================");
    }
    
    /**
     * Muestra la información de todos los actores registrados.
     */
    public static void mostrarActores() {
        System.out.println("\n========== LISTA DE ACTORES ==========");
        if (actores.isEmpty()) {
            System.out.println("No hay actores registrados.");
        } else {
            for (int i = 0; i < actores.size(); i++) {
                System.out.println((i + 1) + ". " + actores.get(i).toString());
            }
        }
        System.out.println("======================================");
    }
    
    /**
     * Muestra la información de todas las películas registradas.
     */
    public static void mostrarPeliculas() {
        System.out.println("\n========== LISTA DE PELÍCULAS ==========");
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas registradas.");
        } else {
            for (int i = 0; i < peliculas.size(); i++) {
                System.out.println((i + 1) + ". " + peliculas.get(i).toString());
            }
        }
        System.out.println("========================================");
    }
    
    /**
     * Muestra la información de todas las series registradas.
     */
    public static void mostrarSeries() {
        System.out.println("\n========== LISTA DE SERIES ==========");
        if (series.isEmpty()) {
            System.out.println("No hay series registradas.");
        } else {
            for (int i = 0; i < series.size(); i++) {
                System.out.println((i + 1) + ". " + series.get(i).toString());
            }
        }
        System.out.println("=====================================");
    }
    
    /**
     * Busca y muestra un cliente por su nombre.
     * Solicita al usuario que ingrese el nombre a buscar.
     */
    public static void buscarCliente() {
        System.out.print("\nIngrese el nombre del cliente a buscar: ");
        String nombre = sc.nextLine();
        
        boolean encontrado = false;
        System.out.println("\n========== RESULTADOS DE BÚSQUEDA ==========");
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Cliente encontrado: " + cliente.toString());
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún cliente con el nombre: " + nombre);
        }
        System.out.println("============================================");
    }
    
    /**
     * Muestra estadísticas generales del sistema.
     * Incluye totales y promedios de los diferentes tipos de objetos.
     */
    public static void mostrarEstadisticas() {
        System.out.println("\n========== ESTADÍSTICAS DEL SISTEMA ==========");
        System.out.println("Total de clientes: " + clientes.size());
        System.out.println("Total de actores: " + actores.size());
        System.out.println("Total de películas: " + peliculas.size());
        System.out.println("Total de series: " + series.size());
        
        // Contar tipos de clientes
        int premium = 0, basico = 0, anuncio = 0;
        for (Cliente c : clientes) {
            switch (c.getTipo()) {
                case PREMIUM:
                    premium++;
                    break;
                case BÁSICO:
                    basico++;
                    break;
                case ANUNCIO:
                    anuncio++;
                    break;
            }
        }
        
        System.out.println("\nDistribución de clientes:");
        System.out.println("  - Premium: " + premium);
        System.out.println("  - Básico: " + basico);
        System.out.println("  - Anuncio: " + anuncio);
        
        if (!peliculas.isEmpty()) {
            int totalDuracion = 0;
            for (Pelicula p : peliculas) {
                totalDuracion += p.getDuracion();
            }
            double promedio = (double) totalDuracion / peliculas.size();
            System.out.println("\nDuración promedio de películas: " + 
                             String.format("%.2f", promedio) + " minutos");
        }
        
        System.out.println("==============================================");
    }
    
    /**
    * Obtiene la lista global de películas.
    * @return ArrayList de películas
    */
      /**
     * Obtiene la lista global de películas. Si está vacía, intenta cargar datos de ejemplo.
     * @return ArrayList de películas
     */
    public static ArrayList<Pelicula> getPeliculas() {
        if (peliculas.isEmpty()) {
            crearObjetos(); 
        }
        return peliculas;
    }

    /**
     * Obtiene la lista global de series. Si está vacía, intenta cargar datos de ejemplo.
     * @return ArrayList de series
     */
    public static ArrayList<Serie> getSeries() {
        if (series.isEmpty()) {
            crearObjetos();
        }
        return series;
    }

   
   
}


