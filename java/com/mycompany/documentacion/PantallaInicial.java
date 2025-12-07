/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.documentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Leticia
 */
public class PantallaInicial extends javax.swing.JFrame {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PantallaInicial.class.getName());
    

    /**
     * Creates new form PantallaInicial
     */
    public PantallaInicial() {
                
        setTitle("PELÍCULAS Y SERIES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,800);
        setLocationRelativeTo(null);
        
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        JPanel headerPanel = new JPanel(new GridBagLayout());
        headerPanel.setBackground(new Color(125, 1, 1));
        
        JLabel titulo = new JLabel("VIDEOTECA DE PELÍCULAS Y SERIES");
        titulo.setFont(new Font("Arial", Font.BOLD, 36)); 
        titulo.setForeground(new Color(255, 217, 209));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);  

        headerPanel.add(titulo);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;  
        gbc.weightx = 0.60; 
        gbc.weighty = 0.25;
        gbc.ipadx = 0;
        gbc.fill = GridBagConstraints.BOTH;
        add(headerPanel, gbc);
        
        ImagenEscalada imagenHeader = new ImagenEscalada(getClass().getResource("/recursos/filmdirectorsnoopy.png"));
        imagenHeader.setPreferredSize(new Dimension(100, 100));
        GridBagConstraints gbcImg = new GridBagConstraints();
        gbcImg.insets = new Insets(0, 20, 0, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.40; 
        gbc.weighty = 0.25;
        add(imagenHeader, gbc);
        
        JPanel panelPrincipal = new JPanel(new GridBagLayout());
        panelPrincipal.setBackground(new Color(219, 94, 88));
        GridBagConstraints gbc2 = new GridBagConstraints();
        
        JLabel tituloUsuario = new JLabel("Usuario:");
        tituloUsuario.setForeground(new Color(125, 1, 1));
        tituloUsuario.setFont(new Font("Arial", Font.BOLD, 18));
        
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.gridwidth = 1;  
        gbc2.weightx = 0.0; 
        gbc2.weighty = 0.0;
        gbc2.ipadx = 0;
        gbc2.anchor = GridBagConstraints.CENTER; 
        gbc2.fill = GridBagConstraints.BOTH;
        
        panelPrincipal.add(tituloUsuario, gbc2);

        JTextField campoUsuario = new JTextField(40);
        campoUsuario.setBackground(new Color(125, 1, 1));
        campoUsuario.setForeground(new Color(255, 217, 209));
        
        gbc2.gridx = 0;
        gbc2.gridy = 1;

        panelPrincipal.add(campoUsuario, gbc2);
        
        JLabel tituloContraseña = new JLabel("Contraseña");
        tituloContraseña.setForeground(new Color(125, 1, 1));
        tituloContraseña.setFont(new Font("Arial", Font.BOLD, 18));
        
        gbc2.gridx = 0;
        gbc2.gridy = 2;
        
        panelPrincipal.add(tituloContraseña, gbc2);
        
        JPasswordField contraseñaUsuario = new JPasswordField(40);
        contraseñaUsuario.setBackground(new Color(125, 1, 1));
        contraseñaUsuario.setForeground(new Color(255, 217, 209));
        
        gbc2.gridx = 0;      
        gbc2.gridy = 3;      
        panelPrincipal.add(contraseñaUsuario, gbc2);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;  
        gbc.weightx = 1.0; 
        gbc.weighty = 0.75;
        gbc.fill = GridBagConstraints.BOTH;
        add(panelPrincipal, gbc);
        
        BotonPersonalizado botonEntrar = new BotonPersonalizado("ENTRAR");
        gbc2.gridx = 0;      
        gbc2.gridy = 4;
        
        botonEntrar.addActionListener(e -> {
            
        if(campoUsuario.getText().equals("Usuario") && contraseñaUsuario.getText().equals("123")){
            
            PantallaSeriesPeliculas ventanaEmociones = new PantallaSeriesPeliculas();
            ventanaEmociones.setVisible(true);
            this.dispose();
        }
        
        else{
            JOptionPane.showMessageDialog(
                null,
                "Usuario o contraseña incorrectos", 
                "Error de login", 
                JOptionPane.ERROR_MESSAGE
            );
        }
        
        });
        
        panelPrincipal.add(botonEntrar, gbc2);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PantallaInicial().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
