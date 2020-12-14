package Maven;

import java.util.ArrayList;

public class FuncionarioTela extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ArrayList<Tarefa> tarefas;
    Funcionario f;

    public FuncionarioTela(Funcionario funcionario, ArrayList<Tarefa> tar) {
        this.f = funcionario;
        this.tarefas = tar;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcionario = new javax.swing.JPanel();
        instrucao = new javax.swing.JLabel();
        checkinBt = new javax.swing.JButton();
        checkoutBt = new javax.swing.JButton();
        labelTarefa = new javax.swing.JLabel();
        tituloTarefa = new javax.swing.JTextField();
        descricaoTarefa = new javax.swing.JTextArea();
        foto = new java.awt.Panel();
        labelEscolhe = new javax.swing.JLabel();
        comboTarefas = new javax.swing.JComboBox<Tarefa>();
        escolheBt = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        funcionario.setPreferredSize(new java.awt.Dimension(392, 303));

        instrucao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instrucao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instrucao.setText("Bem-Vindo @funcionário");

        checkinBt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkinBt.setText("Registrar entrada do expediente");
        checkinBt.setMaximumSize(new java.awt.Dimension(1000, 23));
        checkinBt.setPreferredSize(new java.awt.Dimension(193, 23));
        checkinBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinBtActionPerformed(evt);
            }
        });

        checkoutBt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkoutBt.setText("Registrar saída do Expediente");
        checkoutBt.setMaximumSize(new java.awt.Dimension(1000, 23));
        checkoutBt.setMinimumSize(new java.awt.Dimension(209, 23));
        checkoutBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtActionPerformed(evt);
            }
        });

        labelTarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTarefa.setText("Sua tarefa:");
        labelTarefa.setMaximumSize(new java.awt.Dimension(1000, 15));

        tituloTarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tituloTarefa.setEditable(false);

        descricaoTarefa.setEditable(false);
        descricaoTarefa.setColumns(20);
        descricaoTarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descricaoTarefa.setRows(5);
        descricaoTarefa.setLineWrap(true);

        foto.setBackground(new java.awt.Color(0, 0, 0));
        foto.setMaximumSize(new java.awt.Dimension(99, 132));
        foto.setMinimumSize(new java.awt.Dimension(99, 132));
        foto.setPreferredSize(new java.awt.Dimension(99, 132));

        javax.swing.GroupLayout fotoLayout = new javax.swing.GroupLayout(foto);
        foto.setLayout(fotoLayout);
        fotoLayout.setHorizontalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        fotoLayout.setVerticalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        labelEscolhe.setText("Escolha uma tarefa:");

        comboTarefas.setMaximumRowCount(10);

        escolheBt.setText("Escolher");
        escolheBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolheBtActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout funcionarioLayout = new javax.swing.GroupLayout(funcionario);
        funcionario.setLayout(funcionarioLayout);
        funcionarioLayout.setHorizontalGroup(
            funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instrucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(funcionarioLayout.createSequentialGroup()
                        .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelTarefa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(checkoutBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(checkinBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(descricaoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tituloTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, funcionarioLayout.createSequentialGroup()
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(funcionarioLayout.createSequentialGroup()
                                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEscolhe, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(escolheBt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        funcionarioLayout.setVerticalGroup(
            funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(funcionarioLayout.createSequentialGroup()
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEscolhe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escolheBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair)
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(funcionarioLayout.createSequentialGroup()
                        .addComponent(checkinBt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkoutBt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoTarefa)
                        .addGap(13, 13, 13))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escolheBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolheBtActionPerformed
        Tarefa x = (Tarefa)comboTarefas.getSelectedItem();
        x.setStatusTarefa(true);
        f.setTarefa((Tarefa)comboTarefas.getSelectedItem());
        tituloTarefa.setText(f.getTarefa().getNome());
        descricaoTarefa.setText(f.getTarefa().getInstrucao());
        escolheBt.setEnabled(false);
        iniciaComboTarefa();
    }//GEN-LAST:event_escolheBtActionPerformed

    private void checkinBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinBtActionPerformed
        f.batePonto();
        checkoutBt.setEnabled(true);
        checkinBt.setEnabled(false);
    }//GEN-LAST:event_checkinBtActionPerformed

    private void checkoutBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtActionPerformed
        f.finalizaExpediente();
        checkinBt.setEnabled(true);
        checkoutBt.setEnabled(false);
        if(f.getTarefa() == null){
            tituloTarefa.setText(null);
            descricaoTarefa.setText(null);
            for (Tarefa tarefa : tarefas) {
                if(tarefa.getHorasNecessarias() < 0) tarefas.remove(tarefa);
            }
        }
        
    }//GEN-LAST:event_checkoutBtActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    public void iniciaCampos() {
        instrucao.setText("Bem-Vindo " + f.getNome());
        if (f.getTarefa() != null) {
            tituloTarefa.setText(f.getTarefa().getNome());
            descricaoTarefa.setText(f.getTarefa().getInstrucao());
            escolheBt.setEnabled(false);
        } else {
            tituloTarefa.setText(null);
            descricaoTarefa.setText(null);
            escolheBt.setEnabled(true);
        }
        if (f.isNaEmpresa()) {
            checkinBt.setEnabled(false);
            checkoutBt.setEnabled(true);
        } else {
            checkinBt.setEnabled(true);
            checkoutBt.setEnabled(false);
        }
        
        iniciaComboTarefa();
        this.setVisible(true);
    }

    public void iniciaComboTarefa(){
        comboTarefas.removeAllItems();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getNivel() == f.getNivel()) {
                if(tarefa.getStatusTarefa() == false){
                    comboTarefas.addItem(tarefa);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkinBt;
    private javax.swing.JButton checkoutBt;
    private javax.swing.JComboBox<Tarefa> comboTarefas;
    private javax.swing.JTextArea descricaoTarefa;
    private javax.swing.JButton escolheBt;
    private java.awt.Panel foto;
    private javax.swing.JPanel funcionario;
    private javax.swing.JLabel instrucao;
    private javax.swing.JLabel labelEscolhe;
    private javax.swing.JLabel labelTarefa;
    private javax.swing.JButton sair;
    private javax.swing.JTextField tituloTarefa;
    // End of variables declaration//GEN-END:variables
}
