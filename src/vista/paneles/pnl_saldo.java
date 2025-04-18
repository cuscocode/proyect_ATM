package vista.paneles;

import modelo.ATM;
import vista.frmPadre;

public class pnl_saldo extends javax.swing.JPanel {

    ATM claseAtm;
    public pnl_saldo(ATM clase) {
        this.claseAtm=clase;
        initComponents();
       this.cargarSaldo();
    }
    
    public void cargarSaldo(){
        txt_saldo.setText(claseAtm.crearTransaccion(1, 0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_saldo = new rojeru_san.rslabel.RSLabelLineWrap();
        jLabel5 = new javax.swing.JLabel();
        rSLabelImage1 = new necesario.RSLabelImage();
        rSLabelBorderRound1 = new rojeru_san.rslabel.RSLabelBorderRound();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        txt_saldo.setColorForeground(new java.awt.Color(0, 40, 127));
        txt_saldo.setText("Dinero:5000\nmonto Total:1000");
        add(txt_saldo);
        txt_saldo.setBounds(40, 60, 310, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 31, 110));
        jLabel5.setText("Tu Dinero Actual");
        add(jLabel5);
        jLabel5.setBounds(50, 20, 240, 16);

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dinero.png"))); // NOI18N
        rSLabelImage1.setText("");
        rSLabelImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage1MouseClicked(evt);
            }
        });
        add(rSLabelImage1);
        rSLabelImage1.setBounds(10, 10, 39, 27);
        add(rSLabelBorderRound1);
        rSLabelBorderRound1.setBounds(20, 50, 350, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void rSLabelImage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_rSLabelImage1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound1;
    private necesario.RSLabelImage rSLabelImage1;
    private rojeru_san.rslabel.RSLabelLineWrap txt_saldo;
    // End of variables declaration//GEN-END:variables

}
