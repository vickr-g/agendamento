package br.senai.jandira.sp.ui;


import br.senai.jandira.sp.dao.PlanoDeSaudeDAO;
import br.senai.jandira.sp.model.OperacaoEnum;
import br.senai.jandira.sp.model.PlanoDeSaude;
import javax.swing.JOptionPane;


public class PanelPlano extends javax.swing.JPanel {

    private int linha;

    public PanelPlano() {

        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanoDeSaude();
        ajustarTabela();
        preencherTabela();
    }

    private int getLinha() {
        linha = tabelaP.getSelectedRow();
        return linha;
    }

    private void setLinha() {
        linha = tabelaP.getSelectedRow();
    }

    private Integer getCodigo() {
        String codigoStr = tabelaP.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaP = new javax.swing.JTable();
        buttonAdicionar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano de Saude", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        tabelaP.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaP);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus.png"))); // NOI18N
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/edit.png"))); // NOI18N
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/trash.png"))); // NOI18N
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2358, 2358, 2358))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PlanoDeSaudeDialog p = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        p.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if (getLinha() != -1) {
            editarPlano();
        } else {
            JOptionPane.showMessageDialog(this,
                    "por favor selecione a linha que voce deseja editar",
                    "Plano de saúde",
                    
                    JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_buttonEditarActionPerformed
private void editarPlano() {
        PlanoDeSaude plano = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());

        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, plano,
                OperacaoEnum.EDITAR);
        planoDeSaudeDialog.setVisible(true);

        preencherTabela();
    }
    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        linha = tabelaP.getSelectedRow();
        if (linha != -1) {
            excluirPlano();
        } else {
            JOptionPane.showMessageDialog(this, "Voce precisa selecionar uma linha para excluir!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void excluirPlano() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "voce realmente deseja excluir?",
                "ATENÇÃO",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (resposta == 0) {

            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela();

        }


    }//GEN-LAST:event_buttonExcluirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaP;
    // End of variables declaration//GEN-END:variables
private void preencherTabela() {

        tabelaP.setModel(PlanoDeSaudeDAO.getTabelaPlanosDeSaude());

        ajustarTabela();
    }

    private void ajustarTabela() {
        // impedir que o usuarioas colunas 
        tabelaP.getTableHeader().setReorderingAllowed(false);

        //bloquear a edçõa das celulas 
        tabelaP.setDefaultEditor(Object.class, null);

        //definir largura
//        tabelaP.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        tabelaP.getColumnModel().getColumn(0).setPreferredWidth(100);
//        tabelaP.getColumnModel().getColumn(1).setPreferredWidth(100);
//        tabelaP.getColumnModel().getColumn(2).setPreferredWidth(110);
//        tabelaP.getColumnModel().getColumn(3).setPreferredWidth(100);
//        tabelaP.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

}
