package Maven;

import java.io.*;
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
        String salario;     // PASSAMOS HORAS, TENTANDO RESOLVER PQ O PROGRAMA FUNCIONAVA NO PC DO GABRIEL E NOS DEMAIS NÃO, NO FINAL DESCOBRIMOS QUE ERA PROBLEMA DE COMPATIBILIDADE DE LINGUAGEM DO WINDOWS
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
               scan.nextLine();
               salario = scan.nextLine();
               salario = salario.replaceAll(",", ".");
               senhaGerente = scan.nextLine();
               areaSupervisao = scan.nextLine();
               Double temp = Double.parseDouble(salario);
               Array_G.add(new Gerente(cpf, nome, idade,temp, senhaGerente, areaSupervisao));
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
        String salario;
        int nivel;
        int horasExtras;
        Tarefa tarefa;
        String temp;
        Calendar horaEntrada;
        boolean naEmpresa;
        String area;

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
               scan.nextLine();
               salario = scan.nextLine();
               salario = salario.replace(",",".");
               nivel = scan.nextInt();
               horasExtras = scan.nextInt();
               scan.nextLine();
               temp = scan.nextLine();
                if(temp.equals("x") == false){
                    for (Tarefa tarefa_2 : tarefas) {
                        if(tarefa_2.getIdTarefa() == Integer.parseInt(temp)){ 
                            tarefa = tarefa_2;
                            tarefas.remove(tarefa);
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
                area = scan.nextLine();
                Array_F.add(new Funcionario(cpf, nome, idade,  Double.parseDouble(salario), nivel, horasExtras, tarefa, horaEntrada, naEmpresa,area));
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
        String temp,nome,instrucao;

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

                nome = scan.nextLine();
                instrucao = scan.nextLine();

                Array_T.add(new Tarefa(idTarefa, nivel, horasNecessarias, statusTarefa, dataInicio, dataFinal,nome,instrucao));
            }
            scan.close();
        }catch(Exception e){ 
            e.getMessage();
        }
        
        return Array_T;
    }
    
    public void SetDataGerente(ArrayList<Gerente>Array_G) throws ErroNoFile{ //grava arquivo do gerente
        try{
            FileWriter gravar = new FileWriter(file, false);
            PrintWriter Wfile = new PrintWriter(gravar);

            for (Gerente gerente : Array_G) {   
                Wfile.println(gerente.toString());
            }
                    
                
            Wfile.close();
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void SetDataFuncionario(ArrayList<Funcionario>Array_F) throws ErroNoFile{ //grava arquivo do funcionario
        try{
            FileWriter gravar = new FileWriter(file,false);
            PrintWriter Wfile = new PrintWriter(gravar);

            for (Funcionario funcionario : Array_F) {
                    
                    Wfile.println(funcionario.toStringArquivo());
                }
                    
                
            Wfile.close();
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void SetDataTarefa(ArrayList<Tarefa>Array_T) throws ErroNoFile{ // grava arquivo das tarefas
        try{
            FileWriter gravar = new FileWriter(file,false);
            PrintWriter Wfile = new PrintWriter(gravar);
            
            
                for (Tarefa tarefas : Array_T) {
                    
                    Wfile.println(tarefas.toStringArquivo());
                }
                    
                
            Wfile.close();
        }catch(Exception e){
            e.getMessage();
        }
    }

    // separa os funcionarios por area e adiciona-os ao array de funcionarios do gerente
    public static void classificaFuncionario (ArrayList<Gerente> gerentes, ArrayList<Funcionario> funcionarios){ 
        for (Gerente gerente : gerentes) {
            for (Funcionario funcionario : funcionarios) {
                if(funcionario.getArea().equals(gerente.getAreaSupervisao()) == true){
                    gerente.cadastraFuncionario(funcionario);
                }
            }
        }
    }

    //retorna um array de funcionarios contendo todos os funcionarios
    public static ArrayList<Funcionario> juntaFuncionarios(ArrayList<Gerente> gerentes){   
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        for (Gerente gerente : gerentes) {
            funcionarios.addAll(gerente.getArrayList());
        }

        return funcionarios;
    }

    public static ArrayList<Tarefa> juntaTarefas(ArrayList<Funcionario> funcionarios){
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getTarefa() != null){
                tarefas.add(funcionario.getTarefa());
            }
        }

        return tarefas;
    }

    public static ArrayList<Tarefa> retornaTarefasConcluidas (ArrayList<Tarefa> tarefas){
        ArrayList<Tarefa> tarefasC = new ArrayList<Tarefa>();

        for (Tarefa tarefa : tarefas) {
            if(tarefa.getStatusTarefa()) tarefasC.add(tarefa);
        }

        return tarefasC;
    }

    
}