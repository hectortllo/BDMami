/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author hectortllo
 */
public class Insertar extends javax.swing.JFrame {

    /**
     * Creates new form Insertar
     */
    int x, y;
    public Insertar() {
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

        jPanel1 = new javax.swing.JPanel();
        lblMover = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        lblMenuPrincipal = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblDisenio = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        pnlInsertarInicio = new keeptoo.KGradientPanel();
        lblCliente = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        lblProveedor = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        pnlInsertarCliente = new keeptoo.KGradientPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbDireccion = new rojerusan.RSComboMetro();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlInsertarProveedor = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlInsertarProducto = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 30));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMover.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        lblMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblMoverMouseDragged(evt);
            }
        });
        lblMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMoverMousePressed(evt);
            }
        });
        jPanel1.add(lblMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 30));

        pnlOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-página-principal-96.png"))); // NOI18N
        lblMenuPrincipal.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #0B6121;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h2>Volver al menú principal</h2>\n\t\t<!-- <img src=\"Path img\"> -->\n\t</div>\n</body>\n</html>");
        lblMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuPrincipalMouseClicked(evt);
            }
        });
        pnlOpciones.add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-eliminar-80.png"))); // NOI18N
        lblCerrar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #0B6121;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h2>Cerrar aplicación</h2>\n\t\t<!-- <img src=\"Path img\"> -->\n\t</div>\n</body>\n</html>");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        pnlOpciones.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 90, 80));

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-chevron-abajo-en-círculo-95.png"))); // NOI18N
        lblMinimizar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #0B6121;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h2>Minimizar</h2>\n\t\t<!-- <img src=\"Path img\"> -->\n\t</div>\n</body>\n</html>");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        pnlOpciones.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 100, 100));

        lblDisenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/lineas.png"))); // NOI18N
        pnlOpciones.add(lblDisenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -90, 1000, 520));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        pnlOpciones.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 110));

        jPanel1.add(pnlOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 110));

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        pnlInsertarInicio.setkEndColor(new java.awt.Color(0, 51, 51));
        pnlInsertarInicio.setkGradientFocus(1000);
        pnlInsertarInicio.setkStartColor(new java.awt.Color(0, 204, 204));
        pnlInsertarInicio.setName("pnlInsertarInicio"); // NOI18N
        pnlInsertarInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(204, 204, 204));
        lblCliente.setText("CLIENTE");
        pnlInsertarInicio.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 190, 60));

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-usuario-masculino-240.png"))); // NOI18N
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        pnlInsertarInicio.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-proveedor-240.png"))); // NOI18N
        btnProveedor.setContentAreaFilled(false);
        btnProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        pnlInsertarInicio.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        btnProducto.setForeground(new java.awt.Color(204, 204, 204));
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-producto-240.png"))); // NOI18N
        btnProducto.setContentAreaFilled(false);
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        pnlInsertarInicio.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, -1, -1));

        lblProveedor.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(204, 204, 204));
        lblProveedor.setText("PROVEEDOR");
        pnlInsertarInicio.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 260, 40));

        lblProducto.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(204, 204, 204));
        lblProducto.setText("PRODUCTO");
        pnlInsertarInicio.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 230, 60));

        rSPanelsSlider1.add(pnlInsertarInicio, "card2");

        pnlInsertarCliente.setkEndColor(new java.awt.Color(0, 51, 51));
        pnlInsertarCliente.setkGradientFocus(1000);
        pnlInsertarCliente.setkStartColor(new java.awt.Color(0, 204, 204));
        pnlInsertarCliente.setName("pnlInsertarCliente"); // NOI18N
        pnlInsertarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Consolas", 1, 60)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 255, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INSERTAR CLIENTE");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        pnlInsertarCliente.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1170, 50));

        lblNombre.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 255, 153));
        lblNombre.setText("Nombre: ");
        pnlInsertarCliente.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        lblApellido.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(204, 255, 153));
        lblApellido.setText("Apellido:");
        pnlInsertarCliente.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 153));
        jLabel1.setText("Dirección:");
        pnlInsertarCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        cmbDireccion.setForeground(new java.awt.Color(153, 102, 255));
        cmbDireccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "San Francisco Zap.", "Colonia El Rosario", "Panorama", "San José", "Zunilito", " " }));
        cmbDireccion.setSelectedIndex(-1);
        cmbDireccion.setColorArrow(new java.awt.Color(255, 204, 204));
        cmbDireccion.setColorBorde(new java.awt.Color(153, 153, 255));
        cmbDireccion.setColorFondo(new java.awt.Color(204, 204, 255));
        cmbDireccion.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        pnlInsertarCliente.add(cmbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 290, 40));

        txtApellido.setBackground(new java.awt.Color(204, 204, 255));
        txtApellido.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(153, 102, 255));
        pnlInsertarCliente.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 290, 40));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 255));
        txtTelefono.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(153, 102, 255));
        pnlInsertarCliente.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 290, 40));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 153));
        jLabel4.setText("Teléfono:");
        pnlInsertarCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        txtNombre.setBackground(new java.awt.Color(204, 204, 255));
        txtNombre.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 102, 255));
        pnlInsertarCliente.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 290, 40));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 153));
        jLabel5.setText("Descripción:");
        pnlInsertarCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 102, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        pnlInsertarCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 380, 140));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #0B6121;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h2>Guardar</h2>\n\t\t<!-- <img src=\"Path img\"> -->\n\t</div>\n</body>\n</html>");
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlInsertarCliente.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/regresar.png"))); // NOI18N
        btnRegresar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #0B6121;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h2>Volver</h2>\n\t\t<!-- <img src=\"Path img\"> -->\n\t</div>\n</body>\n</html>");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlInsertarCliente.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/cancelar.png"))); // NOI18N
        btnCancelar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #0B6121;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h2>Cancelar</h2>\n\t\t<!-- <img src=\"Path img\"> -->\n\t</div>\n</body>\n</html>");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlInsertarCliente.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        rSPanelsSlider1.add(pnlInsertarCliente, "card3");

        pnlInsertarProveedor.setkEndColor(new java.awt.Color(0, 51, 51));
        pnlInsertarProveedor.setkGradientFocus(1000);
        pnlInsertarProveedor.setkStartColor(new java.awt.Color(0, 204, 204));
        pnlInsertarProveedor.setName("pnlInsertarProveedor"); // NOI18N
        pnlInsertarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel2.setText("Panel insertar proveedor");
        pnlInsertarProveedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 440, 70));

        rSPanelsSlider1.add(pnlInsertarProveedor, "card4");

        pnlInsertarProducto.setkEndColor(new java.awt.Color(0, 51, 51));
        pnlInsertarProducto.setkGradientFocus(1000);
        pnlInsertarProducto.setkStartColor(new java.awt.Color(0, 204, 204));
        pnlInsertarProducto.setName("pnlInsertarProducto"); // NOI18N
        pnlInsertarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel3.setText("Panel insertar producto");
        pnlInsertarProducto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 112, 400, 70));

        rSPanelsSlider1.add(pnlInsertarProducto, "card5");

        jPanel1.add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1170, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        int n = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?", "CERRANDO", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoverMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lblMoverMouseDragged

    private void lblMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoverMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblMoverMousePressed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        if(!this.btnCliente.isSelected())
        {
            this.btnCliente.setSelected(true);
            this.btnProducto.setSelected(false);
            this.btnProveedor.setSelected(false);
            this.btnRegresar.setSelected(false);
            this.btnGuardar.setSelected(false);
            this.btnCancelar.setSelected(false);
            rSPanelsSlider1.setPanelSlider(10, pnlInsertarCliente, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        if(!this.btnProveedor.isSelected())
        {
            this.btnProveedor.setSelected(true);
            this.btnCliente.setSelected(false);
            this.btnProducto.setSelected(false);
            rSPanelsSlider1.setPanelSlider(10, pnlInsertarProveedor, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        if(!this.btnProducto.isSelected())
        {
            this.btnProducto.setSelected(true);
            this.btnCliente.setSelected(false);
            this.btnProveedor.setSelected(false);
            rSPanelsSlider1.setPanelSlider(10, pnlInsertarProducto, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnProductoActionPerformed

    private void lblMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPrincipalMouseClicked
        int n = JOptionPane.showConfirmDialog(null, "¿Volver al menú principal?", "MENÚ PRINCIPAL", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION)
        {
            this.dispose();
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
        }
            
    }//GEN-LAST:event_lblMenuPrincipalMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        if(!this.btnRegresar.isSelected())
        {
            this.btnRegresar.setSelected(true);
            this.btnGuardar.setSelected(false);
            this.btnCancelar.setSelected(false);
            this.btnCliente.setSelected(false);
            this.btnProducto.setSelected(false);
            this.btnProveedor.setSelected(false);
            rSPanelsSlider1.setPanelSlider(10, pnlInsertarInicio, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRegresar;
    private rojerusan.RSComboMetro cmbDireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDisenio;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMover;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTitulo;
    private keeptoo.KGradientPanel pnlInsertarCliente;
    private keeptoo.KGradientPanel pnlInsertarInicio;
    private keeptoo.KGradientPanel pnlInsertarProducto;
    private keeptoo.KGradientPanel pnlInsertarProveedor;
    private javax.swing.JPanel pnlOpciones;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
