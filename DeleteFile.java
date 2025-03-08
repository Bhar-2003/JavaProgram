import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("New2.txt");
        if(file.delete()){
            System.out.println("File "+file.getName()+" has been deleted Successfully");
        }
        else {
            System.out.println("failed to delete a File ");
        }
    }
}
