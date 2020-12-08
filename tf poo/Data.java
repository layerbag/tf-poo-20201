import java.util.ArrayList;
import java.util.Scanner;

public class Data {

    private File file;

    public Data(File file){
        this.file = file;
    }

    public String GetDate(){
        //ler arquivo
        try {
            Scanner scan = new Scanner(this.file);

            //System.out.println(("SAVE.txt criated? " + file.createNewFile()));
        //rxceção
        }catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    public ArrayList<gerente> legerente(){
        Gerente g;
        ArrayList<Gerente> gerentes = new Arraylist<>();
    
        //le o arquivos, e separar os dados;
        gerentes.add(new Gerente(cpf, nome, idade, salario, senhaGerente, areaSupervisao));

        return gerentes;
    }

}
