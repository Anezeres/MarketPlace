/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RYZEN
 */
public class PanelAfiliadosCRUD extends javax.swing.JPanel {
    
    DefaultTableModel modelo;
    private boolean btnAceptarActivo = false;

    /**
     * Creates new form PanelDashboard
     */
    public PanelAfiliadosCRUD() {
        initComponents();
        setSize(1086, 503);
        

    }
    
    public void ponerFondoCRUD(String accion){
        Icon fondoCRUD = new ImageIcon("src//Imagenes//UsuariosCRUD//00-"+accion+"Usuario-img.png"); 
        fondoAfiliados.setIcon(fondoCRUD);     
    }
    

    
    public void activarBotones(){
        btnAceptarActivo = true;
        setBotonInactivo("Eliminar", btnAceptar);
        
    }
    
    private void setBotonActivo(String boton, JLabel imagenBoton){
        if(btnAceptarActivo){
            Icon btnActivo = new ImageIcon("src//Imagenes//BotonesCRUD//00-"+boton+"Activo.png"); 
            imagenBoton.setIcon(btnActivo);
        }
        
        if("Cancelar".equals(boton)){
            Icon btnActivo = new ImageIcon("src//Imagenes//BotonesCRUD//00-"+boton+"Activo.png"); 
            imagenBoton.setIcon(btnActivo);
        }
        
        
    }
    
    private void setBotonInactivo(String boton, JLabel imagenBoton){
        if(btnAceptarActivo){
            Icon btnInactivo = new ImageIcon("src//Imagenes//BotonesCRUD//00-"+boton+"Inactivo.png"); 
            imagenBoton.setIcon(btnInactivo);
        }
        
        if("Cancelar".equals(boton)){
            Icon btnInactivo = new ImageIcon("src//Imagenes//BotonesCRUD//00-"+boton+"Inactivo.png"); 
            imagenBoton.setIcon(btnInactivo);
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

        jTextField1 = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JLabel();
        fondoAfiliados = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1086, 503));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 175, 210, 26));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonesCRUD/00-CancelarInactivo.png"))); // NOI18N
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 144, 55));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonesCRUD/00-AceptarDesactivado.png"))); // NOI18N
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 144, 55));

        fondoAfiliados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuariosCRUD/00-VerUsuario-img.png"))); // NOI18N
        add(fondoAfiliados, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 1090, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        setBotonActivo("Eliminar", btnAceptar);
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        setBotonInactivo("Eliminar", btnAceptar);
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setBotonActivo("Crear", btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        setBotonInactivo("Crear", btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    
    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel fondoAfiliados;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
