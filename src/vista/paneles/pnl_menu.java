package vista.paneles;

import javax.swing.JFrame;
import vista.frmPadre;

/**
 *
 * @author hackgris
 */
public class pnl_menu extends javax.swing.JPanel {

    frmPadre ventanaPrincipal;
    public pnl_menu(frmPadre ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal=ventanaPrincipal;
        this.ventanaPrincipal.btnAtras.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSPanelRound2 = new rojeru_san.rspanel.RSPanelRound();
        rSLabelLineWrap1 = new rojeru_san.rslabel.RSLabelLineWrap();
        rSLabelImage1 = new necesario.RSLabelImage();
        rSPanelRound3 = new rojeru_san.rspanel.RSPanelRound();
        rSLabelLineWrap2 = new rojeru_san.rslabel.RSLabelLineWrap();
        rSPanelRound4 = new rojeru_san.rspanel.RSPanelRound();
        rSLabelLineWrap3 = new rojeru_san.rslabel.RSLabelLineWrap();
        rSPanelRound5 = new rojeru_san.rspanel.RSPanelRound();
        rSLabelLineWrap4 = new rojeru_san.rslabel.RSLabelLineWrap();

        setBackground(new java.awt.Color(0, 19, 148));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");
        add(jLabel1);
        jLabel1.setBounds(6, 6, 63, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Qué operación deseas realizar hoy?");
        add(jLabel2);
        jLabel2.setBounds(0, 20, 308, 25);

        rSPanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelRound2.setColorBackground(new java.awt.Color(255, 255, 255));
        rSPanelRound2.setPonerBorde(false);
        rSPanelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSPanelRound2MouseClicked(evt);
            }
        });

        rSLabelLineWrap1.setForeground(new java.awt.Color(0, 1, 202));
        rSLabelLineWrap1.setColorForeground(new java.awt.Color(0, 1, 202));
        rSLabelLineWrap1.setEnabled(false);
        rSLabelLineWrap1.setFocusable(false);
        rSLabelLineWrap1.setFuente(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSLabelLineWrap1.setOpaque(true);
        rSLabelLineWrap1.setRequestFocusEnabled(false);
        rSLabelLineWrap1.setText("Retirar\nEfectivo\n____");
        rSLabelLineWrap1.setVerifyInputWhenFocusTarget(false);
        rSLabelLineWrap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelLineWrap1MouseClicked(evt);
            }
        });

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dinero.png"))); // NOI18N
        rSLabelImage1.setText("");
        rSLabelImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSPanelRound2Layout = new javax.swing.GroupLayout(rSPanelRound2);
        rSPanelRound2.setLayout(rSPanelRound2Layout);
        rSPanelRound2Layout.setHorizontalGroup(
            rSPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(rSPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelLineWrap1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        rSPanelRound2Layout.setVerticalGroup(
            rSPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelLineWrap1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        add(rSPanelRound2);
        rSPanelRound2.setBounds(10, 60, 110, 120);

        rSPanelRound3.setBackground(new java.awt.Color(251, 91, 21));
        rSPanelRound3.setColorBackground(new java.awt.Color(251, 91, 21));
        rSPanelRound3.setEnabled(false);
        rSPanelRound3.setPonerBorde(false);
        rSPanelRound3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSPanelRound3MouseClicked(evt);
            }
        });

        rSLabelLineWrap2.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelLineWrap2.setColorForeground(new java.awt.Color(255, 255, 255));
        rSLabelLineWrap2.setFuente(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSLabelLineWrap2.setText("Ver mi \nSaldo\n˗˗˗˗");
        rSLabelLineWrap2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelLineWrap2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSPanelRound3Layout = new javax.swing.GroupLayout(rSPanelRound3);
        rSPanelRound3.setLayout(rSPanelRound3Layout);
        rSPanelRound3Layout.setHorizontalGroup(
            rSPanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rSLabelLineWrap2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        rSPanelRound3Layout.setVerticalGroup(
            rSPanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelLineWrap2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(rSPanelRound3);
        rSPanelRound3.setBounds(140, 60, 111, 60);

        rSPanelRound4.setBackground(new java.awt.Color(251, 91, 21));
        rSPanelRound4.setColorBackground(new java.awt.Color(251, 91, 21));
        rSPanelRound4.setPonerBorde(false);
        rSPanelRound4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSPanelRound4MouseClicked(evt);
            }
        });

        rSLabelLineWrap3.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelLineWrap3.setColorForeground(new java.awt.Color(255, 255, 255));
        rSLabelLineWrap3.setEnabled(false);
        rSLabelLineWrap3.setFuente(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSLabelLineWrap3.setText("Depositar\nFondos\n˗˗˗˗˗˗");
        rSLabelLineWrap3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelLineWrap3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSPanelRound4Layout = new javax.swing.GroupLayout(rSPanelRound4);
        rSPanelRound4.setLayout(rSPanelRound4Layout);
        rSPanelRound4Layout.setHorizontalGroup(
            rSPanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rSLabelLineWrap3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        rSPanelRound4Layout.setVerticalGroup(
            rSPanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelLineWrap3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        add(rSPanelRound4);
        rSPanelRound4.setBounds(140, 120, 112, 60);

        rSPanelRound5.setBackground(new java.awt.Color(251, 91, 21));
        rSPanelRound5.setColorBackground(new java.awt.Color(251, 91, 21));
        rSPanelRound5.setPonerBorde(false);
        rSPanelRound5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSPanelRound5MouseClicked(evt);
            }
        });

        rSLabelLineWrap4.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelLineWrap4.setColorForeground(new java.awt.Color(255, 255, 255));
        rSLabelLineWrap4.setEnabled(false);
        rSLabelLineWrap4.setFuente(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSLabelLineWrap4.setText("Cerrar Sesion");
        rSLabelLineWrap4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelLineWrap4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSPanelRound5Layout = new javax.swing.GroupLayout(rSPanelRound5);
        rSPanelRound5.setLayout(rSPanelRound5Layout);
        rSPanelRound5Layout.setHorizontalGroup(
            rSPanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rSLabelLineWrap4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        rSPanelRound5Layout.setVerticalGroup(
            rSPanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rSLabelLineWrap4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(rSPanelRound5);
        rSPanelRound5.setBounds(270, 80, 112, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void rSPanelRound2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelRound2MouseClicked
        // TODO add yvour handling code here:]
        ventanaPrincipal.mostrarPanel(ventanaPrincipal.pnl_retiro);
        ventanaPrincipal.OPCION="RETIRO";
    }//GEN-LAST:event_rSPanelRound2MouseClicked

    private void rSPanelRound3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelRound3MouseClicked
        // TODO add your handling code here:
        ventanaPrincipal.mostrarPanel(ventanaPrincipal.pnlSaldo);
        ventanaPrincipal.OPCION="SALDO";
    }//GEN-LAST:event_rSPanelRound3MouseClicked

    private void rSLabelLineWrap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelLineWrap1MouseClicked
        // TODO add your handling code here:
        ventanaPrincipal.mostrarPanel(ventanaPrincipal.pnl_retiro);
        ventanaPrincipal.OPCION="RETIRO";
    }//GEN-LAST:event_rSLabelLineWrap1MouseClicked

    private void rSLabelImage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage1MouseClicked
        // TODO add your handling code here:
        ventanaPrincipal.mostrarPanel(ventanaPrincipal.pnl_retiro);
        ventanaPrincipal.OPCION="RETIRO";
    }//GEN-LAST:event_rSLabelImage1MouseClicked

    private void rSLabelLineWrap2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelLineWrap2MouseClicked
        // TODO add your handling code here:
        ventanaPrincipal.mostrarPanel(ventanaPrincipal.pnlSaldo);
        ventanaPrincipal.OPCION="SALDO";
    }//GEN-LAST:event_rSLabelLineWrap2MouseClicked

    private void rSLabelLineWrap3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelLineWrap3MouseClicked
        // TODO add your handling code here:
        ventanaPrincipal.mostrarPanel(ventanaPrincipal.pnl_deposito);
        ventanaPrincipal.OPCION="DEPOSITO";
    }//GEN-LAST:event_rSLabelLineWrap3MouseClicked

    private void rSPanelRound4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelRound4MouseClicked
        // TODO add your handling code here:
        ventanaPrincipal.mostrarPanel(ventanaPrincipal.pnl_deposito);
        ventanaPrincipal.OPCION="DEPOSITO";
    }//GEN-LAST:event_rSPanelRound4MouseClicked

    private void rSLabelLineWrap4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelLineWrap4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSLabelLineWrap4MouseClicked

    private void rSPanelRound5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelRound5MouseClicked
        // TODO add your handling code here:
        ventanaPrincipal.mostrarPanel(ventanaPrincipal.pnl_autenticacion);
        ventanaPrincipal.btnAtras.setVisible(false);
        ventanaPrincipal.OPCION="LOGIN";
    }//GEN-LAST:event_rSPanelRound5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private necesario.RSLabelImage rSLabelImage1;
    private rojeru_san.rslabel.RSLabelLineWrap rSLabelLineWrap1;
    private rojeru_san.rslabel.RSLabelLineWrap rSLabelLineWrap2;
    private rojeru_san.rslabel.RSLabelLineWrap rSLabelLineWrap3;
    private rojeru_san.rslabel.RSLabelLineWrap rSLabelLineWrap4;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound2;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound3;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound4;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound5;
    // End of variables declaration//GEN-END:variables

}
