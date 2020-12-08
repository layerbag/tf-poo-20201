import java.util.ArrayList;

public class TarefasSemanais {
    private String data;
    private ArrayList<Tarefa> tarefas = new ArrayList();


    public TarefasSemanais(String data) {
        this.data = data;
    }

    public void adicionaTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }

    public void removeTarefa(int tarefaId){
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdTarefa() == tarefaId) {
                tarefa.arquivaTarefa();
                tarefas.remove(tarefa);
            }
        }
    }


    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
