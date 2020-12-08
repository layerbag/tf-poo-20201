import java.util.ArrayList;
import java.util.Scanner;

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

            //System.out.println(("SAVE.txt criated? " + file.createNewFile()));
        //rxceção
        }catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    public ArrayList<Gerente> GetDataGerente(){
        
        ArrayList<Gerente> Array_G = new Arraylist<>();
        OpenFile();
    
        while(scan.hasNext()){
        Array_G.add(new Gerente(scan.next(), scan.next(), Integer.parseInt(scan.next()), Double.parseDouble(scan.next()), scan.next(), scan.next());
        }

        return Array_G;
    }
    public ArrayList<Funcionario> GetDataFuncionario(){
    }
    public ArrayList<Tarefa> GetDataTarefas(){

    }
}
