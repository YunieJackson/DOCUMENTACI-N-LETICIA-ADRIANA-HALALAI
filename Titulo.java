/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documentacion;

/**
 * Clase para crear y trabajar títulos de películas y series.
 * Implementa Identificable para poder ser identificado con un ID.
 * 
 * @author Leticia
 */
public class Titulo implements Identificable {
    /**
     * Identificador único del título
     */
    protected int id;
    
    /**
     * Nombre del título
     */
    protected String nombre;
    
    /**
     * Ruta de la imagen asociada al título
     */
    protected String rutaImagen;

    /**
     * Constructor de la clase Titulo.
     * 
     * @param id el identificador único
     * @param nombre el nombre del título
     * @param rutaImagen la ruta de la imagen del título
     */
    public Titulo(int id, String nombre, String rutaImagen) {
        this.id = id;
        this.nombre = nombre;
        this.rutaImagen = rutaImagen;
    }

    /**
     * Obtiene el ID del título.
     * 
     * @return el identificador único
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del título.
     * 
     * @param id el nuevo identificador
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del título.
     * 
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del título.
     * 
     * @param nombre el nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la ruta de la imagen del título.
     * 
     * @return la ruta de la imagen
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * Establece la ruta de la imagen del título.
     * 
     * @param rutaImagen la nueva ruta de la imagen
     */
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    /**
     * Representación en String del título.
     * 
     * @return cadena con id y nombre
     */
    @Override
    public String toString() {
        return "ID: " + id + " - NOMBRE: " + nombre;
    }
}
