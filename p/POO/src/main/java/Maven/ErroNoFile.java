package Maven;

import java.io.File;
import java.io.IOException;


public class ErroNoFile extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    File file;
    
    public ErroNoFile(File file){
        this.file = file;
    }

    public void CorrigeErro(){
        try {
            file.createNewFile();
            
        } catch (IOException e) {
            e.getMessage();
        }
        
        
    }

    
}
