package view;

import controller.MenuPrincipalController;


public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;
    
    public MenuPrincipal() {
        initComponents();
        // importando o controller para o menu
        this.controller = new MenuPrincipalController(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimizar = new javax.swing.JLabel();
        excluir = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCC = new javax.swing.JButton();
        btnCS = new javax.swing.JButton();
        btnCU = new javax.swing.JButton();
        btnAGD = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/botao-excluir1.png"))); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 20, -1, 30));

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimize-o-sinal1.png"))); // NOI18N
        excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirMouseClicked(evt);
            }
        });
        getContentPane().add(excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 20, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sair.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1421, 46, 174, 64));

        btnCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        btnCC.setBorder(null);
        btnCC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCActionPerformed(evt);
            }
        });
        getContentPane().add(btnCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1378, 297, 37, 37));

        btnCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        btnCS.setBorder(null);
        btnCS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSActionPerformed(evt);
            }
        });
        getContentPane().add(btnCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1378, 497, 37, 37));

        btnCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        btnCU.setBorder(null);
        btnCU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCUActionPerformed(evt);
            }
        });
        getContentPane().add(btnCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 697, 37, 37));

        btnAGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        btnAGD.setBorder(null);
        btnAGD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGDActionPerformed(evt);
            }
        });
        getContentPane().add(btnAGD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 897, 37, 37));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/mainBackground.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked
        //minimize btn
        this.setExtendedState(MenuPrincipal.ICONIFIED);
    }//GEN-LAST:event_excluirMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        //exit btn
        System.exit(0);
    }//GEN-LAST:event_minimizarMouseClicked

    private void btnCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCCActionPerformed

    private void btnAGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGDActionPerformed
        //agenda btn
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_btnAGDActionPerformed

    private void btnCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCSActionPerformed

    private void btnCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCUActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //sair btn
        this.controller.sair();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAGD;
    private javax.swing.JButton btnCC;
    private javax.swing.JButton btnCS;
    private javax.swing.JButton btnCU;
    private javax.swing.JLabel excluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel minimizar;
    // End of variables declaration//GEN-END:variables
}
