import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Palindrome Number
        int number=sc.nextInt();
        int temp=number;
        int reverse=0;
        while(number>0)
        {
            int reminder=number%10;
            reverse=(reverse*10)+reminder;
            number/=10;
        }
        if(temp==reverse)
        {
            System.out.println("The given "+temp+" is a palindrome number");
        }
        else {
            System.out.println("The given "+temp+" is not a palindrome number");
        }
    }
}
