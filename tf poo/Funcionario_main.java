import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Funcionario_main {
    public static void Fmain (ArrayList<Gerente> gerentes){
        Funcionario f;
        String cpf;

        cpf = JOptionPane.showInputDialog(null,"digite seu cpf");
        
        for (Gerente gerente : gerentes) {
            for (Funcionario funcionario : gerente.getfuncionarios()) {
                if (funcionario.getCpf() == cpf){
                    f = funcionario;
                    break;
                }
            }
            System.out.println("x");
        }

    }
}
