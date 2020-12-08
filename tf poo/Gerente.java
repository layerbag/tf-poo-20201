import java.util.ArrayList;

public class Gerente extends Pessoa{
    private String senhaGerente;
    private String areaSupervisao;
    private ArrayList<Tarefa> tarefas = new ArrayList();
    private ArrayList<Funcionario> funcionarios = new ArrayList();


    public Gerente(String cpf, String nome, int idade, double salario, String senhaGerente, String areaSupervisao) {
        super(cpf, nome, idade, salario);
        this.senhaGerente = senhaGerente;
        this.areaSupervisao = areaSupervisao;
    }

    public void montaTarefa(){
        //envia tarefa para arquivo
    }

    public Gerente(int senhaGerente, String areaSupervisao) {
        this.senhaGerente = senhaGerente;
        this.areaSupervisao = areaSupervisao;
    }


    public String getSenhaGerente() {
        return this.senhaGerente;
    }

    public void setSenhaGerente(String senhaGerente) {
        this.senhaGerente = senhaGerente;
    }

    public String getAreaSupervisao() {
        return this.areaSupervisao;
    }

    public void setAreaSupervisao(String areaSupervisao) {
        this.areaSupervisao = areaSupervisao;
    }

<<<<<<< Updated upstream
    public void montaTarefa(){
        Tarefa t = new Tarefa(1, 1, 50, false);
        tarefas.add(t);
    }
=======
    //recebe array de funcionarios a partir do arquivo Funcionarios.txt
    //e instancia cada um no arrai do gerente
    public void leFuncionarios(ArrayList<String> funcionarios){
        String[] linha;
        for (String funcionario : funcionarios) {
            linha = funcionario.split(" ");
        }
    }
    
>>>>>>> Stashed changes

}
