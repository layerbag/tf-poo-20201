public class Data {

    private File file;

    public Data(File file){
        this.file = file;
    }

    public String GetDate(){
        //cria arquivo
        try {
            System.out.println(("SAVE.txt criated? " + file.createNewFile()));
        //se ja exite
        }catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    public void SetData(){

    }

}
