import java.util.ArrayList;

public class Gerente extends Pessoa{
    private int senhaGerente;
    private String areaSupervisao;
    private ArrayList<Tarefa> tarefas = new ArrayList();
    private ArrayList<Funcionario> funcionarios = new ArrayList();


    public Gerente(String cpf, String nome, int idade, double salario, int senhaGerente, String areaSupervisao) {
        super(cpf, nome, idade, salario);
        this.senhaGerente = senhaGerente;
        this.areaSupervisao = areaSupervisao;
    }


    public Gerente(int senhaGerente, String areaSupervisao) {
        this.senhaGerente = senhaGerente;
        this.areaSupervisao = areaSupervisao;
    }


    public int getSenhaGerente() {
        return this.senhaGerente;
    }

    public void setSenhaGerente(int senhaGerente) {
        this.senhaGerente = senhaGerente;
    }

    public String getAreaSupervisao() {
        return this.areaSupervisao;
    }

    public void setAreaSupervisao(String areaSupervisao) {
        this.areaSupervisao = areaSupervisao;
    }

    public void montaTarefa(){
        Tarefa t = new Tarefa(1, 1, 50, false);
        tarefas.add(t);
    }

}
