package Maven;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ErroNoFile {
        // ARQUIVOS
        //declarar arquivos
        File FData = new File("FuncionarioData.txt");
        File TData = new File("TarefaData.txt");
        // contrutor dado
        Data FD = new Data(FData);
        Data TD = new Data(TData);
        //Array
        ArrayList<Gerente> arrayGerentes = new ArrayList<>();
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<>();
        ArrayList<Tarefa> arrayTarefas = new ArrayList<>();

        arrayGerentes.add(new Gerente("1234", "Altino",30,10000.00,"123","Gerente de Projetos"));
        arrayGerentes.add(new Gerente("4321", "Outro Chefe",30,7000.00,"123","produção"));
        arrayTarefas = TD.GetDataTarefas();
        arrayFuncionario = FD.GetDataFuncionario(arrayTarefas);
        Data.classificaFuncionario(arrayGerentes, arrayFuncionario);

        TelaInicial telaInicial = new TelaInicial(arrayFuncionario, arrayGerentes, arrayTarefas,FD,TD);
        telaInicial.setLocationRelativeTo(null);
        telaInicial.setVisible(true);

        
    }

    
}
