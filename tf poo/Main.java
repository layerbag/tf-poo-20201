import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ARQUIVOS
        //declarar arquivos
        File PData = new File("PessoaData.txt");
        File FData = new File("FuncionarioData.txt");
        File TData = new File("TarefaData.txt");
        // contrutor dado
        Data PD = new Data(PData);
        Data FD = new Data(FData);
        Data TD = new Data(TData);
        ArrayList<Gerente> gerentes = new ArrayList<>();

        gerentes = PD.legerente();



        //TEST
        menssagem = "2222 chefe  55 5000.00 123 Gerente de Projetos"
        
        Gerente g = new Gerente("2222", "chefe", 55, 5000.00, 123, "Gerente de Projetos");
        Funcionario f = new Funcionario("5555", "JV", 20, 2500.00, 2);
        Tarefa t = new Tarefa(555, 1, 20, false);

        f.batePonto();
        System.out.println(f.getHoraEntrada());
        f.finalizaExpediente();
        

    }
}
