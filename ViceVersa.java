import java.util.Scanner;

public class ViceVersa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str1=sc.nextLine();
        String str2="";
        for (int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if (Character.isUpperCase(ch))
                str2+=Character.toLowerCase(ch);
            else
                str2+=Character.toUpperCase(ch);
        }
        System.out.println("Original String : "+str1);
        System.out.println("Edited String : "+str2);
    }
}
