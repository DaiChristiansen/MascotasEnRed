/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazNueva;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaDeFondo = new javax.swing.JPanel();
        EspacioMenu = new javax.swing.JPanel();
        BotonBuscarMascota = new javax.swing.JLabel();
        BotonCrearAviso = new javax.swing.JLabel();
        BotonCargarDenunciante = new javax.swing.JLabel();
        BotonRegistrarMascota = new javax.swing.JLabel();
        BotonDenunciaMaltrato = new javax.swing.JLabel();
        PanelBuscarMascota = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        VentanaDeFondo.setBackground(new java.awt.Color(230, 230, 230));

        EspacioMenu.setBackground(new java.awt.Color(61, 0, 112));

        BotonBuscarMascota.setBackground(new java.awt.Color(88, 30, 138));
        BotonBuscarMascota.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonBuscarMascota.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarMascota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonBuscarMascota.setText("  BUSCAR MASCOTA");
        BotonBuscarMascota.setName("BotonBuscarMascota"); // NOI18N
        BotonBuscarMascota.setOpaque(true);
        BotonBuscarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarMascotaMouseClicked(evt);
            }
        });

        BotonCrearAviso.setBackground(new java.awt.Color(35, 0, 66));
        BotonCrearAviso.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCrearAviso.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrearAviso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCrearAviso.setText("  CREAR AVISO");
        BotonCrearAviso.setName("BotonBuscarMascota"); // NOI18N
        BotonCrearAviso.setOpaque(true);
        BotonCrearAviso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearAvisoMouseClicked(evt);
            }
        });

        BotonCargarDenunciante.setBackground(new java.awt.Color(35, 0, 66));
        BotonCargarDenunciante.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCargarDenunciante.setForeground(new java.awt.Color(255, 255, 255));
        BotonCargarDenunciante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCargarDenunciante.setText("  CARGAR DENUNCIANTE");
        BotonCargarDenunciante.setName("BotonBuscarMascota"); // NOI18N
        BotonCargarDenunciante.setOpaque(true);
        BotonCargarDenunciante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCargarDenuncianteMouseClicked(evt);
            }
        });

        BotonRegistrarMascota.setBackground(new java.awt.Color(35, 0, 66));
        BotonRegistrarMascota.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonRegistrarMascota.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarMascota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonRegistrarMascota.setText("  REGISTRAR MASCOTA");
        BotonRegistrarMascota.setName("BotonBuscarMascota"); // NOI18N
        BotonRegistrarMascota.setOpaque(true);
        BotonRegistrarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarMascotaMouseClicked(evt);
            }
        });

        BotonDenunciaMaltrato.setBackground(new java.awt.Color(35, 0, 66));
        BotonDenunciaMaltrato.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonDenunciaMaltrato.setForeground(new java.awt.Color(255, 255, 255));
        BotonDenunciaMaltrato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonDenunciaMaltrato.setText("  DENUNCIA DE MALTRATO");
        BotonDenunciaMaltrato.setName("BotonBuscarMascota"); // NOI18N
        BotonDenunciaMaltrato.setOpaque(true);
        BotonDenunciaMaltrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDenunciaMaltratoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EspacioMenuLayout = new javax.swing.GroupLayout(EspacioMenu);
        EspacioMenu.setLayout(EspacioMenuLayout);
        EspacioMenuLayout.setHorizontalGroup(
            EspacioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspacioMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(EspacioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDenunciaMaltrato, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        EspacioMenuLayout.setVerticalGroup(
            EspacioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspacioMenuLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(BotonBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonDenunciaMaltrato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        PanelBuscarMascota.setBackground(new java.awt.Color(230, 230, 230));

        jSeparator1.setBackground(new java.awt.Color(61, 0, 112));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(61, 0, 112));
        jLabel1.setText(" > Buscar Mascota");

        javax.swing.GroupLayout PanelBuscarMascotaLayout = new javax.swing.GroupLayout(PanelBuscarMascota);
        PanelBuscarMascota.setLayout(PanelBuscarMascotaLayout);
        PanelBuscarMascotaLayout.setHorizontalGroup(
            PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 507, Short.MAX_VALUE))
        );
        PanelBuscarMascotaLayout.setVerticalGroup(
            PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VentanaDeFondoLayout = new javax.swing.GroupLayout(VentanaDeFondo);
        VentanaDeFondo.setLayout(VentanaDeFondoLayout);
        VentanaDeFondoLayout.setHorizontalGroup(
            VentanaDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaDeFondoLayout.createSequentialGroup()
                .addComponent(EspacioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBuscarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VentanaDeFondoLayout.setVerticalGroup(
            VentanaDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EspacioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBuscarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaDeFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaDeFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMascotaMouseClicked
        // TODO add your handling code here:
        //CAMBIA COLORES DE LOS BOTONES---------------------------------
        resetLblColor(BotonBuscarMascota);
        setLblColor(BotonCrearAviso);
        setLblColor(BotonCargarDenunciante);
        setLblColor(BotonRegistrarMascota);
        setLblColor(BotonDenunciaMaltrato);
        //CAMBIA PANELES SEGUN EL BOTON CLICKEADO-----------------------
        PanelBuscarMascota.setVisible(true);
        PanelBuscarMascota1.setVisible(false);
        PanelCargarDenunciante.setVisible(false);
        PanelRegistrarMascota.setVisible(false);
        PanelDenunciaMaltrato.setVisible(false);
    }//GEN-LAST:event_BotonBuscarMascotaMouseClicked

    private void BotonCrearAvisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearAvisoMouseClicked
        // TODO add your handling code here:
        setLblColor(BotonBuscarMascota);
        resetLblColor(BotonCrearAviso);
        setLblColor(BotonCargarDenunciante);
        setLblColor(BotonRegistrarMascota);
        setLblColor(BotonDenunciaMaltrato);
        PanelBuscarMascota.setVisible(false);
        PanelBuscarMascota1.setVisible(true);
        PanelCargarDenunciante.setVisible(false);
        PanelRegistrarMascota.setVisible(false);
        PanelDenunciaMaltrato.setVisible(false);
    }//GEN-LAST:event_BotonCrearAvisoMouseClicked

    private void BotonCargarDenuncianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCargarDenuncianteMouseClicked
        // TODO add your handling code here:
        setLblColor(BotonBuscarMascota);
        setLblColor(BotonCrearAviso);
        resetLblColor(BotonCargarDenunciante);
        setLblColor(BotonRegistrarMascota);
        setLblColor(BotonDenunciaMaltrato);
        PanelBuscarMascota.setVisible(false);
        PanelBuscarMascota1.setVisible(false);
        PanelCargarDenunciante.setVisible(true);
        PanelRegistrarMascota.setVisible(false);
        PanelDenunciaMaltrato.setVisible(false);
    }//GEN-LAST:event_BotonCargarDenuncianteMouseClicked

    private void BotonRegistrarMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMascotaMouseClicked
        // TODO add your handling code here:
        setLblColor(BotonBuscarMascota);
        setLblColor(BotonCrearAviso);
        setLblColor(BotonCargarDenunciante);
        resetLblColor(BotonRegistrarMascota);
        setLblColor(BotonDenunciaMaltrato);
        PanelBuscarMascota.setVisible(false);
        PanelBuscarMascota1.setVisible(false);
        PanelCargarDenunciante.setVisible(false);
        PanelRegistrarMascota.setVisible(true);
        PanelDenunciaMaltrato.setVisible(false);
    }//GEN-LAST:event_BotonRegistrarMascotaMouseClicked

    private void BotonDenunciaMaltratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDenunciaMaltratoMouseClicked
        // TODO add your handling code here:
        setLblColor(BotonBuscarMascota);
        setLblColor(BotonCrearAviso);
        setLblColor(BotonCargarDenunciante);
        setLblColor(BotonRegistrarMascota);
        resetLblColor(BotonDenunciaMaltrato);
        PanelBuscarMascota.setVisible(false);
        PanelBuscarMascota1.setVisible(false);
        PanelCargarDenunciante.setVisible(false);
        PanelRegistrarMascota.setVisible(false);
        PanelDenunciaMaltrato.setVisible(true);
    }//GEN-LAST:event_BotonDenunciaMaltratoMouseClicked

    //-----------FIN CAMBIO COLORES INCATIVO/ACTIVO-----------------------------------------------------
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonBuscarMascota;
    public javax.swing.JLabel BotonCargarDenunciante;
    public javax.swing.JLabel BotonCrearAviso;
    public javax.swing.JLabel BotonDenunciaMaltrato;
    public javax.swing.JLabel BotonRegistrarMascota;
    private javax.swing.JPanel EspacioMenu;
    private javax.swing.JPanel PanelBuscarMascota;
    private javax.swing.JPanel VentanaDeFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(35,0,66));        
    }

    private void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(88,30,138));        
    }
}
