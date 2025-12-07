/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.documentacion;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.net.URL;

/**
 * Ventana principal de la aplicación donde se gestionan y visualizan
 * los catálogos de películas y series.
 * Permite navegar entre ambas secciones y ver detalles de cada título.
 * 
 * @author Leticia
 */
public class PantallaSeriesPeliculas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PantallaSeriesPeliculas.class.getName());

    private CardLayout cards;
    private JPanel base;
    
    private JList<String> listaPeliculas;
    private DefaultListModel<String> modeloPeliculas;
    private JPanel panelImagenPeliculaContenedor; 
    private JTextArea txtInfoPelicula;
    
    private JList<String> listaSeries;
    private DefaultListModel<String> modeloSeries;
    private JPanel panelImagenSerieContenedor;
    private JTextArea txtInfoSerie;

    /**
     * Constructor de la clase. Inicializa la interfaz gráfica y los componentes.
     */
    public PantallaSeriesPeliculas() {
        setTitle("PELÍCULAS Y SERIES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);

        cards = new CardLayout();
        base = new JPanel(cards);

        base.add(pantallaPrincipal(), "PantallaPrincipal");
        base.add(crearPanelPeliculas(), "Peliculas");
        base.add(crearPanelSeries(), "Series");

        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        getContentPane().add(base, gbc);

        cards.show(base, "PantallaPrincipal");
    }

    /**
     * Crea el panel principal con el menú de selección inicial.
     * 
     * @return JPanel configurado con la pantalla principal
     */
    private JPanel pantallaPrincipal() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel headerPanel = new JPanel(new GridBagLayout());
        headerPanel.setBackground(new Color(125, 1, 1));
        
        URL urlImagen = getClass().getResource("/recursos/filmdirectorsnoopy.png");
        if (urlImagen != null) {
            ImagenEscalada imagenSnoopy = new ImagenEscalada(urlImagen);
            imagenSnoopy.setPreferredSize(new Dimension(100, 100));
            GridBagConstraints gbcImg = new GridBagConstraints();
            gbcImg.gridx = 0;
            gbcImg.insets = new Insets(0, 20, 0, 20);
            headerPanel.add(imagenSnoopy, gbcImg);
        }

        JLabel titulo = new JLabel("VIDEOTECA DE PELÍCULAS Y SERIES");
        titulo.setFont(new Font("Arial", Font.BOLD, 32)); 
        titulo.setForeground(new Color(255, 217, 209));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 1;
        gbcTitulo.weightx = 1.0;
        headerPanel.add(titulo, gbcTitulo);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 0.15;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(headerPanel, gbc);

        JPanel panelSubPelis = new JPanel(new GridBagLayout());
        panelSubPelis.setBackground(new Color(219, 94, 88));
        
        JLabel lblPelis = new JLabel("PELÍCULAS");
        lblPelis.setFont(new Font("Arial", Font.BOLD, 24)); 
        lblPelis.setForeground(Color.WHITE);
        panelSubPelis.add(lblPelis);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.10;
        panel.add(panelSubPelis, gbc);

        JPanel panelSubSeries = new JPanel(new GridBagLayout());
        panelSubSeries.setBackground(new Color(219, 94, 88));
        
        JLabel lblSeries = new JLabel("SERIES");
        lblSeries.setFont(new Font("Arial", Font.BOLD, 24)); 
        lblSeries.setForeground(Color.WHITE);
        panelSubSeries.add(lblSeries);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        panel.add(panelSubSeries, gbc);

        JPanel panelImgPelis = new JPanel(new GridBagLayout());
        panelImgPelis.setBackground(new Color(219, 94, 88));
        
        URL urlPelis = getClass().getResource("/recursos/theater.png"); 
        if(urlPelis != null) {
             ImagenEscalada imgPelis = new ImagenEscalada(urlPelis);
             imgPelis.setPreferredSize(new Dimension(200, 200));
             panelImgPelis.add(imgPelis);
        }
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        gbc.weighty = 0.60;
        panel.add(panelImgPelis, gbc);

        JPanel panelImgSeries = new JPanel(new GridBagLayout());
        panelImgSeries.setBackground(new Color(219, 94, 88));
        
        URL urlSeries = getClass().getResource("/recursos/tv.png");
        if(urlSeries != null) {
             ImagenEscalada imgSeries = new ImagenEscalada(urlSeries);
             imgSeries.setPreferredSize(new Dimension(200, 200));
             panelImgSeries.add(imgSeries);
        }
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        panel.add(panelImgSeries, gbc);

        JPanel panelBtnPelis = new JPanel(new GridBagLayout());
        panelBtnPelis.setBackground(new Color(219, 94, 88));
        
        BotonPersonalizado btnVerPelis = new BotonPersonalizado("VER CATÁLOGO PELÍCULAS");
        btnVerPelis.setFont(new Font("Arial", Font.BOLD, 16));
        btnVerPelis.addActionListener(e -> cards.show(base, "Peliculas"));
        panelBtnPelis.add(btnVerPelis);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.5;
        gbc.weighty = 0.15;
        panel.add(panelBtnPelis, gbc);

        JPanel panelBtnSeries = new JPanel(new GridBagLayout());
        panelBtnSeries.setBackground(new Color(219, 94, 88));
        
        BotonPersonalizado btnVerSeries = new BotonPersonalizado("VER CATÁLOGO SERIES");
        btnVerSeries.addActionListener(e -> cards.show(base, "Series"));
        panelBtnSeries.add(btnVerSeries);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 0.5;
        panel.add(panelBtnSeries, gbc);

        return panel;
    }

    /**
     * Crea el panel para la gestión y visualización de películas.
     * 
     * @return JPanel configurado para la sección de películas
     */
    private JPanel crearPanelPeliculas() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(219, 94, 88));

        JPanel header = new JPanel();
        header.setBackground(new Color(125, 1, 1));
        JLabel titulo = new JLabel("CATÁLOGO DE PELÍCULAS");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(255, 217, 209));
        header.add(titulo);
        
        JButton btnVolver = new JButton("VOLVER AL MENÚ");
        btnVolver.addActionListener(e -> cards.show(base, "PantallaPrincipal"));
        header.add(btnVolver);
        
        panel.add(header, BorderLayout.NORTH);

        JPanel centro = new JPanel(new GridLayout(1, 2, 10, 0));
        centro.setOpaque(false);

        modeloPeliculas = new DefaultListModel<>();
        for (Object p : Main.getPeliculas()) {
             modeloPeliculas.addElement(((Pelicula)p).getNombre()); 
        }

        listaPeliculas = new JList<>(modeloPeliculas);
        listaPeliculas.setFont(new Font("Arial", Font.PLAIN, 18));
        listaPeliculas.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value.toString().startsWith("★")) {
                    setBackground(new Color(255, 255, 200));
                    setForeground(Color.BLACK);
                } 
                if (isSelected) {
                    setBackground(list.getSelectionBackground());
                    setForeground(list.getSelectionForeground());
                }
                return c;
            }
        });
        
        listaPeliculas.addListSelectionListener(e -> actualizarDetallePelicula());
        JScrollPane scrollLista = new JScrollPane(listaPeliculas);
        
        JPanel panelLista = new JPanel(new BorderLayout());
        panelLista.setBorder(BorderFactory.createTitledBorder("Selecciona una película"));
        panelLista.add(scrollLista);
        centro.add(panelLista);

        JPanel panelDetalle = new JPanel(new GridBagLayout());
        panelDetalle.setBackground(new Color(255, 245, 238));
        GridBagConstraints gbc = new GridBagConstraints();

        panelImagenPeliculaContenedor = new JPanel(new BorderLayout());
        panelImagenPeliculaContenedor.setPreferredSize(new Dimension(200, 300));
        panelImagenPeliculaContenedor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelImagenPeliculaContenedor.setBackground(Color.WHITE);
        
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 1.0; gbc.weighty = 0.6;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelDetalle.add(panelImagenPeliculaContenedor, gbc);

        txtInfoPelicula = new JTextArea();
        txtInfoPelicula.setEditable(false);
        txtInfoPelicula.setLineWrap(true);
        txtInfoPelicula.setWrapStyleWord(true);
        txtInfoPelicula.setFont(new Font("Monospaced", Font.PLAIN, 14));
        
        gbc.gridy = 1;
        gbc.weighty = 0.3;
        panelDetalle.add(new JScrollPane(txtInfoPelicula), gbc);

        JButton btnFavoritos = new JButton("GUARDAR EN FAVORITOS");
        btnFavoritos.setBackground(new Color(255, 215, 0));
        btnFavoritos.addActionListener(e -> guardarFavorito("Pelicula"));
        
        gbc.gridy = 2;
        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelDetalle.add(btnFavoritos, gbc);

        centro.add(panelDetalle);
        panel.add(centro, BorderLayout.CENTER);

        return panel;
    }

    /**
     * Crea el panel para la gestión y visualización de series.
     * 
     * @return JPanel configurado para la sección de series
     */
    private JPanel crearPanelSeries() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(29, 94, 88));

        JPanel header = new JPanel();
        header.setBackground(new Color(125, 1, 1));
        JLabel titulo = new JLabel("CATÁLOGO DE SERIES");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(255, 217, 209));
        header.add(titulo);
        
        JButton btnVolver = new JButton("VOLVER AL MENÚ");
        btnVolver.addActionListener(e -> cards.show(base, "PantallaPrincipal"));
        header.add(btnVolver);
        
        panel.add(header, BorderLayout.NORTH);

        JPanel centro = new JPanel(new GridLayout(1, 2, 10, 0));
        centro.setOpaque(false);

        modeloSeries = new DefaultListModel<>();
        for (Object s : Main.getSeries()) {
             modeloSeries.addElement(((Serie)s).getNombre());
        }
        
        listaSeries = new JList<>(modeloSeries);
        listaSeries.setFont(new Font("Arial", Font.PLAIN, 18));
        
        listaSeries.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value.toString().startsWith("★")) {
                    setBackground(new Color(255, 255, 200));
                    setForeground(Color.BLACK);
                }
                if (isSelected) {
                    setBackground(list.getSelectionBackground());
                    setForeground(list.getSelectionForeground());
                }
                return c;
            }
        });

        listaSeries.addListSelectionListener(e -> actualizarDetalleSerie());
        
        JPanel panelLista = new JPanel(new BorderLayout());
        panelLista.setBorder(BorderFactory.createTitledBorder("Selecciona una serie"));
        panelLista.add(new JScrollPane(listaSeries));
        centro.add(panelLista);

        JPanel panelDetalle = new JPanel(new GridBagLayout());
        panelDetalle.setBackground(new Color(240, 255, 240));
        GridBagConstraints gbc = new GridBagConstraints();

        panelImagenSerieContenedor = new JPanel(new BorderLayout());
        panelImagenSerieContenedor.setPreferredSize(new Dimension(200, 300));
        panelImagenSerieContenedor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelImagenSerieContenedor.setBackground(Color.WHITE);
        
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 1.0; gbc.weighty = 0.6;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelDetalle.add(panelImagenSerieContenedor, gbc);

        txtInfoSerie = new JTextArea();
        txtInfoSerie.setEditable(false);
        txtInfoSerie.setLineWrap(true);
        txtInfoSerie.setWrapStyleWord(true);
        txtInfoSerie.setFont(new Font("Monospaced", Font.PLAIN, 14));
        
        gbc.gridy = 1;
        gbc.weighty = 0.3;
        panelDetalle.add(new JScrollPane(txtInfoSerie), gbc);

        JButton btnFavoritos = new JButton("GUARDAR EN FAVORITOS");
        btnFavoritos.setBackground(new Color(255, 215, 0));
        btnFavoritos.addActionListener(e -> guardarFavorito("Serie"));
        
        gbc.gridy = 2;
        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelDetalle.add(btnFavoritos, gbc);

        centro.add(panelDetalle);
        panel.add(centro, BorderLayout.CENTER);

        return panel;
    }

    /**
     * Actualiza los componentes de detalle cuando se selecciona una película.
     */
    private void actualizarDetallePelicula() {
        String nombreSeleccionado = listaPeliculas.getSelectedValue();
        if (nombreSeleccionado != null) {
            String nombreReal = nombreSeleccionado.replace("★ ", "");
            
            Pelicula peliculaSeleccionada = null;
            for (Pelicula p : Main.getPeliculas()) {
                if (p.getNombre().equals(nombreReal)) {
                    peliculaSeleccionada = p;
                    break;
                }
            }

            if (peliculaSeleccionada != null) {
                txtInfoPelicula.setText("DETALLES DE: " + peliculaSeleccionada.getNombre() + "\n\n" +
                                        "Duración: " + peliculaSeleccionada.getDuracion() + " min\n" +
                                        "ID: " + peliculaSeleccionada.getId());
                
                panelImagenPeliculaContenedor.removeAll();
                URL url = getClass().getResource(peliculaSeleccionada.getRutaImagen());
                if (url != null) {
                    ImagenEscalada img = new ImagenEscalada(url);
                    panelImagenPeliculaContenedor.add(img, BorderLayout.CENTER);
                } else {
                    JLabel lblNoImg = new JLabel("Sin imagen", SwingConstants.CENTER);
                    panelImagenPeliculaContenedor.add(lblNoImg, BorderLayout.CENTER);
                }
                panelImagenPeliculaContenedor.revalidate();
                panelImagenPeliculaContenedor.repaint();
            }
        }
    }

    /**
     * Actualiza los componentes de detalle cuando se selecciona una serie.
     */
    private void actualizarDetalleSerie() {
        String nombreSeleccionado = listaSeries.getSelectedValue();
        if (nombreSeleccionado != null) {
            String nombreReal = nombreSeleccionado.replace("★ ", "");
            
            Serie serieSeleccionada = null;
            for (Serie s : Main.getSeries()) {
                if (s.getNombre().equals(nombreReal)) {
                    serieSeleccionada = s;
                    break;
                }
            }

            if (serieSeleccionada != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("DETALLES DE: ").append(serieSeleccionada.getNombre()).append("\n\n");
                sb.append("Temporadas: ").append(serieSeleccionada.numTemporadas).append("\n");
                sb.append("Capítulos: \n");
                for(int i=0; i<serieSeleccionada.getCapitulos().length; i++) {
                    sb.append("- ").append(serieSeleccionada.getCapitulos()[i])
                      .append(" (").append(serieSeleccionada.getDuracion()[i]).append(" min)\n");
                }
                
                txtInfoSerie.setText(sb.toString());
                
                panelImagenSerieContenedor.removeAll();
                URL url = getClass().getResource(serieSeleccionada.getRutaImagen());
                if (url != null) {
                    ImagenEscalada img = new ImagenEscalada(url);
                    panelImagenSerieContenedor.add(img, BorderLayout.CENTER);
                } else {
                    JLabel lblNoImg = new JLabel("Sin imagen", SwingConstants.CENTER);
                    panelImagenSerieContenedor.add(lblNoImg, BorderLayout.CENTER);
                }
                panelImagenSerieContenedor.revalidate();
                panelImagenSerieContenedor.repaint();
            }
        }
    }

    /**
     * Guarda el título seleccionado en favoritos marcándolo visualmente en la lista.
     * Añade una estrella al nombre y cambia el fondo de la celda a amarillo.
     * 
     * @param tipo El tipo de elemento ("Pelicula" o "Serie")
     */
    private void guardarFavorito(String tipo) {
        if (tipo.equals("Pelicula")) {
            int index = listaPeliculas.getSelectedIndex();
            if (index != -1) {
                String nombre = modeloPeliculas.getElementAt(index);
                if (!nombre.startsWith("★")) {
                    modeloPeliculas.set(index, "★ " + nombre);
                    JOptionPane.showMessageDialog(this, "¡Añadido a favoritos!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona una película primero.");
            }
        } else {
            int index = listaSeries.getSelectedIndex();
            if (index != -1) {
                String nombre = modeloSeries.getElementAt(index);
                if (!nombre.startsWith("★")) {
                    modeloSeries.set(index, "★ " + nombre);
                    JOptionPane.showMessageDialog(this, "¡Añadido a favoritos!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona una serie primero.");
            }
        }
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
        java.awt.EventQueue.invokeLater(() -> new PantallaSeriesPeliculas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
