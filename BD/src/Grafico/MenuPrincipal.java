package Grafico;

import javax.swing.JOptionPane;


/**
 *
 * @author hectortllo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    int x, y;
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnInsertar = new javax.swing.JButton();
        btnBusquedas = new javax.swing.JButton();
        btnNegocio = new javax.swing.JButton();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        lblMover = new javax.swing.JLabel();
        lblDisenio = new javax.swing.JLabel();
        lblInsert = new javax.swing.JLabel();
        lblBusqued = new javax.swing.JLabel();
        lblInsert1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 30));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-añadir-lista-240.png"))); // NOI18N
        btnInsertar.setContentAreaFilled(false);
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        btnBusquedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-búsqueda-de-propiedad-240.png"))); // NOI18N
        btnBusquedas.setContentAreaFilled(false);
        btnBusquedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusquedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedasActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnBusquedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        btnNegocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-pequeña-empresa-256.png"))); // NOI18N
        btnNegocio.setContentAreaFilled(false);
        btnNegocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNegocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegocioActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnNegocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, -1, -1));

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-chevron-abajo-en-círculo-95.png"))); // NOI18N
        lblMinimizar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #0B6121;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h2>Minimizar</h2>\n\t\t<!-- <img src=\"Path img\"> -->\n\t</div>\n</body>\n</html>");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        kGradientPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 100, 100));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-eliminar-80.png"))); // NOI18N
        lblCerrar.setToolTipText("<html>\n<head>\n\t<style>\n\t\t #contenido{ \n\t\tbackground: #0B6121;  /*Se le da un color de fondo*/\n\t\tcolor: white;\t\t  /*Color a la letra*/\n\t\t}\n\t</style>\n</head>\n<body>\n\t<div id=contenido>\n\t\t<h2>Cerrar aplicación</h2>\n\t\t<!-- <img src=\"Path img\"> -->\n\t</div>\n</body>\n</html>");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        kGradientPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 90, 80));

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
        kGradientPanel1.add(lblMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 30));

        lblDisenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/lineas.png"))); // NOI18N
        kGradientPanel1.add(lblDisenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -90, 1000, 520));

        lblInsert.setBackground(new java.awt.Color(153, 153, 0));
        lblInsert.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        lblInsert.setForeground(new java.awt.Color(204, 204, 204));
        lblInsert.setText("INSERTAR");
        kGradientPanel1.add(lblInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        lblBusqued.setBackground(new java.awt.Color(153, 153, 0));
        lblBusqued.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        lblBusqued.setForeground(new java.awt.Color(204, 204, 204));
        lblBusqued.setText("BÚSQUEDAS");
        kGradientPanel1.add(lblBusqued, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        lblInsert1.setBackground(new java.awt.Color(153, 153, 0));
        lblInsert1.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        lblInsert1.setForeground(new java.awt.Color(204, 204, 204));
        lblInsert1.setText("NEGOCIO");
        kGradientPanel1.add(lblInsert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, -1, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoverMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblMoverMousePressed

    private void lblMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoverMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lblMoverMouseDragged

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        int n = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?", "CERRANDO", JOptionPane.YES_NO_OPTION);
        if(n == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        this.dispose();
        Insertar insertar = new Insertar();
        insertar.setVisible(true);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBusquedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedasActionPerformed
        this.dispose();
        busquedas buscar = new busquedas();
        buscar.setVisible(true);
    }//GEN-LAST:event_btnBusquedasActionPerformed

    private void btnNegocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegocioActionPerformed
        this.dispose();
        Negocio negocio = new Negocio();
        negocio.setVisible(true);
    }//GEN-LAST:event_btnNegocioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusquedas;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnNegocio;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblBusqued;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDisenio;
    private javax.swing.JLabel lblInsert;
    private javax.swing.JLabel lblInsert1;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblMover;
    // End of variables declaration//GEN-END:variables
}
