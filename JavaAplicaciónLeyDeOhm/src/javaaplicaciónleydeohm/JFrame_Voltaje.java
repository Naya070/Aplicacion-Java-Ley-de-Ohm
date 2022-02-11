/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaplicaciónleydeohm;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JFrame_Voltaje extends javax.swing.JFrame {
    Voltaje OperarVolt = new Voltaje();
    /**
     * Creates new form JFrame_Voltaje
     */
    public JFrame_Voltaje() {
        initComponents();
        this.setLocationRelativeTo(null); //La ventana sale desde el centro
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        VAmp = new javax.swing.JTextField();
        CalcularVolt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        VRes = new javax.swing.JTextField();
        VPot = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VResultado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        VAmp.setBackground(new java.awt.Color(255, 153, 0));
        VAmp.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        VAmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VAmpKeyTyped(evt);
            }
        });
        getContentPane().add(VAmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 280, 30));

        CalcularVolt.setBackground(new java.awt.Color(0, 0, 51));
        CalcularVolt.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        CalcularVolt.setForeground(new java.awt.Color(255, 255, 0));
        CalcularVolt.setText("Calcular");
        CalcularVolt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularVoltActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularVolt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 90, 30));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Intensidad (A)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 130, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resistencia (Ω)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resultado (V)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        VRes.setBackground(new java.awt.Color(255, 153, 0));
        VRes.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        VRes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VResKeyTyped(evt);
            }
        });
        getContentPane().add(VRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 280, 30));

        VPot.setBackground(new java.awt.Color(255, 153, 0));
        VPot.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        VPot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VPotKeyTyped(evt);
            }
        });
        getContentPane().add(VPot, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 280, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Calculadora de Voltaje");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Potencia (W)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        VResultado.setBackground(new java.awt.Color(255, 102, 0));
        VResultado.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        VResultado.setOpaque(true);
        getContentPane().add(VResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 280, 30));
        VResultado.getAccessibleContext().setAccessibleDescription("");

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 90, 30));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("V= voltios, A= amperios, Ω= Ohmios, W= vatios.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaaplicaciónleydeohm/Imagenes/VoltajeFondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularVoltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularVoltActionPerformed
        // TODO add your handling code here:
        
        if ( VAmp.getText().length()>0 
        &&  VRes.getText().length() >0 
                && VPot.getText().length()==0 )
        {
          
        double Amp = Double.parseDouble(VAmp.getText());
        double Res = Double.parseDouble(VRes.getText());
        OperarVolt.CálculoVoltaje(Amp,Res);
         VPot.setText("-");
         VResultado.setText(Double.toString(OperarVolt.Volt));
        } else if (VAmp.getText().length()>0 
                &&  VPot.getText().length()>0 
                && VRes.getText().length()==0)
        {
        double Amp = Double.parseDouble(VAmp.getText());
        float Pot = (float) Double.parseDouble(VPot.getText());
        OperarVolt.CálculoVoltaje(Amp,Pot);
        VRes.setText("-");
        VResultado.setText(Double.toString(OperarVolt.Volt));
        } else if (VRes.getText().length()>0 
                &&  VPot.getText().length()>0 
                && VAmp.getText().length()==0)
        {
        float Pot = (float) Double.parseDouble(VPot.getText());
        double Res = Double.parseDouble(VRes.getText());
        OperarVolt.CálculoVoltaje(Pot,Res);
        VAmp.setText("-");
        VResultado.setText(Double.toString(OperarVolt.Volt));
        
        }
        else{JOptionPane.showMessageDialog(rootPane, "Error");}
              
                
        VResultado.setText(Double.toString(OperarVolt.Volt));
        
        
    }//GEN-LAST:event_CalcularVoltActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InterfazGráfica atrás = new InterfazGráfica();
        atrás.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFrame_Voltaje borrar = new JFrame_Voltaje();
        borrar.setVisible(true);
        VAmp.removeAll();
        VPot.removeAll();
        VRes.removeAll();
        VResultado.removeAll();
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void VAmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VAmpKeyTyped
        // TODO add your handling code here:
        char var = evt.getKeyChar();
        //condición que nos permite ingresar datos numéricos con su punto decimal
        if ((var<'0' || var >'9')&&  VAmp.getText().contains(".")
                && (var!=(char)KeyEvent.VK_BACK_SPACE)) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Sólo se admiten números");
        } else if ((var < '0' || var > '9') && (var!= '.') 
                && (var!=(char)KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
        JOptionPane.showMessageDialog(null, "Sólo se admiten números");
                
                }
       
        
    }//GEN-LAST:event_VAmpKeyTyped

    private void VResKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VResKeyTyped
        // TODO add your handling code here:
      char var = evt.getKeyChar();
        //condición que nos permite ingresar datos numéricos con su punto decimal
        if ((var<'0' || var >'9')&&  VRes.getText().contains(".")
                && (var!=(char)KeyEvent.VK_BACK_SPACE)) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Sólo se admiten números");
        } else if ((var < '0' || var > '9') && (var!= '.') 
                && (var!=(char)KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
        JOptionPane.showMessageDialog(null, "Sólo se admiten números");
        }
    }//GEN-LAST:event_VResKeyTyped

    private void VPotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VPotKeyTyped
        // TODO add your handling code here:
        char var = evt.getKeyChar();
        //condición que nos permite ingresar datos numéricos con su punto decimal
        if ((var<'0' || var >'9')&&  VPot.getText().contains(".")
                && (var!=(char)KeyEvent.VK_BACK_SPACE)) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Sólo se admiten números");
        } else if ((var < '0' || var > '9') && (var!= '.') 
                && (var!=(char)KeyEvent.VK_BACK_SPACE)) {
                evt.consume();
        JOptionPane.showMessageDialog(null, "Sólo se admiten números");
        }
    }//GEN-LAST:event_VPotKeyTyped
  
    
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
            java.util.logging.Logger.getLogger(JFrame_Voltaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Voltaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Voltaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Voltaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Voltaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularVolt;
    private javax.swing.JTextField VAmp;
    private javax.swing.JTextField VPot;
    private javax.swing.JTextField VRes;
    private javax.swing.JLabel VResultado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
