public class Funcionario {
    private int nivel;
    private Tarefa tarefa;

    public Funcionario(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Tarefa getTarefa() {
        return this.tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public void escolheTarefa(){
        setTarefa(Gerente.retornaTarefas(this.nivel));
    }

}
