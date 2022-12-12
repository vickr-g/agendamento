package br.senai.jandira.sp.ui;

import br.senai.jandira.sp.dao.EspecialidadeDAO;
import br.senai.jandira.sp.dao.MedicoDAO;
import br.senai.jandira.sp.model.Especialidade;
import br.senai.jandira.sp.model.Medico;
import br.senai.jandira.sp.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MedicooDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicooDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        adicionandoNaList();
    }

    public MedicooDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        medico = m;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
        adicionandoNaList();

    }

    // private void preencherListaDeEspecialidades() {
    // ListEspecialidade.setModel(EspecialidadeDAO.getListaDeEspecialidades());
    //}
    private void preencherFormulario() {
        FieldCodigo.setText(medico.getCodigo().toString());
        FieldCrm.setText(medico.getCrm());
        FieldEmail.setText(medico.getEmail());
        FieldTelefone.setText(medico.getTelefone());
        FieldNomeMedico.setText(medico.getNome());
        FieldDataNasc.setText(medico.getDataDeNacsimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

    private void preencherTitulo() {
        jLabelB.setText("Médicos  - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            jLabelB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/edit.png")));

        } else {
            jLabelB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus.png")));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelA = new javax.swing.JPanel();
        jLabelB = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        FieldCodigo = new javax.swing.JTextField();
        FieldTelefone = new javax.swing.JTextField();
        FieldCrm = new javax.swing.JTextField();
        FieldNomeMedico = new javax.swing.JTextField();
        FieldEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonDireito = new javax.swing.JButton();
        jButtonEsquerdo = new javax.swing.JButton();
        FieldDataNasc = new javax.swing.JFormattedTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListEspecialidadeMedico = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<>();
        CancelButton = new javax.swing.JButton();
        SalveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelA.setBackground(new java.awt.Color(153, 0, 0));

        jLabelB.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelB.setForeground(new java.awt.Color(255, 255, 255));
        jLabelB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/jandira/sp/imagens/plus (1).png"))); // NOI18N
        jLabelB.setText("Médico - ADICIONAR");

        javax.swing.GroupLayout jPanelALayout = new javax.swing.GroupLayout(jPanelA);
        jPanelA.setLayout(jPanelALayout);
        jPanelALayout.setHorizontalGroup(
            jPanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelB)
                .addGap(166, 166, 166))
        );
        jPanelALayout.setVerticalGroup(
            jPanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelALayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        FieldCodigo.setEditable(false);
        FieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCodigoActionPerformed(evt);
            }
        });

        FieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTelefoneActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel3.setText("Nome do(a) médico(a)");

        jLabel4.setText("Data Nascimento:");

        jLabel5.setText("CRM:");

        jLabel6.setText("E-mail:");

        jLabel7.setText("Telefone:");

        jLabel8.setText("Especialidade do médico:");

        jLabel9.setText("Lista de Especialidade:");

        jButtonDireito.setBackground(new java.awt.Color(51, 153, 0));
        jButtonDireito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDireito.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDireito.setText(">");
        jButtonDireito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDireitoActionPerformed(evt);
            }
        });

        jButtonEsquerdo.setBackground(new java.awt.Color(255, 0, 0));
        jButtonEsquerdo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonEsquerdo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEsquerdo.setText("<");
        jButtonEsquerdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEsquerdoActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jListEspecialidadeMedico);

        jScrollPane3.setViewportView(jListEspecialidades);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(FieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(FieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDireito, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                    .addComponent(jButtonEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel7))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(FieldNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButtonDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        try {
            FieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CancelButton.setBackground(new java.awt.Color(255, 0, 0));
        CancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        SalveButton.setBackground(new java.awt.Color(0, 153, 51));
        SalveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SalveButton.setForeground(new java.awt.Color(255, 255, 255));
        SalveButton.setText("Salvar");
        SalveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SalveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCodigoActionPerformed

    private void FieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTelefoneActionPerformed

    private void SalveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalveButtonActionPerformed
        CharSequence s = " ";

        if (FieldCrm.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O CRM do Medico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            FieldCrm.requestFocus();
        } else if (FieldNomeMedico.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O nome do medico é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            FieldNomeMedico.requestFocus();
        } else if (FieldTelefone.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O número de telefone é obrigatório!", "Erro", JOptionPane.WARNING_MESSAGE);
            FieldTelefone.requestFocus();
        } else if (FieldEmail.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "O e-mail é obrigatorio!", "Erro", JOptionPane.WARNING_MESSAGE);
            FieldEmail.requestFocus();
        } else if (FieldDataNasc.getText().contains(s) == true) {
            JOptionPane.showMessageDialog(null, "A data de nascimento é obrigatória!", "Erro", JOptionPane.WARNING_MESSAGE);
            FieldDataNasc.requestFocus();
        } else if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }

    }//GEN-LAST:event_SalveButtonActionPerformed

    private void jButtonDireitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDireitoActionPerformed
        if (jListEspecialidadeMedico.isSelectionEmpty() == true) {
            ArrayList<String> novaLista = new ArrayList<>();
            int tamanho = jListEspecialidadeMedico.getModel().getSize();
            for (int i = 0; i < tamanho; i++) {
                novaLista.add(jListEspecialidadeMedico.getModel().getElementAt(i));
            }

            if (novaLista.contains(jListEspecialidades.getSelectedValue()) == false) {
                novaLista.add(jListEspecialidades.getSelectedValue());

                DefaultListModel<String> listaEspecilidadeMedicoModel = new DefaultListModel<>();

                for (String acaoDoBotaoAvancar : novaLista) {
                    listaEspecilidadeMedicoModel.addElement(acaoDoBotaoAvancar);
                }
               jListEspecialidadeMedico.setModel(listaEspecilidadeMedicoModel);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Você não pode adicionar uma especialidade já cadastrada!",
                        "Médico",
                        JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Selecione uma especialidade",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButtonDireitoActionPerformed

    private void jButtonEsquerdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEsquerdoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente deletar?",
                "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (resposta == 0) {
            if (jListEspecialidadeMedico.isSelectionEmpty() == false) {
                ArrayList<String> novaListaMedicos = new ArrayList<>();
                int tamanho = jListEspecialidadeMedico.getModel().getSize();
                for (int i = 0; i < tamanho; i++) {
                    novaListaMedicos.add(jListEspecialidadeMedico.getModel().getElementAt(i));
                }
                novaListaMedicos.remove(jListEspecialidadeMedico.getSelectedValue());

                DefaultListModel<String> listaEspecialidadeMedicoModel = new DefaultListModel<>();
                for (String acaoVoltar : novaListaMedicos) {
                    listaEspecialidadeMedicoModel.addElement(acaoVoltar);
                }
                jListEspecialidadeMedico.setModel(listaEspecialidadeMedicoModel);

            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Não contém nenhuma especialidade na lista",
                        "Editando Médico",
                        JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButtonEsquerdoActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void editar() {
        medico.setCrm(FieldCrm.getText());
        medico.setNome(FieldNomeMedico.getText());
        medico.setTelefone(FieldTelefone.getText());
        medico.setEmail(FieldEmail.getText());
        medico.setDataDeNacsimento(LocalDate.parse(FieldDataNasc.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        MedicoDAO.atualizar(medico);

        JOptionPane.showMessageDialog(
                null,
                "Médico atualizado com sucesso!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void adicionar() {
        // Criar um objeto especialidade
        Medico novoMedico = new Medico();
        novoMedico.setCrm(
                FieldCrm.getText());
        novoMedico.setNome(FieldNomeMedico.getText());
        novoMedico.setTelefone(FieldTelefone.getText());
        novoMedico.setEmail(FieldEmail.getText());
        novoMedico.setDataDeNacsimento(LocalDate.parse(FieldDataNasc.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Gravar o objeto, através do Dao.
        MedicoDAO.gravar(novoMedico);

        JOptionPane.showMessageDialog(
                this,
                "Médico gravado com sucesso!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField FieldCodigo;
    private javax.swing.JTextField FieldCrm;
    private javax.swing.JFormattedTextField FieldDataNasc;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldNomeMedico;
    private javax.swing.JTextField FieldTelefone;
    private javax.swing.JButton SalveButton;
    private javax.swing.JButton jButtonDireito;
    private javax.swing.JButton jButtonEsquerdo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JList<String> jListEspecialidadeMedico;
    private javax.swing.JList<String> jListEspecialidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelA;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    private void adicionandoNaList() {
        //ListListaEspecialidades.setModel(EspecialidadeDAO.getListaEspecialidade());
        jListEspecialidades.setModel(EspecialidadeDAO.getListaEspecialidade());
    }
}
