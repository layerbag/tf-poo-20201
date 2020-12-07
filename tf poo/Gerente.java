import java.util.ArrayList;

public class Gerente {
    private ArrayList<Tarefa> tarefaDiaria = new ArrayList();

    public void adicionTarefa(Tarefa t){
        tarefaDiaria.add(t);
        System.out.println(t.toString());
    }

    public void removeTarefa(Tarefa t){
        tarefaDiaria.remove(t);
    }

    public static void retornaTarefas(int nivel){
        
    }
}
