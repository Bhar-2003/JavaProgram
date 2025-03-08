import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        char[] data =new char[15];
        try {
            FileReader input = new FileReader("New.txt");
            input.read(data);
            System.out.println("data has been Read");
            System.out.println(data);
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound handled");
        } catch (IOException e) {
            System.out.println("IOException handled");
        }

    }
}
