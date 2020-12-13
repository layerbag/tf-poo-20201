package TF.POO;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ErroNoFile {
        // ARQUIVOS
        //declarar arquivos
        File GData = new File("GerenteData.txt");
        File FData = new File("FuncionarioData.txt");
        File TData = new File("TarefaData.txt");
        // contrutor dado
        Data GD = new Data(GData);
        Data FD = new Data(FData);
        Data TD = new Data(TData);
        //Array
        ArrayList<Gerente> arrayGerentes = new ArrayList<>();
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<>();
        ArrayList<Tarefa> arrayTarefas = new ArrayList<>();

        arrayGerentes = GD.GetDataGerente();
        arrayTarefas = TD.GetDataTarefas();
        arrayFuncionario = FD.GetDataFuncionario(arrayTarefas);
        GD.classificaFuncionario(arrayGerentes, arrayFuncionario);

        TelaInicial telaInicial = new TelaInicial(arrayFuncionario, arrayGerentes, arrayTarefas,GD,FD,TD);
        telaInicial.setLocationRelativeTo(null);
        telaInicial.setVisible(true);

        
    }

    
}
