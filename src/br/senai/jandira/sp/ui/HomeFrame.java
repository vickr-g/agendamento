package br.senai.jandira.sp.ui;

import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/jandira/sp/imagens/notepad.png")));
        initPanels();
       
    }
    //atributo da classe

    PanelEspecialidades panelEspecialidades;

//constantes
    private final int POS_X = 10;
    private final int POS_Y = 140;
    private final int LARGURA = 750;
    private final int ALTURA = 370;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelIcone = new javax.swing.JLabel();
        labelSistema = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonPlanodeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonEspecialidade = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonMedico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/notepad.png"))); // NOI18N

        labelSistema.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        labelSistema.setForeground(new java.awt.Color(255, 255, 255));
        labelSistema.setText("Sistema para Agendamento de Consultas");
        labelSistema.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 80);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/home (1).png"))); // NOI18N
        buttonHome.setText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 90, 90, 50);

        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/group.png"))); // NOI18N
        buttonPaciente.setText("Paciente");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(190, 90, 100, 50);

        buttonPlanodeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/desk.png"))); // NOI18N
        buttonPlanodeSaude.setText(" Plano de Saude");
        buttonPlanodeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanodeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanodeSaude);
        buttonPlanodeSaude.setBounds(390, 90, 140, 50);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/minus.png"))); // NOI18N
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(670, 90, 80, 50);

        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/notebook.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(290, 90, 100, 50);

        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/pin.png"))); // NOI18N
        buttonEspecialidade.setText("Especialidade");
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidade);
        buttonEspecialidade.setBounds(530, 90, 130, 50);

        panelHome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(153, 0, 51))); // NOI18N
        panelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("SISACON");
        panelHome.add(jLabel1);
        jLabel1.setBounds(30, 80, 160, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel2);
        jLabel2.setBounds(30, 120, 280, 20);

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        panelHome.add(jPanel2);
        jPanel2.setBounds(0, 143, 750, 3);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Dados para contato:");
        panelHome.add(jLabel3);
        jLabel3.setBounds(20, 160, 140, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("E-mail: suportein@sisacon.com");
        panelHome.add(jLabel4);
        jLabel4.setBounds(0, 180, 190, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telefone: (11) 2450-6300");
        panelHome.add(jLabel5);
        jLabel5.setBounds(10, 200, 140, 20);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 160, 750, 350);

        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/user.png"))); // NOI18N
        buttonMedico.setText("Médico");
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(100, 90, 90, 50);

        setSize(new java.awt.Dimension(787, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonPlanodeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanodeSaudeActionPerformed
        
    }//GEN-LAST:event_buttonPlanodeSaudeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
       
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
       
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed

        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);

    }//GEN-LAST:event_buttonEspecialidadeActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed

    }//GEN-LAST:event_buttonMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanodeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIcone;
    private javax.swing.JLabel labelSistema;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);

        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);

    }

}
