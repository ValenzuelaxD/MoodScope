/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MoodScope;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.*;
import javax.swing.JPanel;

/**
 *
 * @author joseg
 */
public class InicioSesion extends javax.swing.JPanel {

    //Usuario usuario;
    MenuPrincipal menuPrincipal;

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        //usuario = new Usuario();
        
        
        
        //enum
        //JComboBox comboBoxTitulos = new JComboBox();

        // Obtener las opciones del enum TituloPersonal
        Usuario.TituloPersonal[] opcionesTitulo = Usuario.TituloPersonal.values();
        //Color.ColorPrimario[] opcionesColores = Color.ColorPrimario.values();

        comboBoxTitulos.setModel(new DefaultComboBoxModel(Usuario.TituloPersonal.values()));
        // Agregar las opciones al JComboBox
        /*for (Usuario.TituloPersonal opcion : opcionesTitulo) {
            comboBoxTitulos.addItem(opcion.toString());
        }*/

        // Establecer la selección inicial (opcional)
        comboBoxTitulos.setSelectedItem(Usuario.TituloPersonal.Ninguno);
        //comboBoxColores.setSelectedItem(Color.ColorPrimario.ROJO);

    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        comboBoxTitulos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(390, 850));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MoodScope/logo5.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresa tu nombre:");

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        comboBoxTitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTitulosActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Titulo personal:");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar)
                            .addComponent(comboBoxTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(comboBoxTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnRegistrar)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       Usuario usuario = General.usuario;
usuario.setNombre(jtfNombre.getText());
Titulo titulo = General.titulo;
String tituloSeleccionado = comboBoxTitulos.getSelectedItem().toString();
if (tituloSeleccionado.equals("Otro")) {
    tituloSeleccionado = showInputDialog(null, "Ingrese otro título:");
     // Salir del método si el usuario no ingresa un título válido
    
    } else if (tituloSeleccionado.equals("Ninguno")) {
    tituloSeleccionado = ""; // Enviar una cadena vacía si se selecciona "Ninguna"
}
titulo.setTitulo(tituloSeleccionado);

if (usuario.getNombre().isEmpty() ) {
    try {
        throw new CampoVacioException("El nombre de usuario no puede estar vacío.");
    } catch (CampoVacioException e) {
        showMessageDialog(null, e.getMessage());
        return; // Salir del método si hay campos vacíos
    }
}

showMessageDialog(null, "Usuario registrado con éxito.\n Bienvenido: " + titulo.getTitulo() + " " + usuario.getNombre());

menuPrincipal = new MenuPrincipal();
showPanel(menuPrincipal);
        

    }//GEN-LAST:event_btnRegistrarActionPerformed
  
    private void comboBoxTitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTitulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTitulosActionPerformed

    public void setImageIcon(JLabel labelName, String root) { //root ruta de la imagen
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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboBoxTitulos;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtfNombre;
    public javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
