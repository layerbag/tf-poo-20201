import java.sql.Time;

public class Funcionario extends Pessoa{
    private int nivel;
    private Time horasTrabalhadas;
    private int cargaHorariaDiaria;
    private int horasExtras;
    private Tarefa tarefa;
    private Time horaEntrada;
    private boolean naEmpresa;


    public Funcionario(String cpf, String nome, int idade, double salario, int nivel, Time horasTrabalhadas, int cargaHorariaDiaria, int horasExtras, Tarefa tarefa, Time horaEntrada, boolean naEmpresa) {
        super(cpf, nome, idade, salario);
        this.nivel = nivel;
        this.horasTrabalhadas = horasTrabalhadas;
        this.cargaHorariaDiaria = cargaHorariaDiaria;
        this.horasExtras = horasExtras;
        this.tarefa = tarefa;
        this.horaEntrada = horaEntrada;
        this.naEmpresa = naEmpresa;
    }


    public Funcionario(int nivel, int cargaHorariaDiaria, boolean naEmpresa) {
        this.nivel = nivel;
        this.cargaHorariaDiaria = cargaHorariaDiaria;
        this.naEmpresa = naEmpresa;
    }



    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Time getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Time horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getCargaHorariaDiaria() {
        return this.cargaHorariaDiaria;
    }

    public void setCargaHorariaDiaria(int cargaHorariaDiaria) {
        this.cargaHorariaDiaria = cargaHorariaDiaria;
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

    public Time getHoraEntrada() {
        return this.horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
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
