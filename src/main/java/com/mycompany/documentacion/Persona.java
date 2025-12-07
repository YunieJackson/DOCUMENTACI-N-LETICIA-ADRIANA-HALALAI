/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documentacion;

/**
 * Clase base que representa una persona.
 * Contiene atributos básicos como id, nombre y edad.
 *
 * @author Leticia
 */
public class Persona implements Identificable {

    /**
     * Identificador único de la persona
     */
    protected int id;

    /**
     * Nombre de la persona
     */
    protected String nombre;

    /**
     * Edad de la persona
     */
    protected int edad;

    /**
     * Constructor de la clase Persona.
     *
     * @param id el identificador único
     * @param nombre el nombre de la persona
     * @param edad la edad de la persona
     */
    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el ID de la persona.
     *
     * @return el identificador único
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la persona.
     *
     * @param id el nuevo identificador
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre el nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad la nueva edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Representación en String de la persona.
     *
     * @return cadena con id, nombre y edad
     */
    @Override
    public String toString() {
        return "ID: " + id + " - NOMBRE: " + nombre + " - EDAD: " + edad;
    }
}
