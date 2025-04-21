import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String original_String=sc.nextLine();
        int flag=0;
        for (int i=0;i<original_String.length()/2;i++){
            if(original_String.toLowerCase().charAt(i)!=original_String.toLowerCase().charAt(original_String.length()-1-i))
                flag=1;
        }
        if (flag==0){
            System.out.println("The given String is Palindrome ");
        }
        else
            System.out.println("The given String is not a Palindrome ");
    }
}
