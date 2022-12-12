package br.senai.jandira.sp.ui;

import br.senai.jandira.sp.dao.PlanoDeSaudeDAO;
import br.senai.jandira.sp.model.OperacaoEnum;
import br.senai.jandira.sp.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude plano;
    private OperacaoEnum operacao;

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        this.operacao = operacao;
        preencherTitulo();
        
    }

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        this.operacao = operacao;
        plano = p;
        preencherFormulario();
        preencherTitulo();

    }

    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void preencherFormulario() {
        jTextFieldCodigo.setText(plano.getCodigo().toString());
        jTextFieldOperadora.setText(plano.getOperadora());
        jTextFieldCategoria.setText(plano.getCategoria());
        jTextFieldNumero.setText(plano.getNumero());
        validadeField.setText(plano.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

    private void preencherTitulo() {
        jLabel2Add.setText("Planos de Saude  - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            jLabel2Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/edit.png")));

        } else {
            jLabel2Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus.png")));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigo = new javax.swing.JLabel();
        jPaneladd = new javax.swing.JPanel();
        jLabel2Add = new javax.swing.JLabel();
        jLabeloperadora = new javax.swing.JLabel();
        jLabelValidade = new javax.swing.JLabel();
        jLabelcategoria = new javax.swing.JLabel();
        jLabelnumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldCategoria = new javax.swing.JTextField();
        jTextFieldOperadora = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        validadeField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodigo.setText("Código");

        jPaneladd.setBackground(new java.awt.Color(153, 0, 0));

        jLabel2Add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2Add.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus (1).png"))); // NOI18N
        jLabel2Add.setText("Adicionar - PLANO DE SAUDE");

        javax.swing.GroupLayout jPaneladdLayout = new javax.swing.GroupLayout(jPaneladd);
        jPaneladd.setLayout(jPaneladdLayout);
        jPaneladdLayout.setHorizontalGroup(
            jPaneladdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneladdLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel2Add)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPaneladdLayout.setVerticalGroup(
            jPaneladdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneladdLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel2Add)
                .addGap(23, 23, 23))
        );

        jLabeloperadora.setText("Operadora");

        jLabelValidade.setText("Validade");

        jLabelcategoria.setText("Categoria");

        jLabelnumero.setText("Número");

        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        validadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeFieldActionPerformed(evt);
            }
        });
        try {
            validadeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaneladd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancel)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValidade)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelCodigo)
                        .addComponent(jLabeloperadora)
                        .addComponent(jLabelcategoria)
                        .addComponent(jLabelnumero)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldOperadora)
                        .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(validadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPaneladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabelCodigo)
                .addGap(11, 11, 11)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeloperadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelcategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelnumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelValidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancel))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        CharSequence s = " ";
        
        if (jTextFieldOperadora.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A operadora do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            jTextFieldOperadora.requestFocus();
        } else if (jTextFieldCategoria.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "A categoria do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            jTextFieldCategoria.requestFocus();
        } else if (jTextFieldNumero.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O número do plano é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            jTextFieldNumero.requestFocus();
        } else if (validadeField.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(null, "A validade do plano é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            validadeField.requestFocus();
        } else if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void validadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeFieldActionPerformed
    private void editar() {
        plano.setOperadora(jTextFieldOperadora.getText());
        plano.setCategoria(jTextFieldCategoria.getText());
        plano.setNumero(jTextFieldNumero.getText());
        plano.setValidade(LocalDate.parse(validadeField.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        PlanoDeSaudeDAO.atualizar(plano);
        JOptionPane.showMessageDialog(null, "Plano de Saude atualizada com sucesso!");
        dispose();

    }

    private void adicionar() {
        
            PlanoDeSaude novoPlano = new PlanoDeSaude();
            novoPlano.setOperadora(jTextFieldOperadora.getText());
            novoPlano.setCategoria(jTextFieldCategoria.getText());
            novoPlano.setNumero(jTextFieldNumero.getText());
            novoPlano.setValidade(LocalDate.parse(validadeField.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            PlanoDeSaudeDAO.gravar(novoPlano);
            JOptionPane.showMessageDialog(this, "Plano de Saude gravado com sucesso", "Plano de Saude", JOptionPane.INFORMATION_MESSAGE);

            dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel2Add;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelValidade;
    private javax.swing.JLabel jLabelcategoria;
    private javax.swing.JLabel jLabelnumero;
    private javax.swing.JLabel jLabeloperadora;
    private javax.swing.JPanel jPaneladd;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldOperadora;
    private javax.swing.JFormattedTextField validadeField;
    // End of variables declaration//GEN-END:variables
}
