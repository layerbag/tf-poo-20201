import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
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

        String cpf;
        String nome;
        int idade;
        double salario;
        String senhaGerente;
        String areaSupervisao;

        try{
            OpenFile();
        }catch (ErroNoFile e){
            e.CorrigeErro();
        }

        try{
            while(scan.hasNext()){
               cpf = scan.nextLine();
               nome = scan.nextLine();
               idade = scan.nextInt();
               salario = scan.nextDouble();
               scan.nextLine();
               senhaGerente = scan.nextLine();
               areaSupervisao = scan.nextLine();

               Array_G.add(new Gerente(cpf, nome, idade, salario, senhaGerente, areaSupervisao));
            }
            scan.close();
        }catch(Exception e){ 
            e.getMessage();
        }
        
        return Array_G;
    }
    public ArrayList<Funcionario> GetDataFuncionario(ArrayList<Tarefa> tarefas) throws ErroNoFile{
        ArrayList<Funcionario> Array_F = new ArrayList<>();
        String cpf;
        String nome;
        int idade;
        double salario;
        int nivel;
        int horasExtras;
        Tarefa tarefa;
        String temp;
        Calendar horaEntrada;
        boolean naEmpresa;

        try {
            OpenFile();
        } catch (ErroNoFile e) {
            e.CorrigeErro();
        }
        try{
            while(scan.hasNext() == true){  // le dados dos funcionarios
               tarefa = null;
               horaEntrada = Calendar.getInstance();
               cpf = scan.nextLine();
               nome = scan.nextLine();
               idade = scan.nextInt();
               salario = scan.nextDouble();
               nivel = scan.nextInt();
               horasExtras = scan.nextInt();
               scan.nextLine();
               temp = scan.nextLine();
                if(temp.equals("x") == false){
                    for (Tarefa tarefa_2 : tarefas) {
                        if(tarefa_2.getIdTarefa() == Integer.parseInt(temp)){ 
                            tarefa = tarefa_2;
                            break;
                        }
                    }
                }
                temp = scan.next();
                if(temp.equals("x") == true) { 
                    horaEntrada = null;}
                else{
                    long c =Long.parseLong(temp);
                    horaEntrada.setTimeInMillis(c);
                }
                naEmpresa = scan.nextBoolean();
                scan.nextLine();
                Array_F.add(new Funcionario(cpf, nome, idade, salario, nivel, horasExtras, tarefa, horaEntrada, naEmpresa));
            }
            scan.close();
        }catch(Exception e){ 
            e.getMessage();
        }
        
        return Array_F;
    }
    public ArrayList<Tarefa> GetDataTarefas()throws ErroNoFile{
        ArrayList<Tarefa> Array_T = new ArrayList<>();
        int idTarefa;
        int nivel;
        int horasNecessarias;
        boolean statusTarefa;
        Calendar dataInicio;
        Calendar dataFinal;
        String temp;

        try{
            OpenFile();
        }catch (ErroNoFile e){
            e.CorrigeErro();
        }
        
        try{
            while(scan.hasNext()){
                dataInicio = Calendar.getInstance();
                dataFinal = Calendar.getInstance();

                idTarefa = scan.nextInt();
                nivel = scan.nextInt();
                horasNecessarias = scan.nextInt();
                statusTarefa = scan.nextBoolean();
                scan.nextLine();
                temp = scan.nextLine();

                if(temp.equals("x") == true) dataInicio = null;
                else{dataInicio.setTimeInMillis(Long.parseLong(temp));}

                temp = scan.nextLine();

                if(temp.equals("x") == true) dataFinal = null;
                else{dataFinal.setTimeInMillis(Long.parseLong(temp));}

                Array_T.add(new Tarefa(idTarefa, nivel, horasNecessarias, statusTarefa, dataInicio, dataFinal));
            }
            scan.close();
        }catch(Exception e){ 
            e.getMessage();
        }
        
        return Array_T;
    }
    
    public void SetDataGerente(ArrayList<Gerente>Array_G){ //grava arquivo do gerente
        try{
            PrintWriter Wfile = new PrintWriter(this.file);
                for (Gerente gerente : Array_G) {   
                    Wfile.println(gerente.toString());
                }
                    
                
            Wfile.close();
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void SetDataFuncionario(ArrayList<Funcionario>Array_F){ //grava arquivo do funcionario
        try{
            PrintWriter Wfile = new PrintWriter(this.file);
                for (Funcionario funcionario : Array_F) {
                    
                    Wfile.println(funcionario.toString());
                }
                    
                
            Wfile.close();
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void SetDataTarefa(ArrayList<Tarefa>Array_T){ // grava arquivo das tarefas
        try{
            PrintWriter Wfile = new PrintWriter(this.file);
                for (Tarefa tarefas : Array_T) {
                    
                    Wfile.println(tarefas.toString());
                }
                    
                
            Wfile.close();
        }catch(Exception e){
            e.getMessage();
        }
    }

}