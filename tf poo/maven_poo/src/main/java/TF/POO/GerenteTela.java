package TF.POO;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GerenteTela extends javax.swing.JFrame {

    private Gerente g;
    private ArrayList<Tarefa> tarefas;

    public GerenteTela(Gerente gerente, ArrayList<Tarefa> tar) {
        this.g = gerente;
        this.tarefas = tar;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gerente = new javax.swing.JPanel();
        jLabelBemVindo = new javax.swing.JLabel();
        fotoGerente = new javax.swing.JPanel();
        cadastraFuncionario = new javax.swing.JButton();
        cadastraTarefa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelOque = new javax.swing.JLabel();
        jLabelLista = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pagamento = new javax.swing.JButton();
        demite = new javax.swing.JButton();
        sairGerente = new javax.swing.JButton();
        listaFuncionarios = new javax.swing.JComboBox<Funcionario>();
        consultaFuncionario = new javax.swing.JButton();
        consultaTodosFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        gerente.setPreferredSize(new java.awt.Dimension(392, 320));

        jLabelBemVindo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBemVindo.setText("Bem-Vindo @gerente");

        fotoGerente.setBackground(new java.awt.Color(0, 0, 0));
        fotoGerente.setMaximumSize(new java.awt.Dimension(99, 132));
        fotoGerente.setMinimumSize(new java.awt.Dimension(99, 132));

        javax.swing.GroupLayout fotoGerenteLayout = new javax.swing.GroupLayout(fotoGerente);
        fotoGerente.setLayout(fotoGerenteLayout);
        fotoGerenteLayout.setHorizontalGroup(
            fotoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        fotoGerenteLayout.setVerticalGroup(
            fotoGerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        cadastraFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastraFuncionario.setText("Cadastra Funcionário");
        cadastraFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraFuncionarioActionPerformed(evt);
            }
        });

        cadastraTarefa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastraTarefa.setText("Cadastra Tarefa");
        cadastraTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraTarefaActionPerformed(evt);
            }
        });

        jLabelOque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelOque.setText("O que fazer:");

        jLabelLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelLista.setText("Lista de Funcionários");

        pagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pagamento.setText("Fechar pagamento do funcionário");
        pagamento.setActionCommand("Fechar pagamento");
        pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoActionPerformed(evt);
            }
        });

        demite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        demite.setText("demitir funcionário");
        demite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demiteActionPerformed(evt);
            }
        });

        sairGerente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sairGerente.setText("Sair");
        sairGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairGerenteActionPerformed(evt);
            }
        });

        listaFuncionarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaFuncionarios.setMaximumRowCount(10);

        consultaFuncionario.setText("Consultar");
        consultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaFuncionarioActionPerformed(evt);
            }
        });

        consultaTodosFuncionarios.setText("Consultar Todos");
        consultaTodosFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaTodosFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gerenteLayout = new javax.swing.GroupLayout(gerente);
        gerente.setLayout(gerenteLayout);
        gerenteLayout.setHorizontalGroup(
            gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastraFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastraTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fotoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gerenteLayout.createSequentialGroup()
                        .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gerenteLayout.createSequentialGroup()
                                .addComponent(listaFuncionarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16))
                            .addGroup(gerenteLayout.createSequentialGroup()
                                .addComponent(jLabelLista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOque, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gerenteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(demite, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sairGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gerenteLayout.createSequentialGroup()
                                .addComponent(consultaFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultaTodosFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        gerenteLayout.setVerticalGroup(
            gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBemVindo)
                .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gerenteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fotoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gerenteLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cadastraFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastraTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelOque)
                        .addComponent(jLabelLista))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaFuncionario)
                    .addComponent(consultaTodosFuncionarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(demite, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sairGerente)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gerente, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gerente, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraFuncionarioActionPerformed
        javax.swing.JTextField cpf = new javax.swing.JTextField(7);
        javax.swing.JTextField nome = new javax.swing.JTextField(10);
        javax.swing.JTextField idade = new javax.swing.JTextField(3);
        javax.swing.JTextField salario = new javax.swing.JTextField(5);
        javax.swing.JTextField nivel = new javax.swing.JTextField(3);

        JPanel myPanel = new JPanel();
        myPanel.setSize(10, 80);
        myPanel.add(new javax.swing.JLabel("CPF"));
        myPanel.add(cpf);
        myPanel.add(new javax.swing.JLabel("Nome"));
        myPanel.add(nome);
        myPanel.add(new javax.swing.JLabel("Idade"));
        myPanel.add(idade);
        myPanel.add(new javax.swing.JLabel("Salário"));
        myPanel.add(salario);
        myPanel.add(new javax.swing.JLabel("Nível"));
        myPanel.add(nivel);

        int result = JOptionPane.showConfirmDialog(null, myPanel, "Cadastro de Funcionário", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Funcionario f = new Funcionario(cpf.getText(), nome.getText(), Integer.parseInt(idade.getText()), Double.parseDouble(salario.getText()), Integer.parseInt(nivel.getText()), g.getAreaSupervisao());
            g.cadastraFuncionario(f);
        }
        listaFuncionarios.removeAllItems();
        for (Funcionario funcionario : g.getArrayList()) {
            listaFuncionarios.addItem(funcionario);
        }
    }//GEN-LAST:event_cadastraFuncionarioActionPerformed

    private void cadastraTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraTarefaActionPerformed
        javax.swing.JTextField id = new javax.swing.JTextField(3);
        javax.swing.JTextField nivel = new javax.swing.JTextField(3);
        javax.swing.JTextField horas = new javax.swing.JTextField(3);
        javax.swing.JTextField nome = new javax.swing.JTextField(10);
        javax.swing.JTextField instrucoes = new javax.swing.JTextField(20);

        JPanel myPanel = new JPanel();
        myPanel.setSize(10, 80);
        myPanel.add(new javax.swing.JLabel("Id"));
        myPanel.add(id);
        myPanel.add(new javax.swing.JLabel("Nível"));
        myPanel.add(nivel);
        myPanel.add(new javax.swing.JLabel("Horas Necessárias"));
        myPanel.add(horas);
        myPanel.add(new javax.swing.JLabel("Nome da Tarefa"));
        myPanel.add(nome);
        myPanel.add(new javax.swing.JLabel("Instruções"));
        myPanel.add(instrucoes);

        int result = JOptionPane.showConfirmDialog(null, myPanel, "Cadastro de Tarefa", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Tarefa t = new Tarefa(Integer.parseInt(id.getText()), Integer.parseInt(nivel.getText()), Integer.parseInt(horas.getText()), nome.getText(), instrucoes.getText());
            tarefas.add(t);
        }
    }//GEN-LAST:event_cadastraTarefaActionPerformed

    private void pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoActionPerformed
        double v = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da hora extra?"));
        g.getArrayList().get(listaFuncionarios.getSelectedIndex()).calculaSalario(v);
    }//GEN-LAST:event_pagamentoActionPerformed

    private void demiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demiteActionPerformed
        g.getArrayList().remove(listaFuncionarios.getSelectedItem());
        listaFuncionarios.removeAllItems();
        for (Funcionario funcionario : g.getArrayList()) {
            listaFuncionarios.addItem(funcionario);
        }
    }//GEN-LAST:event_demiteActionPerformed

    private void sairGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairGerenteActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairGerenteActionPerformed

    private void consultaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaFuncionarioActionPerformed
        if(listaFuncionarios.getSelectedItem() != null){
            Funcionario f = (Funcionario)listaFuncionarios.getSelectedItem();
            JOptionPane.showMessageDialog(null, f.toStringConsulta());
        }
    }//GEN-LAST:event_consultaFuncionarioActionPerformed

    private void consultaTodosFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaTodosFuncionariosActionPerformed
        for (Funcionario funcionario : g.getArrayList()) {
            JOptionPane.showMessageDialog(null, funcionario.toStringConsulta());
        }
    }//GEN-LAST:event_consultaTodosFuncionariosActionPerformed

    public void iniciaCampos() {
        jLabelBemVindo.setText("Bem-Vindo " + g.getNome());
        listaFuncionarios.removeAllItems();
        for (Funcionario funcionario : g.getArrayList()) {
            listaFuncionarios.addItem(funcionario);
        }
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastraFuncionario;
    private javax.swing.JButton cadastraTarefa;
    private javax.swing.JButton consultaFuncionario;
    private javax.swing.JButton consultaTodosFuncionarios;
    private javax.swing.JButton demite;
    private javax.swing.JPanel fotoGerente;
    private javax.swing.JPanel gerente;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JLabel jLabelLista;
    private javax.swing.JLabel jLabelOque;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<Funcionario> listaFuncionarios;
    private javax.swing.JButton pagamento;
    private javax.swing.JButton sairGerente;
    // End of variables declaration//GEN-END:variables
}
