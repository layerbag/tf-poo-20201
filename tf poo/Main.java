import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) {
        int i = 0;
        ArrayList<Gerente> gerentes = new ArrayList<>();
        gerentes.add(new Gerente("cpf", "nome", 1, 1, 1, "areaSupervisao"));
        String[] options = {"gerente", "funcionario"};

        while (i == 0){
            i = JOptionPane.showOptionDialog(null,"entrar como:", "entrar como:", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, options, options[0]);
            if(i == 0){
                Gerente_main.Gmain(gerentes);
            }else{
                Funcionario_main.Fmain(gerentes);
            }
            i = JOptionPane.showConfirmDialog(null,"deseja continuar?","confirmação",JOptionPane.YES_NO_OPTION);
        }
    }
}
