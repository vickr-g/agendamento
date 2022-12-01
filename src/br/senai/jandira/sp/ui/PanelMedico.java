package br.senai.jandira.sp.ui;
import br.senai.jandira.sp.dao.MedicoDAO;
import br.senai.jandira.sp.model.Medico;
import br.senai.jandira.sp.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class PanelMedico extends javax.swing.JPanel {
private int linha;

    public PanelMedico() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        ajustarTabela();
        preencherTabela();
    }
    private int getLinha() {
        linha = tabelaM.getSelectedRow();
        return linha;
    }



    private Integer getCodigo() {
        String codigoStr = tabelaM.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;

    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollEspecialidades = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        buttonAdicionar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaM = new javax.swing.JTable();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

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

        tabelaM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 403, Short.MAX_VALUE)
                .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2358, 2358, 2358))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        MedicooDialog m =
                new MedicooDialog (
                        null, 
                        true, 
                        OperacaoEnum.ADICIONAR);

        m.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
         if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Por Favor, selecione o médico que você deseja editar.",
                "Médicos",
                JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        linha = tabelaM.getSelectedRow();
        if (linha != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(this, "Voce precisa selecionar uma linha para excluir!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    
    }//GEN-LAST:event_buttonExcluirActionPerformed
 private void editarMedico() {
        
        Medico medico = MedicoDAO.getMedico(getCodigo());
        
        MedicooDialog medicoDialog =
                new MedicooDialog(
                        null, 
                        true, 
                        medico, 
                        OperacaoEnum.EDITAR);

        medicoDialog.setVisible(true);
        preencherTabela();
    }
   private void excluirMedico() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "voce realmente deseja excluir?",
                "ATENÇÃO",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (resposta == 0) {

            MedicoDAO.excluir(getCodigo());
            preencherTabela();

        }
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollEspecialidades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelaM;
    // End of variables declaration//GEN-END:variables
private void preencherTabela() {

       
tabelaM.setModel(MedicoDAO.getTabelaMedico());
        ajustarTabela();
    }

    private void ajustarTabela() {
        // impedir que o usuarioas colunas 
        tabelaM.getTableHeader().setReorderingAllowed(false);

        //bloquear a edçõa das celulas 
        tabelaM.setDefaultEditor(Object.class, null);
}
}