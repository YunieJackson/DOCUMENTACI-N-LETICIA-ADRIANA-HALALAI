/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documentacion;

/**
 * Clase que representa un actor.
 * Extiende de Persona e implementa Identificable.
 * 
 * @author Leticia
 */
public class Actor extends Persona {
    
    /**
     * Constructor de la clase Actor.
     * 
     * @param id el identificador único del actor
     * @param nombre el nombre del actor
     * @param edad la edad del actor
     */
    public Actor(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }
    
    /**
     * Representación en String del actor.
     * 
     * @return cadena con id, nombre y edad
     */
    @Override
    public String toString() {
        return "ID: " + id + " - NOMBRE: " + nombre + " - EDAD: " + edad;
    }
}
