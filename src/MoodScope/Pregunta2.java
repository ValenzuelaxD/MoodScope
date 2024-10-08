/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MoodScope;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.*;
import javax.swing.JPanel;

/**
 *
 * @author joseg
 */
public class Pregunta2 extends javax.swing.JPanel {
    
    //RegistroDatos registro;
    
    Diversion diversion = General.diversion;
    
    /**
     * Creates new form InicioSesion
     */
    public Pregunta2() {
        initComponents();
        //this.registro = new RegistroDatos();
        
        
      //  this.diversion.RespuestasDiversion = new ArrayList<Double>();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        contenedor = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        btn4 = new javax.swing.JRadioButton();
        btn5 = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(390, 850));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MoodScope/logo5.png"))); // NOI18N

        jLabel1.setText(" ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pregunta 2: ¿Tuviste diversión o distracciones el día de hoy?");

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btn1.setText("1 Muy poco");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2 Poco");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3 Regular");

        btn4.setText("4 Algo");

        btn5.setText("5 Bastante");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2)
                            .addComponent(btn1)
                            .addComponent(btn3)
                            .addComponent(btn4)
                            .addComponent(btn5)
                            .addComponent(btnSiguiente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(108, 108, 108))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn5)
                .addGap(29, 29, 29)
                .addComponent(btnSiguiente)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        botones.add(btn1);
        botones.add(btn2);
        botones.add(btn3);
        botones.add(btn4);
        botones.add(btn5);
        
        
        try {
    double respuesta = 0.0;
    if (btn1.isSelected()) {
        respuesta = 1.0;
    } else if (btn2.isSelected()) {
        respuesta = 2.0;
    } else if (btn3.isSelected()) {
        respuesta = 3.0;
    } else if (btn4.isSelected()) {
        respuesta = 4.0;
    } else if (btn5.isSelected()) {
        respuesta = 5.0;
    } else {
        throw new NoSuchElementException();
    }
    
    this.diversion.RespuestasDiversion.add(respuesta);
    RegistroDatos.guardarRespuesta(respuesta);
    RegistroDatos.escribirRespuestasEnArchivo("Respuestas Diversión");
    
    RegistroDatosBinario.agregarRespuesta(respuesta);
    RegistroDatosBinario.escribirRespuestasEnArchivoBinario("Respuestas Diversión");
    
    System.out.println("Tu respuesta guardada es: " + respuesta);

    // Muestra el siguiente panel (asegúrate de que el método showPanel esté definido)
    Pregunta3 p3 = new Pregunta3();
    showPanel(p3);
} catch (NoSuchElementException e) {
    showMessageDialog(null, "Error: Favor de ingresar una respuesta");
}

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn1MouseClicked
    
    public void setImageIcon(JLabel labelName, String root){ //root ruta de la imagen
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
        image.getImage().getScaledInstance(labelName.getWidth(), 
                labelName.getHeight(), Image.SCALE_DEFAULT)
        );
        logo.setIcon(icon);//Asinarle el icono a la etiqueta
        this.repaint();//Actualizar la etiqueta y re-pintarla
        
    }
    
    //Mostrar los paneles
    private void showPanel (JPanel p){
        
        p.setSize(360,640);
        p.setLocation(0,0);
        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.JRadioButton btn4;
    private javax.swing.JRadioButton btn5;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
