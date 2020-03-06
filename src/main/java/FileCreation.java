import java.io.FileOutputStream;

public class FileCreation {

    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("/Users/sheeba/git/java-learning/src/resources/testouput.txt");
            String s = "Welcome to Java world";
            byte bytes[]= s.getBytes();
            fs.write(bytes);
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}
