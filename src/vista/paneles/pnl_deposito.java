package vista.paneles;

import static vista.paneles.pnl_retiro.txt_monto;

/**
 *
 * @author hackgris
 */
public class pnl_deposito extends javax.swing.JPanel {

    public pnl_deposito() {
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

        jLabel1 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JLabel();
        rSLabelImage1 = new necesario.RSLabelImage();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rSLabelBorderRound1 = new rojeru_san.rslabel.RSLabelBorderRound();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        txt_monto.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txt_monto.setForeground(new java.awt.Color(0, 31, 110));
        add(txt_monto);
        txt_monto.setBounds(100, 80, 230, 50);

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dinero.png"))); // NOI18N
        rSLabelImage1.setText("");
        rSLabelImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage1MouseClicked(evt);
            }
        });
        add(rSLabelImage1);
        rSLabelImage1.setBounds(10, 20, 39, 27);

        jLabel3.setForeground(new java.awt.Color(0, 31, 110));
        jLabel3.setText("Ingresa el monto");
        add(jLabel3);
        jLabel3.setBounds(30, 60, 130, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 31, 110));
        jLabel4.setText("S/.");
        add(jLabel4);
        jLabel4.setBounds(50, 80, 40, 50);
        add(rSLabelBorderRound1);
        rSLabelBorderRound1.setBounds(10, 80, 350, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 31, 110));
        jLabel5.setText("ingresa el monto a Depositar");
        add(jLabel5);
        jLabel5.setBounds(50, 20, 240, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void rSLabelImage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage1MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_rSLabelImage1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound1;
    private necesario.RSLabelImage rSLabelImage1;
    public javax.swing.JLabel txt_monto;
    // End of variables declaration//GEN-END:variables

}
