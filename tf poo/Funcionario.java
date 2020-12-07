import java.util.Calendar;
import java.util.Date;

public class Funcionario extends Pessoa{
    private int nivel;
    private int horasExtras;
    private Tarefa tarefa;
    private Date horaEntrada;
    private boolean naEmpresa;


    public Funcionario(String cpf, String nome, int idade, double salario, int nivel, int horasExtras, Tarefa tarefa, boolean naEmpresa) {
        super(cpf, nome, idade, salario);
        this.nivel = nivel;
        this.horasExtras = horasExtras;
        this.tarefa = tarefa;
        this.naEmpresa = naEmpresa;
    }


    public Funcionario(int nivel, boolean naEmpresa) {
        this.nivel = nivel;
        this.naEmpresa = naEmpresa;
    }


    public double calculaSalario(double valorHoraExtra){
        return super.getSalario() + valorHoraExtra*this.horasExtras;
    }

    public void batePonto(){
        this.horaEntrada = new Date();
    }

    public void finalizaExpediente(){
        Date horaAtual = new Date();
        
    }


    
    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHorasExtras() {
        return this.horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Tarefa getTarefa() {
        return this.tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Date getHoraEntrada() {
        return this.horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public boolean isNaEmpresa() {
        return this.naEmpresa;
    }

    public boolean getNaEmpresa() {
        return this.naEmpresa;
    }

    public void setNaEmpresa(boolean naEmpresa) {
        this.naEmpresa = naEmpresa;
    }


}
