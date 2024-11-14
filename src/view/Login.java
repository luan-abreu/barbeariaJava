package view;

import Model.DAO.Banco;
import controller.LoginController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;  
    
    public Login() {
        initComponents();
        controller = new LoginController(this);
        try {
            Banco.inicia();
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimizeBtn = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        TextSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimize-o-sinal.png"))); // NOI18N
        minimizeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/botao-excluir.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        TextUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TextUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 7, 1, 1, new java.awt.Color(255, 255, 255)));
        TextUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextUsuario.setMargin(new java.awt.Insets(0, 7, 0, 7));
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 199, 40));

        TextSenha.setBackground(new java.awt.Color(255, 255, 255));
        TextSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 7, 1, 1, new java.awt.Color(255, 255, 255)));
        TextSenha.setPreferredSize(new java.awt.Dimension(1, 16));
        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 326, 199, 40));

        jButtonEntrar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/entrarButton.jpg"))); // NOI18N
        jButtonEntrar.setBorder(null);
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.setOpaque(true);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 394, 69, 26));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/background 2.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        // Botao entrar 
        this.controller.entrarSistema();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        //exit btn
        this.controller.exit();
    }//GEN-LAST:event_exitBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        //minimize btn
        this.controller.minimize();
    }//GEN-LAST:event_minimizeBtnMouseClicked
     
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel minimizeBtn;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getTextSenha() {
        return TextSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.TextSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.TextUsuario = TextUsuario;
    }
    
    
    
}
