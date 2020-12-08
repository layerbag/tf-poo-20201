import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {

    private File file;
    private Scanner scan;

    public Data(File file){
        this.file = file;
    }

    public void OpenFile() throws ErroNoFile{
        //ler arquivo
        try {
            this.scan = new Scanner(this.file);
            
        }catch (IOException e) {
            throw new ErroNoFile(file);
        }
    }

    public ArrayList<Gerente> GetDataGerente() throws ErroNoFile{
        
        ArrayList<Gerente> Array_G = new ArrayList<>();
        try{
            OpenFile();
        }catch (ErroNoFile e){
            e.CorrigeErro();
        }
    
       // while(scan.hasNext()){
       // Array_G.add(new Gerente(scan.next(), scan.next(), Integer.parseInt(scan.next()), Double.parseDouble(scan.next()), scan.next(), scan.next()));
      //  }

        return Array_G;
    }
    public ArrayList<Funcionario> GetDataFuncionario() throws ErroNoFile{
        ArrayList<Funcionario> Array_F = new ArrayList<>();
        try {
            OpenFile();
        } catch (ErroNoFile e) {
            e.CorrigeErro();
        }
    
        while(scan.hasNext()){
       // Array_F.add(new Funcionario(cpf, nome, idade, salario, nivel);
        }

        return Array_F;
    }
    public ArrayList<Tarefa> GetDataTarefas(){
        return null;
    }

    
}
