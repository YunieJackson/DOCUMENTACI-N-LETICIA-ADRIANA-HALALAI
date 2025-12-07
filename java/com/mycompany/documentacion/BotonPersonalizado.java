/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documentacion;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

/**
 * Clase BotonPersonalizado que extiende de JButton para crear botones
 * con estilos personalizados (color de fondo, fuente y color de texto).
 * 
 * @author Leticia
 */

public class BotonPersonalizado extends JButton {
    
    /**
     * Constructor de la clase BotonPersonalizado.
     * Crea un botón con el texto especificado y aplica estilos personalizados.
     * 
     * @param texto El texto que se mostrará en el botón
     */
    public BotonPersonalizado(String texto) {
        super(texto);
        personalizarBoton();
    }
    
    /**
     * Método que aplica la personalización al botón.
     * Configura el color de fondo, el color del texto, la fuente...
     */
    
    private void personalizarBoton() {
              
        setBackground(new Color(125, 1, 1));
        setForeground(new Color(255, 217, 209));
        setFont(new Font("Consolas", Font.BOLD, 14));
        setOpaque(true);
    }
}