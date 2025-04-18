package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.ATM;
import modelo.Datos;
import vista.paneles.pnl_autenticacion;
import vista.paneles.pnl_deposito;
import vista.paneles.pnl_menu;
import vista.paneles.pnl_retiro;
import vista.paneles.pnl_saldo;

public class frmPadre extends javax.swing.JFrame {

    public pnl_autenticacion pnl_autenticacion = new pnl_autenticacion();
    
    public pnl_menu pnlMenu;
    public pnl_deposito pnl_deposito;
    public pnl_retiro pnl_retiro;
    public pnl_saldo pnlSaldo;
    
    private int x, y;

    public String OPCION = "LOGIN";
    private ATM claseAtm = new ATM();
    public int cuenta = 0;

    public frmPadre() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(418, 620); // ancho, alto

        // Inicializar componentes
        this.getContentPane().setBackground(new Color(254, 102, 0));
        this.setLocationRelativeTo(null);
        mostrarPanel(pnl_autenticacion);
        btnAtras.setVisible(false);
    }

    private void escribir(String tecla) {
        switch (OPCION) {
            case "LOGIN":
                pnl_autenticacion.Escribir(tecla);
                break;
            case "RETIRO":
                pnl_retiro.Escribir(tecla);
                break;
            case "DEPOSITO":
                pnl_deposito.Escribir(tecla);
                break;
        }
    }

    private void Accion() {
        if (OPCION.equals("LOGIN")) {
            try {
                int cuenta = Integer.parseInt(pnl_autenticacion.txt_cuenta.getText().toString());
                int nip = Integer.parseInt(pnl_autenticacion.txt_nip.getText().toString());

                if (claseAtm.autenticarUsuario(cuenta, nip)) {
                    
                    //inicarlizar los paneles
                    pnlMenu=new pnl_menu(this);
                    pnl_deposito = new pnl_deposito();
                    this.pnl_retiro = new pnl_retiro();
                    
                    this.cuenta = cuenta;
                    btnAtras.setVisible(true);
                    mostrarPanel(pnlMenu);
                    lbCuenta.setText("CUENTA: " + cuenta);
                    claseAtm.setCuenta(cuenta);

                    
                } else {
                    JOptionPane.showMessageDialog(null, "Cuenta o NIP incorrecto. Intenta nuevamente");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error en el formato de la cuenta o NIP. Intenta nuevamente");
            }
        } else if (OPCION.equals("RETIRO")) {
            String mensaje=claseAtm.crearTransaccion(2, Integer.parseInt(pnl_retiro.txt_monto.getText()));
            JOptionPane.showMessageDialog(null, mensaje);
             pnl_retiro.txt_monto.setText("");
        } else if (OPCION.equals("DEPOSITO")) {
            String mensaje=claseAtm.crearTransaccion(3, Integer.parseInt(pnl_deposito.txt_monto.getText()));
            JOptionPane.showMessageDialog(null, mensaje);
            pnl_deposito.txt_monto.setText("");
        }
        this.pnlSaldo = new pnl_saldo(this.claseAtm);
        
        System.out.println(OPCION+" valor retiro:"+pnl_retiro.txt_monto.getText());
        System.out.println(OPCION+" valor deposito:"+pnl_deposito.txt_monto.getText());
        
    }

    public void mostrarPanel(JPanel panel) {
        pnl_contenedor.removeAll();
        pnl_contenedor.setLayout(new BorderLayout());
        pnl_contenedor.add(panel, BorderLayout.CENTER);
        pnl_contenedor.revalidate();
        pnl_contenedor.repaint();
    }

    public int recuper() {
        return this.cuenta;
    }

    
    public void limpiar(){
        if (OPCION.equals("LOGIN")){
            pnl_autenticacion.limpiar();
        }else if (OPCION.equals("DEPOSITO")){
            pnl_deposito.limpiar();
        }else if (OPCION.equals("RETIRO")){
            pnl_retiro.limpiar();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        jPanel1 = new javax.swing.JPanel();
        btnAtras = new rojeru_san.rsbutton.RSButtonRoundRippleIcon();
        pnl_contenedor = new javax.swing.JPanel();
        rSPanelImage2 = new rojeru_san.rspanel.RSPanelImage();
        pnlTeclado = new javax.swing.JPanel();
        btn7 = new rojerusan.RSMaterialButtonRectangle();
        btn8 = new rojerusan.RSMaterialButtonRectangle();
        btn9 = new rojerusan.RSMaterialButtonRectangle();
        btn4 = new rojerusan.RSMaterialButtonRectangle();
        btn5 = new rojerusan.RSMaterialButtonRectangle();
        btn6 = new rojerusan.RSMaterialButtonRectangle();
        btn1 = new rojerusan.RSMaterialButtonRectangle();
        btn2 = new rojerusan.RSMaterialButtonRectangle();
        btn3 = new rojerusan.RSMaterialButtonRectangle();
        btn0 = new rojerusan.RSMaterialButtonRectangle();
        btnBorrar = new rojerusan.RSMaterialButtonRectangle();
        btnProcesar = new rojerusan.RSMaterialButtonRectangle();
        lbCuenta = new javax.swing.JLabel();
        panelNice3 = new org.edisoncor.gui.panel.PanelNice();
        btnvacio9 = new rojerusan.RSPanelImage();
        jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelNice5 = new org.edisoncor.gui.panel.PanelNice();
        pnlRanuraDeposito = new org.edisoncor.gui.panel.PanelNice();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        panelNice6 = new org.edisoncor.gui.panel.PanelNice();
        btnvacio15 = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        btnvacio16 = new rojerusan.RSPanelImage();
        jpanelRetiro = new org.edisoncor.gui.panel.PanelNice();
        img10soles = new rojerusan.RSPanelImage();
        pnlRanuraRetiro = new org.edisoncor.gui.panel.PanelNice();
        btnclose = new rojerusan.RSPanelImage();
        btnmin1 = new rojerusan.RSPanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-oficial.jpg"))); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        btnAtras.setBackground(new java.awt.Color(21, 53, 111));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setColorHover(new java.awt.Color(0, 22, 124));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(300, 40, 90, 30);

        pnl_contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 41, 129), 2));

        javax.swing.GroupLayout pnl_contenedorLayout = new javax.swing.GroupLayout(pnl_contenedor);
        pnl_contenedor.setLayout(pnl_contenedorLayout);
        pnl_contenedorLayout.setHorizontalGroup(
            pnl_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        pnl_contenedorLayout.setVerticalGroup(
            pnl_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        jPanel1.add(pnl_contenedor);
        pnl_contenedor.setBounds(20, 70, 370, 260);

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_white.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage2Layout = new javax.swing.GroupLayout(rSPanelImage2);
        rSPanelImage2.setLayout(rSPanelImage2Layout);
        rSPanelImage2Layout.setHorizontalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        rSPanelImage2Layout.setVerticalGroup(
            rSPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(rSPanelImage2);
        rSPanelImage2.setBounds(20, 0, 70, 40);

        pnlTeclado.setBackground(new java.awt.Color(21, 53, 111));
        pnlTeclado.setLayout(new java.awt.GridLayout(4, 3, -5, -5));

        btn7.setBackground(new java.awt.Color(253, 19, 94));
        btn7.setText("7");
        btn7.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn7);

        btn8.setBackground(new java.awt.Color(253, 19, 94));
        btn8.setText("8");
        btn8.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn8);

        btn9.setBackground(new java.awt.Color(253, 19, 94));
        btn9.setText("9");
        btn9.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn9);

        btn4.setBackground(new java.awt.Color(253, 19, 94));
        btn4.setText("4");
        btn4.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn4);

        btn5.setBackground(new java.awt.Color(253, 19, 94));
        btn5.setText("5");
        btn5.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn5);

        btn6.setBackground(new java.awt.Color(253, 19, 94));
        btn6.setText("6");
        btn6.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn6);

        btn1.setBackground(new java.awt.Color(253, 19, 94));
        btn1.setText("1");
        btn1.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn1);

        btn2.setBackground(new java.awt.Color(253, 19, 94));
        btn2.setText("2");
        btn2.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn2);

        btn3.setBackground(new java.awt.Color(253, 19, 94));
        btn3.setText("3");
        btn3.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn3);

        btn0.setBackground(new java.awt.Color(253, 19, 94));
        btn0.setText("0");
        btn0.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        pnlTeclado.add(btn0);

        btnBorrar.setBackground(new java.awt.Color(253, 19, 94));
        btnBorrar.setText("X");
        btnBorrar.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        pnlTeclado.add(btnBorrar);

        btnProcesar.setBackground(new java.awt.Color(253, 19, 94));
        btnProcesar.setText("Enter");
        btnProcesar.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        pnlTeclado.add(btnProcesar);

        jPanel1.add(pnlTeclado);
        pnlTeclado.setBounds(20, 340, 180, 260);

        lbCuenta.setForeground(new java.awt.Color(0, 31, 110));
        lbCuenta.setText("CUENTA:");
        jPanel1.add(lbCuenta);
        lbCuenta.setBounds(110, 20, 170, 16);

        panelNice3.setBackground(new java.awt.Color(216, 215, 215));
        panelNice3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnvacio9.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_money_512px.png"))); // NOI18N

        javax.swing.GroupLayout btnvacio9Layout = new javax.swing.GroupLayout(btnvacio9);
        btnvacio9.setLayout(btnvacio9Layout);
        btnvacio9Layout.setHorizontalGroup(
            btnvacio9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        btnvacio9Layout.setVerticalGroup(
            btnvacio9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelNice3.add(btnvacio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        jpanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelNice3.add(jpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 33, 108));
        jLabel1.setText("Deposita tu Billete");
        panelNice3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 20));

        panelNice5.setBackground(new java.awt.Color(237, 246, 252));
        panelNice5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRanuraDeposito.setBackground(new java.awt.Color(0, 0, 0));
        pnlRanuraDeposito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelNice5.add(pnlRanuraDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 20));

        panelNice3.add(panelNice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 40));

        rSMaterialButtonRectangle3.setBackground(new java.awt.Color(255, 0, 0));
        panelNice3.add(rSMaterialButtonRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 20, 20));

        jPanel1.add(panelNice3);
        panelNice3.setBounds(210, 350, 190, 120);

        panelNice6.setBackground(new java.awt.Color(255, 255, 255));
        panelNice6.setAnchoDeBorde(0.0F);
        panelNice6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnvacio15.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_money_512px.png"))); // NOI18N

        javax.swing.GroupLayout btnvacio15Layout = new javax.swing.GroupLayout(btnvacio15);
        btnvacio15.setLayout(btnvacio15Layout);
        btnvacio15Layout.setHorizontalGroup(
            btnvacio15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        btnvacio15Layout.setVerticalGroup(
            btnvacio15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panelNice6.add(btnvacio15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 33, 108));
        jLabel2.setText("Retira tu billete");
        panelNice6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 10));

        btnvacio16.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_down_480px.png"))); // NOI18N

        javax.swing.GroupLayout btnvacio16Layout = new javax.swing.GroupLayout(btnvacio16);
        btnvacio16.setLayout(btnvacio16Layout);
        btnvacio16Layout.setHorizontalGroup(
            btnvacio16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        btnvacio16Layout.setVerticalGroup(
            btnvacio16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        panelNice6.add(btnvacio16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jpanelRetiro.setBackground(new java.awt.Color(51, 51, 51));
        jpanelRetiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img10soles.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/10soles.png"))); // NOI18N
        img10soles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img10solesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout img10solesLayout = new javax.swing.GroupLayout(img10soles);
        img10soles.setLayout(img10solesLayout);
        img10solesLayout.setHorizontalGroup(
            img10solesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        img10solesLayout.setVerticalGroup(
            img10solesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpanelRetiro.add(img10soles, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 160, 40));

        pnlRanuraRetiro.setBackground(new java.awt.Color(153, 153, 153));
        pnlRanuraRetiro.setAnchoDeBorde(0.0F);
        pnlRanuraRetiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpanelRetiro.add(pnlRanuraRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 20));

        panelNice6.add(jpanelRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, 50));

        jPanel1.add(panelNice6);
        panelNice6.setBounds(210, 490, 190, 100);

        btnclose.setToolTipText("Cerrar");
        btnclose.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        btnclose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btncloseMouseMoved(evt);
            }
        });
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncloseMouseExited(evt);
            }
        });
        jPanel1.add(btnclose);
        btnclose.setBounds(380, 10, 20, 20);

        btnmin1.setToolTipText("Minimizar");
        btnmin1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minR.png"))); // NOI18N
        btnmin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnmin1MouseMoved(evt);
            }
        });
        btnmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmin1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmin1MouseExited(evt);
            }
        });
        jPanel1.add(btnmin1);
        btnmin1.setBounds(350, 10, 20, 20);

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        //mostrarPanel(pnlMenu);
        mostrarPanel(pnlMenu);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        escribir("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        escribir("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        escribir("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        escribir("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        escribir("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        escribir("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        escribir("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        escribir("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        escribir("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        escribir("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        Accion();
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void img10solesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img10solesMouseClicked
        // TODO add your handling code here:
        img10soles.setVisible(false);
    }//GEN-LAST:event_img10solesMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

    private void btncloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseMoved
        // TODO add your handling code here:
        btnclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btncloseMouseMoved

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btncloseMouseClicked

    private void btncloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseMouseExited

    private void btnmin1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmin1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmin1MouseMoved

    private void btnmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmin1MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnmin1MouseClicked

    private void btnmin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmin1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmin1MouseExited

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPadre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn0;
    private rojerusan.RSMaterialButtonRectangle btn1;
    private rojerusan.RSMaterialButtonRectangle btn2;
    private rojerusan.RSMaterialButtonRectangle btn3;
    private rojerusan.RSMaterialButtonRectangle btn4;
    private rojerusan.RSMaterialButtonRectangle btn5;
    private rojerusan.RSMaterialButtonRectangle btn6;
    private rojerusan.RSMaterialButtonRectangle btn7;
    private rojerusan.RSMaterialButtonRectangle btn8;
    private rojerusan.RSMaterialButtonRectangle btn9;
    public rojeru_san.rsbutton.RSButtonRoundRippleIcon btnAtras;
    private rojerusan.RSMaterialButtonRectangle btnBorrar;
    private rojerusan.RSMaterialButtonRectangle btnProcesar;
    private rojerusan.RSPanelImage btnclose;
    private rojerusan.RSPanelImage btnmin1;
    private rojerusan.RSPanelImage btnvacio15;
    private rojerusan.RSPanelImage btnvacio16;
    private rojerusan.RSPanelImage btnvacio9;
    private rojerusan.RSPanelImage img10soles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanel;
    private org.edisoncor.gui.panel.PanelNice jpanelRetiro;
    public javax.swing.JLabel lbCuenta;
    private org.edisoncor.gui.panel.PanelNice panelNice3;
    private org.edisoncor.gui.panel.PanelNice panelNice5;
    private org.edisoncor.gui.panel.PanelNice panelNice6;
    public static org.edisoncor.gui.panel.PanelNice pnlRanuraDeposito;
    public static org.edisoncor.gui.panel.PanelNice pnlRanuraRetiro;
    private javax.swing.JPanel pnlTeclado;
    private javax.swing.JPanel pnl_contenedor;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage2;
    // End of variables declaration//GEN-END:variables

}
