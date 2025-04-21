import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String original_String=sc.nextLine();
        String reverse_String="";
        for(int i=original_String.length()-1;i>=0;i--)
            reverse_String += original_String.charAt(i);
        System.out.println("Original String : "+original_String);
        System.out.println("Reversed String : "+reverse_String);
    }

}
