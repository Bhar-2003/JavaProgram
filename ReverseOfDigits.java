import java.util.Scanner;
public class ReverseOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Reverse the set of Digits
        System.out.println("Enter the Digits :");
        int digit=sc.nextInt();
        int reverse=0;
        while(digit>0)
        {
            int reminder=digit%10;
            reverse=(reverse*10)+reminder;
            digit/=10;
        }
        System.out.println("Reverse of the given Number is :"+reverse);
    }
}
