import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String data="I am a Student ";
        try {
            FileWriter output = new FileWriter("New.txt");
//            FileWriter output = new FileWriter("New.txt",true); //this true will indicate that you can append
            output.write(data);
            System.out.println("data is written successfully.");
            output.close();
        } catch (IOException e) {
            System.out.println("Error handeled");
        }
    }
}
