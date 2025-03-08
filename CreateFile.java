import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
//        File file=new File("New.txt");
        File file=new File("C:\\Users\\DELL-E7470\\Project_Java\\one.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File is Not created");
            }
        }
        catch (IOException e){
            System.out.println("Error Handled");
        }
    }
}
