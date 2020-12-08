import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gerente_main {

    public static void Gmain(ArrayList<Gerente> gerentes){
        Gerente g = null;
        String cpf;
        int senha,x;
        String[] options = {"Cadastrar funcionario", "cadastrar tarefa", "sair"};

        cpf = JOptionPane.showInputDialog(null,"digite seu cpf:");

        saida: for (Gerente gerente : gerentes) {
            String a = gerente.getCpf();
            if(a.equals(cpf)){
                System.out.println("y");
                while(true){
                    senha = Integer.parseInt(JOptionPane.showInputDialog(null,"informe sua senha:"));
                    if(gerente.verifica_senha(senha) == true ) {
                        g = gerente;
                        System.out.println("x");
                        break saida;
                    }
                    else {
                        x = JOptionPane.showConfirmDialog(null,"deseja tentar novamente?","SENHA INCORRETA", JOptionPane.YES_NO_OPTION);
                        if(x == 1) return;
                    }
                }
            }
            if(gerente == gerentes.get(gerentes.size()-1)) return;
        }

        while(true){
            x = JOptionPane.showOptionDialog(null,"oque deseja fazer?", "opções", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, options, options[0]);
            if(x == 0) g.cadastraFuncionario(new Funcionario("cpf", "nome", 1, 1, 1, 1,false));
            if(x == 2) return;
        }


    }
}
