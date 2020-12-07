import java.sql.Time;
import java.util.Date;

public class Tarefa {
    private int idTarefa;
    private int nivel;
    private int horasNecessarias;
    private boolean statusTarefa;
    private Funcionario funcionario;
    private Date horaInicio;
    private Date horaFinal;


    public Tarefa(int idTarefa, int nivel, int horasNecessarias, boolean statusTarefa) {
        this.idTarefa = idTarefa;
        this.nivel = nivel;
        this.horasNecessarias = horasNecessarias;
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

    public boolean isStatusTarefa() {
        return this.statusTarefa;
    }

    public boolean getStatusTarefa() {
        return this.statusTarefa;
    }

    public void setStatusTarefa(boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }


    public Date getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFinal() {
        return this.horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    
}
