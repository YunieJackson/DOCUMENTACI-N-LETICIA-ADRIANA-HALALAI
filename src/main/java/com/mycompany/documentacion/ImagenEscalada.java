/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.documentacion;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Leticia
 */
public class ImagenEscalada extends JPanel{
    private Image imagen;
    
    public ImagenEscalada(String ruta){
        imagen = new ImageIcon(ruta).getImage();
    }
    
    public ImagenEscalada(URL url) {
        try {
            imagen = new ImageIcon(url).getImage();
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen desde el enlace. " + e.getMessage());
        }
    }
    
    @Override
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imagen != null){
            g.drawImage(imagen, 0, 0, getWidth() , getHeight(), this);
        }
    }
}
