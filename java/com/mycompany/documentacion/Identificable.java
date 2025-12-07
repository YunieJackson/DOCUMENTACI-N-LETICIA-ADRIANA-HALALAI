/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.mycompany.documentacion; 

/**
 * Interfaz para objetos que pueden ser identificados mediante un ID.
 * Proporciona un método default para mostrar el identificador.
 * 
 * @author Leticia
 */
public interface Identificable {
    
    /**
     * Obtiene el identificador único del objeto.
     * 
     * @return el ID del objeto
     */
    int getId();
    
    /**
     * Método default que muestra el ID del objeto.
     * Este método tiene una implementación predeterminada       * que puede
     * ser heredada por todas las clases que implementen         * esta interfaz.
     * 
     */
    default void mostrarId() {
        System.out.println("ID: " + getId());
    }
}
