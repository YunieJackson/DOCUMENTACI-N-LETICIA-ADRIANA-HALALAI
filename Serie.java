/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documentacion;

/**
 * Clase que representa una serie de televisión.
 * Extiende de Titulo e implementa Identificable.
 * 
 * @author Leticia
 */
public class Serie extends Titulo {
    /**
     * Número de temporadas
     */
    public int numTemporadas;
    
    /**
     * Array con los nombres de los capítulos
     */
    public String[] capitulos;
    
    /**
     * Array con las duraciones de cada capítulo
     */
    public int[] duracion;

    /**
     * Constructor de la clase Serie.
     * 
     * @param id el identificador único de la serie
     * @param nombre el nombre de la serie
     * @param capitulos array con los nombres de capítulos
     * @param duracion array con las duraciones
     * @param rutaImagen la ruta de la imagen de la serie
     */
    public Serie(int id, String nombre, String[] capitulos, int[] duracion, String rutaImagen) {
        super(id, nombre, rutaImagen);
        this.capitulos = capitulos;
        this.duracion = duracion;
        this.numTemporadas = capitulos.length;
    }

    /**
     * Obtiene el array de capítulos.
     * 
     * @return array de capítulos
     */
    public String[] getCapitulos() {
        return capitulos;
    }

    /**
     * Establece el array de capítulos.
     * 
     * @param capitulos el nuevo array de capítulos
     */
    public void setCapitulos(String[] capitulos) {
        this.capitulos = capitulos;
    }

    /**
     * Obtiene el array de duraciones.
     * 
     * @return array de duraciones
     */
    public int[] getDuracion() {
        return duracion;
    }

    /**
     * Establece el array de duraciones.
     * 
     * @param duracion el nuevo array de duraciones
     */
    public void setDuracion(int[] duracion) {
        this.duracion = duracion;
    }
    
    /**
    * Suma la duración total de todos los capítulos de la serie.
    * @return la duración total en minutos
    */
    public int getDuracionTotal() {
        int total = 0;
        if (duracion != null) {
            for (int d : duracion) {
                total += d;
            }
        }
     return total;
    }

    /**
     * Representación en String de la serie.
     * 
     * @return cadena con id, nombre y temporadas
     */
    @Override
    public String toString() {
        return "ID: " + id + " - NOMBRE: " + nombre + " - TEMPORADAS: " + numTemporadas;
    }
}
