
package br.senai.jandira.sp.ui;

import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;


public class HomeFrame extends javax.swing.JFrame {

   
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/jandira/sp/imagens/notepad.png")));
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelIcone = new javax.swing.JLabel();
        labelSistema = new javax.swing.JLabel();
        buttonMedico = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonPlanodeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonEspecialidade = new javax.swing.JButton();
        listaDeEspecialidades = new javax.swing.JPanel();
        jScrollEspecialidades = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        buttonexcluir = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

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

        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/user.png"))); // NOI18N
        buttonMedico.setText("Médicos");
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(230, 90, 110, 50);

        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/group.png"))); // NOI18N
        buttonPaciente.setText("Pacientes");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(110, 90, 120, 50);

        buttonPlanodeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/desk.png"))); // NOI18N
        buttonPlanodeSaude.setText("Plano de Saúde");
        buttonPlanodeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanodeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanodeSaude);
        buttonPlanodeSaude.setBounds(340, 90, 150, 50);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/minus.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(640, 90, 80, 50);

        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/notebook.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(10, 90, 100, 50);

        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/pin.png"))); // NOI18N
        buttonEspecialidade.setText("Especialidades");
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidade);
        buttonEspecialidade.setBounds(490, 90, 140, 50);

        listaDeEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(153, 0, 51))); // NOI18N

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollEspecialidades.setViewportView(tabela);

        buttonexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/trash.png"))); // NOI18N
        buttonexcluir.setText("EXCLUIR");
        buttonexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonexcluirActionPerformed(evt);
            }
        });

        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/edit.png"))); // NOI18N
        buttonEdit.setText("EDITAR");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus.png"))); // NOI18N
        buttonAdd.setText("ADICIONAR");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listaDeEspecialidadesLayout = new javax.swing.GroupLayout(listaDeEspecialidades);
        listaDeEspecialidades.setLayout(listaDeEspecialidadesLayout);
        listaDeEspecialidadesLayout.setHorizontalGroup(
            listaDeEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaDeEspecialidadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listaDeEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaDeEspecialidadesLayout.createSequentialGroup()
                        .addComponent(jScrollEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(listaDeEspecialidadesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        listaDeEspecialidadesLayout.setVerticalGroup(
            listaDeEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaDeEspecialidadesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listaDeEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(listaDeEspecialidades);
        listaDeEspecialidades.setBounds(10, 150, 750, 370);

        setSize(new java.awt.Dimension(787, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonPlanodeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanodeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanodeSaudeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEspecialidadeActionPerformed

    private void buttonexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonexcluirActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanodeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonexcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollEspecialidades;
    private javax.swing.JLabel labelIcone;
    private javax.swing.JLabel labelSistema;
    private javax.swing.JPanel listaDeEspecialidades;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela(){
        String [][] dados = {
            {"100","jandira","sp"},
            {"200","itapevi","sp"},
            {"300","carapicuiba","sp"},
            {"400","sorocaba","sp"},
            {"500","pirapora","sp"},
            {"600","itaim","sp"},
        
        };
        String[] titulos = {"CODIGO","NOME DA CIDADE","ESTADO"};
        DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
        
        tabela.setModel(modelo);
        
        }
        
    }
    


