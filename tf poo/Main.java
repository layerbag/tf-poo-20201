import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente(123, "areaSupervisao");
        Funcionario f = new Funcionario(1, false);
        Tarefa t = new Tarefa(555, 1, 20, false);

        f.batePonto();
        
        

    }
}
