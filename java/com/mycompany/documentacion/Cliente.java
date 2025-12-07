/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documentacion;

/**
 * Clase que representa un cliente del sistema.
 * Extiende de Persona e implementa Identificable.
 * 
 * @author Leticia
 */
public class Cliente extends Persona {
    
    /**
     * Tipo de cliente (Premium, Básico o Anuncio)
     */
    TipoCliente tipo;
    
    /**
     * Constructor de la clase Cliente.
     * 
     * @param id el identificador único del cliente
     * @param nombre el nombre del cliente
     * @param edad la edad del cliente
     * @param tipo el tipo de cliente
     */
    public Cliente(int id, String nombre, int edad, TipoCliente tipo) {
        super(id, nombre, edad);
        this.tipo = tipo;
    }
    
    /**
     * Obtiene el tipo de cliente.
     * 
     * @return el tipo de cliente
     */
    public TipoCliente getTipo() {
        return tipo;
    }
    
    /**
     * Establece el tipo de cliente.
     * 
     * @param tipo el nuevo tipo
     */
    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Representación en String del cliente.
     * 
     * @return cadena con id, nombre, edad y tipo
     */
    @Override
    public String toString() {
        return "ID: " + id + " - NOMBRE: " + nombre + " - EDAD: " + edad + " - TIPO: " + tipo;
    }
}

