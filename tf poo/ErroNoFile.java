import java.io.File;
import java.io.IOException;


public class ErroNoFile extends Exception {
    File file;
    
    public ErroNoFile(File file){
        this.file = file;
    }

    public void CorrigeErro(){
        try {
            System.out.println("criando arquivo...");
            file.createNewFile();
            
        } catch (IOException e) {
            e.getMessage();
        }
        
        
    }

    
}
