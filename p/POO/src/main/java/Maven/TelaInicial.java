package Maven;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.*;
import java.util.ArrayList;

public class TelaInicial extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int indiceFuncionario;
    private int indiceGerente;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Gerente> gerentes;
    private ArrayList<Tarefa> tarefas;
    final Data fd ;
    final Data td ;

    public TelaInicial(ArrayList<Funcionario> fun, ArrayList<Gerente> ger, ArrayList<Tarefa> tar, Data FD,Data TD) {
        this.funcionarios = fun;
        this.gerentes = ger;
        this.tarefas = tar;
        this.fd = FD;
        this.td = TD;
        initComponents();
        
    }

    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        funcionarioBt = new javax.swing.JButton();
        gerenteBt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        WindowAdapter a = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                try{
                    funcionarios = Data.juntaFuncionarios(gerentes);
                    fd.SetDataFuncionario(funcionarios);
                    td.SetDataTarefa(tarefas);
                    System.exit(0);
                }catch(Exception x){
                    x.getMessage();
                }
            }
        };
        addWindowListener(a);
        setMinimumSize(new java.awt.Dimension(392, 320));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Olá, Selecione sua função");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        funcionarioBt.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        funcionarioBt.setText("Sou Funcionário");
        funcionarioBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioBtActionPerformed(evt);
            }
        });

        gerenteBt.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        gerenteBt.setText("Sou Gerente");
        gerenteBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenteBtActionPerformed(evt);
            }
        });

        

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("• Registro de entrada");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("• Registro de saída");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("• Gerenciar tarefas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("• Gerenciar funcionários");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("• Cadastrar tarefas");

        javax.swing.GroupLayout inicialLayout = new javax.swing.GroupLayout(inicial);
        inicial.setLayout(inicialLayout);
        inicialLayout.setHorizontalGroup(
            inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicialLayout.createSequentialGroup()
                .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(inicialLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gerenteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(funcionarioBt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inicialLayout.setVerticalGroup(
            inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(funcionarioBt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(gerenteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerenteBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenteBtActionPerformed
        javax.swing.JTextField cpf = new javax.swing.JTextField(5);
        javax.swing.JTextField senha = new javax.swing.JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new javax.swing.JLabel("CPF"));
        myPanel.add(cpf);
        myPanel.add(new javax.swing.JLabel("Senha"));
        myPanel.add(senha);

        int result = JOptionPane.showConfirmDialog(null, myPanel, "Entre com seu CPF e Senha", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if (verificaGerente(cpf.getText(), senha.getText())) {
                GerenteTela gerenteTela = new GerenteTela(gerentes.get(indiceGerente), tarefas);
                gerenteTela.setLocationRelativeTo(null);
                gerenteTela.iniciaCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Desculpa, CPF e/ou Senha não encontrado(s)" + gerentes.get(indiceGerente).getCpf(), "Falha na autenticação", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_gerenteBtActionPerformed

    private void funcionarioBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioBtActionPerformed
        funcionarios = Data.juntaFuncionarios(gerentes);
        String cpf = JOptionPane.showInputDialog(null, "Entre com seu CPF", "Autenticação de Funcionário", JOptionPane.QUESTION_MESSAGE);
        if (verificaFuncionario(cpf)) {
            FuncionarioTela funcionarioTela = new FuncionarioTela(funcionarios.get(indiceFuncionario), tarefas);
            funcionarioTela.iniciaCampos();
            funcionarioTela.setLocationRelativeTo(null);
            funcionarioTela.setVisible(true);
        } else if (cpf == null) {

        } else {
            JOptionPane.showMessageDialog(null, "Desculpa, CPF não encontrado", "Falha na autenticação", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_funcionarioBtActionPerformed

    private boolean verificaFuncionario(String cpf) {
        try {
            Funcionario f;
            for (int i = 0; i < funcionarios.size(); i++) {
                f = funcionarios.get(i);
                if (f.getCpf().equals(cpf)) {
                    this.indiceFuncionario = i;
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    private boolean verificaGerente(String cpf, String senha) {
        try {
            Gerente g;
            for (int i = 0; i < gerentes.size(); i++) {
                g = gerentes.get(i);
                if (g.getCpf().equals(cpf) && g.getSenhaGerente().equals(senha)) {
                    this.indiceGerente = i;
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton funcionarioBt;
    private javax.swing.JButton gerenteBt;
    private javax.swing.JPanel inicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
