package vista.paneles;

public class pnl_autenticacion extends javax.swing.JPanel {
    
    public pnl_autenticacion() {
        initComponents();
        //txt_cuenta.setEditable(false);
        //txt_nip.setEditable(false);
    }
    
    public void Escribir(String teclado) {
        
        if (txt_cuenta.getText().length() < 5) {
            txt_cuenta.setText(txt_cuenta.getText() + teclado);
        } else if (txt_nip.getText().length() < 5) {
            txt_nip.setText(txt_nip.getText() + teclado);
        }
    }
    
    public void limpiar() {
        txt_cuenta.setText("");
        txt_nip.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_cuenta = new rojeru_san.rsfield.RSTextFull();
        txt_nip = new rojeru_san.rsfield.RSPassword();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 41, 129), 2));
        setPreferredSize(new java.awt.Dimension(380, 250));

        txt_cuenta.setPlaceholder(" Numero de Cuenta");

        txt_nip.setPlaceholder(" Nip");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nip, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(txt_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txt_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojeru_san.rsfield.RSTextFull txt_cuenta;
    public rojeru_san.rsfield.RSPassword txt_nip;
    // End of variables declaration//GEN-END:variables

}
