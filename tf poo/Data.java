import java.io.*;
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

        try{
            while(scan.hasNext()){
                Array_G.add(new Gerente(scan.nextLine(), scan.nextLine(), scan.nextInt(), scan.nextDouble(), scan.nextLine(), scan.nextLine()) );
            }
        }catch(Exception e){ 
            e.getMessage();
        }
        scan.close();
        return Array_G;
    }
    public ArrayList<Funcionario> GetDataFuncionario() throws ErroNoFile{
        ArrayList<Funcionario> Array_F = new ArrayList<>();
        try {
            OpenFile();
        } catch (ErroNoFile e) {
            e.CorrigeErro();
        }
        try{
            while(scan.hasNext()){
                Array_F.add(new Funcionario(scan.nextLine(), scan.nextLine(), scan.nextInt(), scan.nextDouble(), scan.nextInt(), scan.nextInt()));
            }
        }catch(Exception e){ 
            e.getMessage();
        }
        scan.close();
        return Array_F;
    }
    public ArrayList<Tarefa> GetDataTarefas()throws ErroNoFile{
        ArrayList<Tarefa> Array_F = new ArrayList<>();
        try{
            OpenFile();
        }catch (ErroNoFile e){
            e.CorrigeErro();
        }
        
        try{
            while(scan.hasNext()){
                Array_F.add(new Tarefa(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextBoolean()));
            }
        }catch(Exception e){ 
            e.getMessage();
        }
        scan.close();
        return Array_F;
    }
    
    public void SetDataGerente(ArrayList<Gerente>Array_G){ 
        try{
            PrintWriter Wfile = new PrintWriter(this.file);
                for (Gerente gerente : Array_G) {
                    
                    Wfile.print(Array_G.gerente.getCpf() + " " );
                }
                    
                
            Wfile.close();
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void SetDataFuncionario(ArrayList<Funcionario>Array_F){ 
        

    }

    public void SetDataTarefa(ArrayList<Tarefa>Array_T){ 
        

    }

}