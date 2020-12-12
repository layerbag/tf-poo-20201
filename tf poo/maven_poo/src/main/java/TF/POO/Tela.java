package TF.POO;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.*;
import java.util.ArrayList;

public class Tela extends JFrame{

    JFrame tela = new JFrame();
    JPanel geral = new JPanel();
    JPanel inicial = new JPanel();
    JPanel funcionario = new JPanel();
    JPanel gerente = new JPanel();
    CardLayout cl = new CardLayout();

    ArrayList<Funcionario> funcionarios;
    ArrayList<Gerente> gerentes;
    ArrayList<Tarefa> tarefas;
    ArrayList<Tarefa> tarefaSave;

    int indiceFuncionario = -1;
    int indiceGerente = -1;
    String cpfFuncionario = "-1";
    String cpfGerente = "-1";
    
    //tela inicial
    private javax.swing.JButton funcionarioBt;
    private javax.swing.JButton gerenteBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;

    //tela funcionario
    private javax.swing.JButton checkinBt;
    private javax.swing.JButton checkoutBt;
    private javax.swing.JComboBox<Tarefa> comboTarefas;
    private javax.swing.JTextArea descricaoTarefa;
    private javax.swing.JButton escolheBt;
    private java.awt.Panel foto;
    private javax.swing.JLabel instrucao;
    private javax.swing.JLabel labelEscolhe;
    private javax.swing.JLabel labelTarefa;
    private javax.swing.JButton sair;
    private javax.swing.JTextField tituloTarefa;

    //tela gerente
    private javax.swing.JButton cadastraFuncionario;
    private javax.swing.JButton cadastraTarefa;
    private javax.swing.JButton demite;
    private javax.swing.JPanel fotoGerente;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JLabel jLabelLista;
    private javax.swing.JLabel jLabelOque;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<Funcionario> listaFuncionarios;
    private javax.swing.JButton pagamento;
    private javax.swing.JButton sairGerente;

    public Tela(ArrayList<Funcionario> fun, ArrayList<Gerente> ger, ArrayList<Tarefa> tar, Data GD, Data FD,Data TD) {
        funcionarios = fun;
        gerentes = ger;
        tarefas = tar;
        tarefaSave = tar;
       final Data gd = GD;
       final Data fd = FD;
       final Data td = TD;
        
        geral.setLayout(cl);
        montaInicial();
        montaFuncionario();
        montaGerente();
        geral.add(inicial, "inicial");
        geral.add(funcionario, "funcionario");
        geral.add(gerente, "gerente");

        cl.show(geral, "inicial");

        WindowAdapter a = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                try{
                    gd.SetDataGerente(gerentes);
                    fd.SetDataFuncionario(Data.juntaFuncionarios(gerentes));
                    td.SetDataTarefa(tarefaSave);
                    System.exit(0);
                }catch(Exception x){
                    x.getMessage();
                }
            }
        };

        tela.addWindowListener(a);

        tela.setLocationRelativeTo(null);
        tela.add(geral);
        tela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
        
        

        
    }


    public void montaInicial(){
        jLabel1 = new javax.swing.JLabel();
        funcionarioBt = new javax.swing.JButton();
        gerenteBt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(392, 320));
        setMinimumSize(new java.awt.Dimension(392, 320));
        setPreferredSize(new java.awt.Dimension(392, 320));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Olá, Selecione sua função");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        funcionarioBt.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        funcionarioBt.setText("Sou Funcionário");
        funcionarioBt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                funcionarios = Data.juntaFuncionarios(gerentes);
                String cpf = JOptionPane.showInputDialog(null, "Entre com seu CPF", "Autenticação de Funcionário", JOptionPane.QUESTION_MESSAGE);
                if(verificaFuncionario(cpf)) {
                    instrucao.setText("Bem-Vindo " + funcionarios.get(indiceFuncionario).getNome());
                    if(funcionarios.get(indiceFuncionario).getTarefa() != null){
                        tituloTarefa.setText(funcionarios.get(indiceFuncionario).getTarefa().getNome());
                        descricaoTarefa.setText(funcionarios.get(indiceFuncionario).getTarefa().getInstrucao());
                        escolheBt.setEnabled(false);
                    }
                    cl.show(geral, "funcionario");
                }else JOptionPane.showMessageDialog(null, "Desculpa, CPF não encontrado", "Falha na autenticação", JOptionPane.INFORMATION_MESSAGE);

                for (Tarefa tarefa : tarefas) {
                    comboTarefas.addItem(tarefa);
                }
            }
        });

        gerenteBt.setFont(new java.awt.Font("Lucida Console", 0, 15)); // NOI18N
        gerenteBt.setText("Sou Gerente");
        gerenteBt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                javax.swing.JTextField cpf = new javax.swing.JTextField(5);
                javax.swing.JTextField senha = new javax.swing.JTextField(5);

                JPanel myPanel = new JPanel();
                myPanel.add(new javax.swing.JLabel("CPF"));
                myPanel.add(cpf);
                myPanel.add(new javax.swing.JLabel("Senha"));
                myPanel.add(senha);

                int result = JOptionPane.showConfirmDialog(null, myPanel, "Entre com seu CPF e Senha", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    if(verificaGerente(cpf.getText(), senha.getText())){
                        jLabelBemVindo.setText("Bem-Vindo " + gerentes.get(indiceGerente).getNome());
                        cl.show(geral, "gerente");
                    }else JOptionPane.showMessageDialog(null, "Desculpa, CPF e/ou Senha não encontrado(s)", "Falha na autenticação", JOptionPane.INFORMATION_MESSAGE);
                }
                listaFuncionarios.removeAllItems();
                for (Funcionario funcionario : gerentes.get(indiceGerente).getArrayList()) {
                    listaFuncionarios.addItem(funcionario);
                }
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
        
    }










    private void montaFuncionario(){
        funcionario = new javax.swing.JPanel();
        instrucao = new javax.swing.JLabel();
        checkinBt = new javax.swing.JButton();
        checkoutBt = new javax.swing.JButton();
        labelTarefa = new javax.swing.JLabel();
        tituloTarefa = new javax.swing.JTextField();
        descricaoTarefa = new javax.swing.JTextArea();
        foto = new java.awt.Panel();
        labelEscolhe = new javax.swing.JLabel();
        comboTarefas = new javax.swing.JComboBox<>();
        escolheBt = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        if(indiceFuncionario != -1){
            if(funcionarios.get(indiceFuncionario).isNaEmpresa()){
                checkinBt.setEnabled(false);
                checkoutBt.setEnabled(true);
            }else{
                checkinBt.setEnabled(true);
                checkoutBt.setEnabled(false);
            }
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(392, 320));

        funcionario.setPreferredSize(new java.awt.Dimension(392, 320));

        instrucao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        instrucao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        

        checkinBt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkinBt.setText("Registrar entrada do expediente");
        checkinBt.setMaximumSize(new java.awt.Dimension(1000, 23));
        checkinBt.setPreferredSize(new java.awt.Dimension(193, 23));
        checkinBt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                funcionarios.get(indiceFuncionario).batePonto();
                checkoutBt.setEnabled(true);
                checkinBt.setEnabled(false);
            }
        });

        checkoutBt.setEnabled(false);
        checkoutBt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkoutBt.setText("Registrar saída do Expediente");
        checkoutBt.setMaximumSize(new java.awt.Dimension(1000, 23));
        checkoutBt.setMinimumSize(new java.awt.Dimension(209, 23));
        checkoutBt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                funcionarios.get(indiceFuncionario).finalizaExpediente();
                checkinBt.setEnabled(true);
                checkoutBt.setEnabled(false);
            }
        });

        labelTarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTarefa.setText("Sua tarefa:");
        labelTarefa.setMaximumSize(new java.awt.Dimension(1000, 15));

        tituloTarefa.setEditable(false);
        tituloTarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tituloTarefa.setText("");

        descricaoTarefa.setEditable(false);
        descricaoTarefa.setColumns(20);
        descricaoTarefa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descricaoTarefa.setRows(5);
        descricaoTarefa.setText("");
        descricaoTarefa.setLineWrap(true);

        foto.setBackground(new java.awt.Color(0, 0, 0));
        foto.setMaximumSize(new java.awt.Dimension(99, 132));
        foto.setMinimumSize(new java.awt.Dimension(99, 132));
        foto.setPreferredSize(new java.awt.Dimension(99, 132));

        javax.swing.GroupLayout fotoLayout = new javax.swing.GroupLayout(foto);
        foto.setLayout(fotoLayout);
        fotoLayout.setHorizontalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fotoLayout.setVerticalGroup(
            fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        labelEscolhe.setText("Escolha uma tarefa:");


        escolheBt.setText("Escolher");
        escolheBt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                funcionarios.get(indiceFuncionario).setTarefa(tarefas.get(comboTarefas.getSelectedIndex()));
                tituloTarefa.setText(funcionarios.get(indiceFuncionario).getTarefa().getNome());
                descricaoTarefa.setText(funcionarios.get(indiceFuncionario).getTarefa().getInstrucao());
                escolheBt.setEnabled(false);
                comboTarefas.removeAllItems();
                for (Tarefa tarefa : tarefas) {
                    comboTarefas.addItem(tarefa);
                }
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                indiceFuncionario = -1;
                cl.show(geral, "inicial");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(funcionarioLayout.createSequentialGroup()
                                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEscolhe, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(funcionarioLayout.createSequentialGroup()
                                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(escolheBt, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
    }

    
















    private void montaGerente(){
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
        listaFuncionarios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(392, 320));

        gerente.setPreferredSize(new java.awt.Dimension(392, 320));

        jLabelBemVindo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        

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
        cadastraFuncionario.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
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
                    Funcionario f = new Funcionario(cpf.getText(), nome.getText(), Integer.parseInt(idade.getText()), Double.parseDouble(salario.getText()), Integer.parseInt(nivel.getText()), gerentes.get(indiceGerente).getAreaSupervisao());
                    gerentes.get(indiceGerente).cadastraFuncionario(f);
                }
                listaFuncionarios.removeAllItems();
                for (Funcionario funcionario : gerentes.get(indiceGerente).getArrayList()) {
                    listaFuncionarios.addItem(funcionario);
                }
            }
        });

        cadastraTarefa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastraTarefa.setText("Cadastra Tarefa");
        cadastraTarefa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
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
            }

        });

        jLabelOque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelOque.setText("O que fazer:");

        jLabelLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelLista.setText("Lista de Funcionários");

        pagamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pagamento.setText("calcula salário");
        pagamento.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double v = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor da hora extra?"));
                funcionarios.get(listaFuncionarios.getSelectedIndex()).calculaSalario(v);
            }
        });

        demite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        demite.setText("demitir funcionário");
        demite.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                gerentes.get(indiceGerente).getArrayList().remove(listaFuncionarios.getSelectedItem());
                listaFuncionarios.removeAllItems();
                for (Funcionario funcionario : gerentes.get(indiceGerente).getArrayList()) {
                    listaFuncionarios.addItem(funcionario);
                }
            }
        });

        sairGerente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sairGerente.setText("Sair");
        sairGerente.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cl.show(geral, "inicial");
            }
        });

        listaFuncionarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listaFuncionarios.setMaximumRowCount(10);
        
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOque, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gerenteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sairGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(demite, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(demite, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sairGerente)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gerente, javax.swing.GroupLayout.PREFERRED_SIZE, 392, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    private boolean verificaFuncionario(String cpf){
        try{
            Funcionario f;
            for (int i = 0 ; i < funcionarios.size() ; i++) {
                f = funcionarios.get(i);
                if(f.getCpf().equals(cpf)){
                    this.indiceFuncionario = i;
                    this.cpfFuncionario = f.getCpf();
                    return true;
                }
            }
        }catch(Exception e){
            return false;
        }
        return false;
    }

    private boolean verificaGerente(String cpf, String senha){
        try{
            Gerente g;
            for (int i = 0 ; i < gerentes.size() ; i++) {
                g = gerentes.get(i);
                if(g.getCpf().equals(cpf) && g.getSenhaGerente().equals(senha)){
                    this.indiceGerente = i;
                    this.cpfGerente = g.getCpf();
                    return true;
                }
            }
        }catch(Exception e){
            return false;
        }
        return false;
    }

}
