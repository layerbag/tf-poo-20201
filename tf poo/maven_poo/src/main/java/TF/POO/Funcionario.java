package TF.POO;

import java.util.Calendar;

public class Funcionario extends Pessoa{
    private int nivel;
    private int horasExtras;
    private Tarefa tarefa = null;
    private Calendar horaEntrada;
    private boolean naEmpresa;
    private String area;

    //Construtor
    public Funcionario(String cpf, String nome, int idade, double salario, int nivel, String area) {
        super(cpf, nome, idade, salario);
        this.nivel = nivel;
        this.horasExtras = 0;
        this.naEmpresa = false;
        this.area = area;
    }


    public Funcionario(String cpf, String nome, int idade, double salario,int nivel, int horasExtras, Tarefa tarefa, Calendar horaEntrada, boolean naEmpresa, String area) {
        super(cpf, nome, idade, salario);
        this.nivel = nivel;
        this.horasExtras = horasExtras;
        this.tarefa = tarefa;
        this.horaEntrada = horaEntrada;
        this.naEmpresa = naEmpresa;
        this.area = area;
    }
    

    //Métodos essenciais
    public double calculaSalario(double valorHoraExtra){
        return super.getSalario() + valorHoraExtra*this.horasExtras;
    }

    public void batePonto(){
        this.horaEntrada = Calendar.getInstance(); //instancia calendar da hora de entrada
    }

    public void finalizaExpediente(){
        Calendar c = Calendar.getInstance(); //instancia calendar da hora de saida
        c.add(Calendar.HOUR_OF_DAY, 9); //adiciona 9 horas para teste
        int horas = c.get(Calendar.HOUR_OF_DAY) - this.horaEntrada.get(Calendar.HOUR_OF_DAY); //calcula horas trabalhadas
        if(horas > 8)this.horasExtras += horas - 8; //se a carga horária passar de 8 adicionamos em horas extras
        System.out.println("horas trabalhadas: " + horas + "horas extra: " + (horas-8));
    }

    public void recebeTarefa(){
        //continuar
    }
    

    //Gets e Sets
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

    public String getHoraEntrada() {
        return this.horaEntrada.get(Calendar.HOUR_OF_DAY) + 
        ":" + this.horaEntrada.get(Calendar.MINUTE) + 
        ":" + this.horaEntrada.get(Calendar.SECOND);
    }

    public boolean isNaEmpresa() {
        return this.naEmpresa;
    }

    public void setNaEmpresa(boolean naEmpresa) {
        this.naEmpresa = naEmpresa;
    }

    public String getArea (){
        return this.area;
    }

    public String toStringArquivo () { //transforma os dados em String no formatado para o arquivo
        String x ="";

        x += this.getCpf()+ "\n" + this.getNome() + "\n" +  this.getIdade() + "\n" +
            this.getSalario() + "\n" + this.nivel + "\n" + this.horasExtras + "\n";
        if(this.tarefa == null){
            x += "x\n";
        }else{
            x += this.tarefa.getIdTarefa() + "\n";
        }
        
        if(this.horaEntrada == null){
            x += "x\n";
        }else{
            x += this.horaEntrada.getTimeInMillis() + "\n";
        }

        x += this.naEmpresa + "\n" + this.area;
        return x;
    }


    @Override
    public String toString() {
        return super.getNome();
    }

}
