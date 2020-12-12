package TF.POO;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JDialog;

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
        ArrayList<Gerente> ArrayGerentes = new ArrayList<>();
        ArrayList<Funcionario> ArrayFuncionario = new ArrayList<>();
        ArrayList<Tarefa> ArrayTarefas = new ArrayList<>();

        ArrayGerentes = GD.GetDataGerente();
        ArrayTarefas = TD.GetDataTarefas();
        ArrayFuncionario = FD.GetDataFuncionario(ArrayTarefas);
        Data.classificaFuncionario(ArrayGerentes, ArrayFuncionario);

        //TEST
        
        
       // ArrayGerentes.add(new Gerente("2222", "chefe", 55, 5000.00, "123", "Gerente de Projetos"));
       // Funcionario f = new Funcionario("5555", "JV", 20, 2500.00, 2,"Gerente de Projetos");
      //  ArrayGerentes.add(new Gerente("1111", "chefe2", 55, 5000.00, "123", "produção"));
       // Funcionario g = new Funcionario("5555", "gm", 20, 2500.00, 2,"produção");
       // ArrayGerentes.get(0).cadastraFuncionario(f);
      //  ArrayGerentes.get(1).cadastraFuncionario(g);

        // JUNTA TODOS OS ARRAYS DE FUNCIONARIO DE CADA GERENTE A UM UNICO ARRAY
     //   ArrayFuncionario.add(f);
      //  ArrayFuncionario.add(g);

      //  Tarefa t = new Tarefa(1, 2, 20, "Programação", "Programe até não ter nenhum erro ou bufg");
      //  ArrayTarefas.add(t);

      //  ArrayFuncionario = Data.juntaFuncionarios(ArrayGerentes);

        Tela tela = new Tela(ArrayFuncionario, ArrayGerentes, ArrayTarefas,GD,FD,TD);

        for (Gerente gerente: ArrayGerentes) {
            for (Funcionario funcionario : gerente.getArrayList()) {
                System.out.println(funcionario.toString());
            }
        }

      //  ArrayFuncionario = Data.juntaFuncionarios(ArrayGerentes);

       // GD.SetDataGerente(ArrayGerentes);
       // FD.SetDataFuncionario(ArrayFuncionario);

        /*GD.SetDataGerente(ArrayGerentes);
        FD.SetDataFuncionario(ArrayFuncionario);
        /*ArrayFuncionario.get(0).batePonto();
        System.out.println(ArrayFuncionario.get(0).getHoraEntrada());
        ArrayFuncionario.get(0).finalizaExpediente();
        System.out.println(ArrayGerentes.get(0).getSenhaGerente());*/

    }
}
