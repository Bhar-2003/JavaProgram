import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String input=sc.nextLine();
        int sum=0;
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isDigit(ch)){
                sum+=Character.getNumericValue(ch);
            }
        }
        System.out.println("Sum : "+sum);
    }
}
