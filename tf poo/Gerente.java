import java.util.ArrayList;

public class Gerente extends Pessoa{
    private String senhaGerente;
    private String areaSupervisao;
    private ArrayList<Funcionario> funcionarios = new ArrayList();


    public Gerente(String cpf, String nome, int idade, double salario, String senhaGerente, String areaSupervisao) {
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

    
    

}
