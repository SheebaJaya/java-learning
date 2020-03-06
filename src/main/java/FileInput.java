import java.io.File;
import java.io.FileInputStream;

public class FileInput {
    public static void main(String[] args) {
        try{
            File f = new File("src/resources/testouput.txt");
            FileInputStream fs = new FileInputStream(f);
            int i = 0;
            while((i=fs.read())!=-1){
                System.out.print((char)i);

            }
            fs.close();

        }catch(Exception e){
            System.out.println(e.getCause());
        }
    }
}
