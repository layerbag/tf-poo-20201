import java.util.ArrayList;

public class Gerente extends Pessoa{
    private int senhaGerente;
    private String areaSupervisao;
    private ArrayList<Funcionario> funcionarios = new ArrayList();


    public Gerente(String cpf, String nome, int idade, double salario, int senhaGerente, String areaSupervisao) {
        super(cpf, nome, idade, salario);
        this.senhaGerente = senhaGerente;
        this.areaSupervisao = areaSupervisao;
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

    public void montaTarefa(Tarefa t){
        super.getTarefas().add(t);
    }

    public void cadastraFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> getfuncionarios(){
        return this.funcionarios;
    }

    public boolean verifica_senha(int senha){
        if(this.senhaGerente == senha){
            return true;
        }else return false;
    }

}
