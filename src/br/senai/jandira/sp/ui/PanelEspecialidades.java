
package br.senai.jandira.sp.ui;

import br.senai.jandira.sp.dao.EspecialidadeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;




public class PanelEspecialidades extends javax.swing.JPanel {

  
    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidade();
        ajustarTabela();
         preencherTabela();
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollEspecialidades = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        buttonexcluir = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 350));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(391, 399, Short.MAX_VALUE)
                    .addComponent(buttonexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(buttonAdd)
                    .addGap(6, 6, 6)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 279, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonexcluirActionPerformed
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            excluirEspecialidade(linha);
        } else {
            JOptionPane.showMessageDialog(this, "Voce precisa selecionar uma linha para excluir!" ,
                    "Atenção", 
                    JOptionPane.WARNING_MESSAGE);
        }
    
       
    }//GEN-LAST:event_buttonexcluirActionPerformed

    private void excluirEspecialidade(int linha){
        
      String codigoStr = tabela.getValueAt(linha, 0).toString();
      Integer codigo = Integer.valueOf(codigoStr);
        
        EspecialidadeDAO.excluir(codigo);
        
        preencherTabela();
       
    }
    
    
    
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
           
        
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        EspecialidadeDialog d = new EspecialidadeDialog(null, true);
        d.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonexcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollEspecialidades;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
  
        tabela.setModel(EspecialidadeDAO.getTabelaEspecialidades());
        ajustarTabela();
    }
    private void ajustarTabela(){
        // impedir que o usuarioas colunas 
        tabela.getTableHeader().setReorderingAllowed(false);
        
        //bloquear a edçõa das celulas 
        tabela.setDefaultEditor(Object.class, null);
        
        //definir largura
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(300);
          tabela.getColumnModel().getColumn(2).setPreferredWidth(310);
           
    }

}
