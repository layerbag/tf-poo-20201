public class Tarefa {
    private String nome;

    public Tarefa() {
    }

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
}
