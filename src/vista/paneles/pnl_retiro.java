package vista.paneles;

/**
 *
 * @author hackgris
 */
public class pnl_retiro extends javax.swing.JPanel {

    public pnl_retiro() {
        initComponents();
    }
    
    public void Escribir(String letra){
        txt_monto.setText(txt_monto.getText()+letra);
    }
    public void limpiar(){
        txt_monto.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_monto = new javax.swing.JLabel();
        rSLabelImage1 = new necesario.RSLabelImage();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSLabelBorderRound1 = new rojeru_san.rslabel.RSLabelBorderRound();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn21 = new rojerusan.RSMaterialButtonRectangle();
        btn23 = new rojerusan.RSMaterialButtonRectangle();
        btn25 = new rojerusan.RSMaterialButtonRectangle();
        btn24 = new rojerusan.RSMaterialButtonRectangle();
        btn22 = new rojerusan.RSMaterialButtonRectangle();
        btn20 = new rojerusan.RSMaterialButtonRectangle();

        setBackground(new java.awt.Color(255, 255, 255));

        txt_monto.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txt_monto.setForeground(new java.awt.Color(0, 31, 110));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dinero.png"))); // NOI18N
        rSLabelImage1.setText("");
        rSLabelImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage1MouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 31, 110));
        jLabel3.setText("Ingresa el monto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 31, 110));
        jLabel4.setText("S/.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 31, 110));
        jLabel5.setText("Selecciona o ingresa el monto a retirar");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(2, 3, -5, -5));

        btn21.setBackground(new java.awt.Color(0, 31, 110));
        btn21.setText("S/.20");
        btn21.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel1.add(btn21);

        btn23.setBackground(new java.awt.Color(0, 31, 110));
        btn23.setText("S/.40");
        btn23.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });
        jPanel1.add(btn23);

        btn25.setBackground(new java.awt.Color(0, 31, 110));
        btn25.setText("S/.60");
        btn25.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });
        jPanel1.add(btn25);

        btn24.setBackground(new java.awt.Color(0, 31, 110));
        btn24.setText("S/.100");
        btn24.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });
        jPanel1.add(btn24);

        btn22.setBackground(new java.awt.Color(0, 31, 110));
        btn22.setText("S/.200");
        btn22.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel1.add(btn22);

        btn20.setBackground(new java.awt.Color(251, 91, 21));
        btn20.setText("Limpiar");
        btn20.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel1.add(btn20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rSLabelBorderRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelBorderRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSLabelImage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rSLabelImage1MouseClicked

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        txt_monto.setText("20");
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        // TODO add your handling code here:
        txt_monto.setText("40");
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        // TODO add your handling code here:
        txt_monto.setText("60");
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        // TODO add your handling code here:
        txt_monto.setText("100");
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        txt_monto.setText("200");
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        txt_monto.setText("");
       
    }//GEN-LAST:event_btn20ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn20;
    private rojerusan.RSMaterialButtonRectangle btn21;
    private rojerusan.RSMaterialButtonRectangle btn22;
    private rojerusan.RSMaterialButtonRectangle btn23;
    private rojerusan.RSMaterialButtonRectangle btn24;
    private rojerusan.RSMaterialButtonRectangle btn25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound1;
    private necesario.RSLabelImage rSLabelImage1;
    public static javax.swing.JLabel txt_monto;
    // End of variables declaration//GEN-END:variables

}
