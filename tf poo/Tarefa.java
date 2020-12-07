import java.sql.Time;

public class Tarefa {
    private int idTarefa;
    private int nivel;
    private int horasNecessarias;
    private Time horasTrabalhadas;
    private boolean statusTarefa;


    public Tarefa(int idTarefa, int nivel, int horasNecessarias, boolean statusTarefa) {
        this.idTarefa = idTarefa;
        this.nivel = nivel;
        this.horasNecessarias = horasNecessarias;
        //this.horasTrabalhadas = 0;
        this.statusTarefa = statusTarefa;
    }

    public int getIdTarefa() {
        return this.idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHorasNecessarias() {
        return this.horasNecessarias;
    }

    public void setHorasNecessarias(int horasNecessarias) {
        this.horasNecessarias = horasNecessarias;
    }

    public Time getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Time horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public boolean isStatusTarefa() {
        return this.statusTarefa;
    }

    public boolean getStatusTarefa() {
        return this.statusTarefa;
    }

    public void setStatusTarefa(boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }
    
}
