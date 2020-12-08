import java.io.File;

public class ErroNoFile extends Exception {
    File file;
    
    public ErroNoFile(File file){
        this.file = file;
    }

    public void CorrigeErro(){
        System.out.println("criando arquivo...");
    }

    
}
