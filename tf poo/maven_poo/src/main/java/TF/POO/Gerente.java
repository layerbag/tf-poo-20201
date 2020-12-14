package TF.POO;

import java.util.ArrayList;

public class Gerente extends Pessoa{
    private String senhaGerente;
    private String areaSupervisao;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();


    public Gerente(String cpf, String nome, int idade, double salario, String senhaGerente, String areaSupervisao) {
        super(cpf, nome, idade, salario);
        this.senhaGerente = senhaGerente;
        this.areaSupervisao = areaSupervisao;
    }


    public boolean cadastraFuncionario(Funcionario funcionario){
        try{
            this.funcionarios.add(funcionario);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean removeFuncionarios(Funcionario funcionario){
        try{
            this.funcionarios.remove(funcionario);
            return true;
        }catch(Exception e){
            return false;
        }
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

    public String toString (){
        String x = "";

        x += this.getCpf() + "\n" + this.getNome() + "\n" + this.getIdade() + "\n" +
            this.getSalario() + "\n" + this.senhaGerente + "\n" + this.areaSupervisao;
        return x;
    }
    
    public ArrayList<Funcionario> getArrayList (){
        return this.funcionarios;
    }
}
