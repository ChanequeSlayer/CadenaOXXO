package cadena;
/**
 * Clase interfazreg
 * Clase: Ventana Secundaria de registro
 * Clase de Tipo JFrame, por esa razon hereda de Swing
 * Dos botones, uno para iniciar el sistema y otro para cancelar o salir.
 * @version 1.0, 20/06/2021
 * @author Jorge, Ray
 */
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class interfazreg extends javax.swing.JFrame {

    //Declaramos el objeto name haciendo un wrap a la variable del mismo nombre por asi decirlo.
        String name = new String();
        //Declaramos el objeto pass haciendo un wrap a la variable del mismo nombre por asi decirlo.
        String pass = new String();
        //Declaramos el objeto id haciendo un wrap a la variable del mismo nombre por asi decirlo.
        String id = new String();
     /**
 * Metodo Constructor, inicializa componentes de JFrame.
 * @version 1.0, 20/06/2021
 * @author Jorge, Ray
 */
    public interfazreg() {
        initComponents();
        salir.setFocusable(true);
        this.setLocationRelativeTo(null);
    }
        /**
 * Metodo Para conseguir icono de la aplicacion
 * @version 1.0, 20/06/2021
 * @author Arreola
 */
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logosi.png"));
        return retValue;
    }
    /**
 * Metodo Registro que usaremos abajo
 * Es para instanciar un objeto de la clase Trabajadores
 * @author Arreola
 */
    public void registro() {
            name = nameJTF.getText();
            id = userJTF.getText();
            pass = passJPF.getText();
            pass = passJPF2.getText();
            
            //Instancia un nuevo objeto de la clase Trabajadores
            Trabajadores nuevo = new Trabajadores(name.toUpperCase(), pass, id);
            nuevo.puesto(id, pass);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        bienv = new javax.swing.JLabel();
        nameJTF = new javax.swing.JTextField();
        cuadroTxt1 = new javax.swing.JLabel();
        userJTF = new javax.swing.JTextField();
        cuadroTxt3 = new javax.swing.JLabel();
        passJPF = new javax.swing.JPasswordField();
        cuadroTxt = new javax.swing.JLabel();
        passJPF2 = new javax.swing.JPasswordField();
        cuadroTxt2 = new javax.swing.JLabel();
        jBr = new javax.swing.JButton();
        jBis = new javax.swing.JButton();
        botonesL = new javax.swing.JLabel();
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
        salir.setFocusable(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 90, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chikito.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        bienv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regist.png"))); // NOI18N
        getContentPane().add(bienv, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 310, 300, -1));

        nameJTF.setFont(new java.awt.Font("Montserrat", 1, 15)); // NOI18N
        nameJTF.setForeground(new java.awt.Color(255, 204, 0));
        nameJTF.setBorder(null);
        nameJTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameJTF.setSelectionColor(new java.awt.Color(255, 51, 51));
        nameJTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameJTFMouseClicked(evt);
            }
        });
        getContentPane().add(nameJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 280, 50));
        nameJTF.setOpaque(false);
        nameJTF.getAccessibleContext().setAccessibleName("");

        cuadroTxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        getContentPane().add(cuadroTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        userJTF.setFont(new java.awt.Font("Montserrat", 1, 15)); // NOI18N
        userJTF.setForeground(new java.awt.Color(255, 204, 0));
        userJTF.setBorder(null);
        userJTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userJTF.setSelectionColor(new java.awt.Color(255, 51, 51));
        userJTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userJTFMouseClicked(evt);
            }
        });
        getContentPane().add(userJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 280, 50));
        userJTF.setOpaque(false);

        cuadroTxt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        getContentPane().add(cuadroTxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        passJPF.setForeground(new java.awt.Color(255, 204, 0));
        passJPF.setBorder(null);
        passJPF.setSelectionColor(new java.awt.Color(255, 51, 51));
        getContentPane().add(passJPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 280, 50));
        passJPF.setOpaque(false);

        cuadroTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        getContentPane().add(cuadroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        passJPF2.setForeground(new java.awt.Color(255, 204, 0));
        passJPF2.setBorder(null);
        passJPF2.setSelectionColor(new java.awt.Color(255, 51, 51));
        getContentPane().add(passJPF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 280, 50));
        passJPF2.setOpaque(false);

        cuadroTxt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        getContentPane().add(cuadroTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        jBr.setBackground(new java.awt.Color(0, 0, 0));
        jBr.setForeground(java.awt.Color.white);
        jBr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cansh.png"))); // NOI18N
        jBr.setBorderPainted(false);
        jBr.setFocusable(false);
        jBr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBr.setMaximumSize(new java.awt.Dimension(108, 41));
        jBr.setMinimumSize(new java.awt.Dimension(108, 41));
        jBr.setPreferredSize(new java.awt.Dimension(108, 41));
        jBr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrActionPerformed(evt);
            }
        });
        getContentPane().add(jBr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 140, 50));
        jBr.setOpaque(false);

        jBis.setBackground(new java.awt.Color(0, 0, 0));
        jBis.setForeground(java.awt.Color.white);
        jBis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/isch.png"))); // NOI18N
        jBis.setBorderPainted(false);
        jBis.setFocusable(false);
        jBis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBisActionPerformed(evt);
            }
        });
        getContentPane().add(jBis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 140, 50));
        jBis.setOpaque(false);

        botonesL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botones.png"))); // NOI18N
        getContentPane().add(botonesL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 0, 940, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
/**
 * Metodo Que registra
 * Realiza el registro e inicializa el programa.
 * @author Arreola
 */
    private void jBisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBisActionPerformed
        // registro
        setVisible(false);
        registro();
        JOptionPane.showMessageDialog(null, "Iniciado con exito");
        Gerente vip = new Gerente(id, pass);
                    vip.showUser(id, pass);
            try {
                vip.Cobrar();
            } catch (Errores ex) {
                Logger.getLogger(interfazreg.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jBisActionPerformed

    private void jBrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrActionPerformed

    }//GEN-LAST:event_jBrActionPerformed

    private void nameJTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameJTFMouseClicked
        
    }//GEN-LAST:event_nameJTFMouseClicked

    private void userJTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userJTFMouseClicked
        
    }//GEN-LAST:event_userJTFMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienv;
    private javax.swing.JLabel botonesL;
    private javax.swing.JLabel cuadroTxt;
    private javax.swing.JLabel cuadroTxt1;
    private javax.swing.JLabel cuadroTxt2;
    private javax.swing.JLabel cuadroTxt3;
    private javax.swing.JButton jBis;
    private javax.swing.JButton jBr;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nameJTF;
    private javax.swing.JPasswordField passJPF;
    private javax.swing.JPasswordField passJPF2;
    private javax.swing.JButton salir;
    private javax.swing.JTextField userJTF;
    // End of variables declaration//GEN-END:variables
}
