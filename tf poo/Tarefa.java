import java.util.Calendar;

public class Tarefa {
    private int idTarefa;
    private int nivel;
    private int horasNecessarias;
    private boolean statusTarefa;
    private Funcionario funcionario;
    private Calendar dataInicio;
    private Calendar dataFinal;


    public Tarefa(int idTarefa, int nivel, int horasNecessarias, boolean statusTarefa) {
        this.idTarefa = idTarefa;
        this.nivel = nivel;
        this.horasNecessarias = horasNecessarias;
        this.statusTarefa = statusTarefa;
    }

    public void arquivaTarefa(){
        //salva em arquivo
    }


    public Funcionario getFuncionario() {
        return this.funcionario;
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

    public boolean getStatusTarefa() {
        return this.statusTarefa;
    }

    public void setStatusTarefa(boolean statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public String getdataInicio() {
        return this.dataInicio.get(Calendar.DAY_OF_WEEK) + " " +
        this.dataInicio.get(Calendar.HOUR_OF_DAY) + ":" +
        this.dataInicio.get(Calendar.MINUTE) + ":" +
        this.dataInicio.get(Calendar.SECOND);
    }

    public String getdataFinal() {
        return this.dataFinal.get(Calendar.DAY_OF_WEEK) + " " +
        this.dataFinal.get(Calendar.HOUR_OF_DAY) + ":" +
        this.dataFinal.get(Calendar.MINUTE) + ":" +
        this.dataFinal.get(Calendar.SECOND);
    }

    public String toString(){
        return this.idTarefa + "\n" + this.nivel + "\n" + this.horasNecessarias +
            "\n" + this.statusTarefa;
    }
    
}
