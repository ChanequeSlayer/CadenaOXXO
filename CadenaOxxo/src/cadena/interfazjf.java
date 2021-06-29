package cadena;
/**
 * Clase interfazjf
 * Clase: Ventana Principal de inicio o registro
 * La primera ventana que nos muestra la opcion de iniciar sesion o de
 * registrarnos como usuarios.
 * Clase de Tipo JFrame, por esa razon hereda de Swing
 * Dos botones, abren cada uno la ventana interfazis e interfazreg
 * @version 1.0, 20/06/2021
 * @author Jorge, Ray
 */
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class interfazjf extends javax.swing.JFrame {

 /**
 * Metodo Constructor, inicializa componentes de JFrame.
 * @version 1.0, 20/06/2021
 * @author Jorge, Ray
 */
    public interfazjf() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
 * Metodo Para conseguir icono de la aplicacion
 * @version 1.0, 20/06/2021
 * @author Arreola
 */
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logosi.png"));
        return retValue;   
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        bienv = new javax.swing.JLabel();
        jBr = new javax.swing.JButton();
        jBis = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 51, 51));
        salir.setText("Salir");
        salir.setBorderPainted(false);
        salir.setFocusable(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1318, 10, 90, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grande.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        bienv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bienv.png"))); // NOI18N
        getContentPane().add(bienv, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, -1, -1));

        jBr.setBackground(new java.awt.Color(0, 0, 0));
        jBr.setForeground(java.awt.Color.white);
        jBr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regist.png"))); // NOI18N
        jBr.setBorderPainted(false);
        jBr.setFocusable(false);
        jBr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrActionPerformed(evt);
            }
        });
        getContentPane().add(jBr, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 690, -1, 70));
        jBr.setOpaque(false);

        jBis.setBackground(new java.awt.Color(0, 0, 0));
        jBis.setForeground(java.awt.Color.white);
        jBis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/is.png"))); // NOI18N
        jBis.setBorderPainted(false);
        jBis.setFocusable(false);
        jBis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBisActionPerformed(evt);
            }
        });
        getContentPane().add(jBis, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 690, -1, 70));
        jBis.setOpaque(false);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo Salida de la ventana en uso
 * @author Arreola
 */
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
/**
 * Metodo Inicio de sesion
 * Instancia una ventana de interfazis para mostrarla
 * @author Arreola
 */
    private void jBisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBisActionPerformed
        // Iniciar sesión
        setVisible(false);
        interfazis ventana2 = new interfazis();
        ventana2.setVisible(true);
    }//GEN-LAST:event_jBisActionPerformed
/**
 * Metodo Registro
 * Instancia una ventana de interfazreg para mostrarla
 * @author Arreola
 */
    private void jBrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrActionPerformed
        // Registrarse
        setVisible(false);
        interfazreg ventana3 = new interfazreg();
        ventana3.setVisible(true);
    }//GEN-LAST:event_jBrActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienv;
    private javax.swing.JButton jBis;
    private javax.swing.JButton jBr;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel logo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
