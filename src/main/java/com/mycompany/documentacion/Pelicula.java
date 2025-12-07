/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documentacion;

/**
 * Clase que representa una película.
 * Extiende de Titulo e implementa Identificable.
 * 
 * @author Leticia
 */
public class Pelicula extends Titulo {
    
    /**
     * Duración de la película en minutos
     */
    public int duracion;
    
    /**
     * Constructor de la clase Pelicula.
     * 
     * @param id el identificador único de la película
     * @param nombre el nombre de la película
     * @param duracion la duración en minutos
     */
    public Pelicula(int id, String nombre, String rutaImagen, int duracion) {
        super(id, nombre, rutaImagen);
        this.duracion = duracion;
    }
    
    /**
     * Obtiene la duración de la película.
     * 
     * @return la duración en minutos
     */
    public int getDuracion() {
        return duracion;
    }
    
    /**
     * Establece la duración de la película.
     * 
     * @param duracion la nueva duración
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    /**
     * Representación en String de la película.
     * 
     * @return cadena con id, nombre y duración
     */
    @Override
    public String toString() {
        return "ID: " + id + " - NOMBRE: " + nombre + " - DURACIÓN: " + duracion + " min";
    }
}

