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


    public void cadastraFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionarios(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
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

    
    

}
