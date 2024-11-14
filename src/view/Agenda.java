package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    public Agenda() {
        initComponents();    
        TableDesign();
        // importando o controller para o menu
        this.controller = new AgendaController(this);
        iniciar();  
    }
    
    private void TableDesign(){
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 17));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(75, 174, 255));  
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255)); 
        jTable1.setIntercellSpacing(new Dimension(0, 1));
        jTable1.setRowHeight(63);  
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBtn = new javax.swing.JButton();
        sairBtn = new javax.swing.JButton();
        excluir = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        servicoBox = new javax.swing.JComboBox<>();
        ClienteBox = new javax.swing.JComboBox<>();
        valorField = new javax.swing.JTextField();
        dataField = new javax.swing.JTextField();
        horaField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacaoField = new javax.swing.JTextArea();
        agendarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        agendaBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/barbeariaBtn.jpg"))); // NOI18N
        menuBtn.setBorder(null);
        menuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBtn.setOpaque(true);
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });
        getContentPane().add(menuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 46, 271, 64));

        sairBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sair.jpg"))); // NOI18N
        sairBtn.setBorder(null);
        sairBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sairBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1421, 46, 174, 64));

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minimize-o-sinal1.png"))); // NOI18N
        excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirMouseClicked(evt);
            }
        });
        getContentPane().add(excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 20, -1, -1));

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/botao-excluir1.png"))); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1870, 20, -1, 30));

        idField.setBackground(new java.awt.Color(255, 255, 255));
        idField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        idField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(255, 255, 255)));
        idField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idField.setMargin(new java.awt.Insets(0, 9, 0, 9));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 340, 449, 63));

        servicoBox.setBackground(new java.awt.Color(255, 255, 255));
        servicoBox.setEditable(true);
        servicoBox.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        servicoBox.setBorder(null);
        servicoBox.setOpaque(true);
        servicoBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                servicoBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(servicoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 581, 449, 63));

        ClienteBox.setBackground(new java.awt.Color(255, 255, 255));
        ClienteBox.setEditable(true);
        ClienteBox.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        ClienteBox.setBorder(null);
        getContentPane().add(ClienteBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 460, 449, 63));

        valorField.setBackground(new java.awt.Color(255, 255, 255));
        valorField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        valorField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(255, 255, 255)));
        valorField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        valorField.setMargin(new java.awt.Insets(0, 9, 0, 9));
        valorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorFieldActionPerformed(evt);
            }
        });
        getContentPane().add(valorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 338, 449, 63));

        dataField.setBackground(new java.awt.Color(255, 255, 255));
        dataField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        dataField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(255, 255, 255)));
        dataField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dataField.setMargin(new java.awt.Insets(0, 9, 0, 9));
        dataField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dataField, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 460, 449, 63));

        horaField.setBackground(new java.awt.Color(255, 255, 255));
        horaField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        horaField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(255, 255, 255)));
        horaField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        horaField.setMargin(new java.awt.Insets(0, 9, 0, 9));
        horaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(horaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 581, 449, 63));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setWheelScrollingEnabled(false);

        observacaoField.setBackground(new java.awt.Color(255, 255, 255));
        observacaoField.setColumns(20);
        observacaoField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        observacaoField.setLineWrap(true);
        observacaoField.setRows(5);
        observacaoField.setWrapStyleWord(true);
        observacaoField.setAutoscrolls(false);
        observacaoField.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 15, 15, 15, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(observacaoField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1348, 339, 449, 184));

        agendarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Agendar.jpg"))); // NOI18N
        agendarBtn.setBorder(null);
        agendarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agendarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(agendarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1641, 591, 156, 43));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação "
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setOpaque(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(255, 144, 144));
        jTable1.setShowHorizontalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 714, 1674, 303));

        agendaBackground.setBackground(new java.awt.Color(255, 255, 255));
        agendaBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/agendaBackground.jpg"))); // NOI18N
        agendaBackground.setAutoscrolls(true);
        agendaBackground.setOpaque(true);
        getContentPane().add(agendaBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        //exit btn
        System.exit(0);
    }//GEN-LAST:event_minimizarMouseClicked

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked
        //minimize btn
        this.setExtendedState(MenuPrincipal.ICONIFIED);
    }//GEN-LAST:event_excluirMouseClicked

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        // botao de sair 
        // abre a tela de login
        Login log = new Login();
        log.show();
        // fecha o jframe atual
        dispose();
    }//GEN-LAST:event_sairBtnActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        this.controller.atualizaId();
    }//GEN-LAST:event_idFieldActionPerformed

    private void valorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorFieldActionPerformed

    private void horaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaFieldActionPerformed

    private void dataFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFieldActionPerformed

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnActionPerformed
        //menu btn
        this.controller.navegarParaMenu();
    }//GEN-LAST:event_menuBtnActionPerformed

    private void servicoBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_servicoBoxItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_servicoBoxItemStateChanged

    private void agendarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarBtnActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_agendarBtnActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Agenda().setVisible(true);
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ClienteBox;
    private javax.swing.JLabel agendaBackground;
    private javax.swing.JButton agendarBtn;
    private javax.swing.JTextField dataField;
    private javax.swing.JLabel excluir;
    private javax.swing.JTextField horaField;
    private javax.swing.JTextField idField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton menuBtn;
    private javax.swing.JLabel minimizar;
    private javax.swing.JTextArea observacaoField;
    private javax.swing.JButton sairBtn;
    private javax.swing.JComboBox<String> servicoBox;
    private javax.swing.JTextField valorField;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
        this.controller.atualizaValor();
        this.controller.atualizaId();
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JComboBox<String> getjClienteBox() {
        return ClienteBox;
    }

    public void setjClienteBox(JComboBox<String> jClienteBox) {
        this.ClienteBox = jClienteBox;
    }

    public JComboBox<String> getjServicoBox() {
        return servicoBox;
    }

    public void setjServicoBox(JComboBox<String> jServicoBox) {
        this.servicoBox = jServicoBox;
    }

    public JTextField getValorField() {
        return valorField;
    }

    public void setValorField(JTextField valorField) {
        this.valorField = valorField;
    }

    public JTextField getDataField() {
        return dataField;
    }

    public void setDataField(JTextField dataField) {
        this.dataField = dataField;
    }

    public JTextField getHoraField() {
        return horaField;
    }

    public void setHoraField(JTextField horaField) {
        this.horaField = horaField;
    }

    public JTextField getIdField() {
        return idField;
    }

    public void setIdField(JTextField idField) {
        this.idField = idField;
    }

    public JTextArea getObservacaoField() {
        return observacaoField;
    }

    public void setObservacaoField(JTextArea observacaoField) {
        this.observacaoField = observacaoField;
    }
    
        

    
    
    
    
    
}
