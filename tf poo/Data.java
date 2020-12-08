import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Data {

    private File file;
    private Scanner scan;

    public Data(File file){
        this.file = file;
    }

    public void OpenFile(){
        //ler arquivo
        try {
            this.scan = new Scanner(this.file);

        }catch (IOException e) {
            // 
            
        }
    }

    public ArrayList<Gerente> GetDataGerente(){
        
        ArrayList<Gerente> Array_G = new ArrayList<>();
        OpenFile();
    
        while(scan.hasNext()){
            Array_G.add(new Gerente(scan.next(), scan.next(), Integer.parseInt(scan.next()),
            Double.parseDouble(scan.next()), scan.next(), scan.next()));
        }

        return Array_G;
    }
    public ArrayList<Funcionario> GetDataFuncionario(){
        ArrayList<Funcionario> Array_F = new ArrayList<>();
        OpenFile();
    
        while(scan.hasNext()){
        Array_F.add(new Funcionario(scan.next(), scan.next(), Integer.parseInt(scan.next()), Double.parseDouble(scan.next()), Integer.parseInt(scan.next()),Integer.parseInt(scan.next())));
        }

        return Array_F;
    }
    public ArrayList<Tarefa> GetDataTarefas(){
        ArrayList<Tarefa> Array_F = new ArrayList<>();
        OpenFile();
    
        while(scan.hasNext()){
        Array_F.add(new Tarefa(Integer.parseInt(scan.next()), Integer.parseInt(scan.next()), Integer.parseInt(scan.next()), Boolean.parseBoolean(scan.next()) ) );
        }

        return Array_F;
    }

    
}
