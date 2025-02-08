import java.util.Scanner;
public class SumOfDigits
{
    public static void main(String[] args) {
        //Sum of set of Input Digits
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digits :");
        int digits=sc.nextInt();
        int sum=0;
        while(digits>0)
        {
            int reminder=digits%10;
            sum+=reminder;
            digits/=10;
        }
        System.out.println("Sum of the Digits are :"+sum);
    }
}
