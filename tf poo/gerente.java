import java.util.ArrayList;

public class Gerente {
    private ArrayList<Tarefa> tarefaDiaria = new ArrayList();

    public void adicionTarefa(Tarefa t){
        tarefaDiaria.add(t);
    }

    public void removeTarefa(Tarefa t){
        tarefaDiaria.remove(t);
    }
}
