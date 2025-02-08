import java.util.Scanner;

public class PoductofDigits {
    public static void main(String[] args) {
        //Product of set of input digit
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digits :");
        int digits=sc.nextInt();
        int product=1;
        while(digits>0)
        {
            int reminder=digits%10;
            product*=reminder;
            digits/=10;
        }
        System.out.println("Sum of the Digits are :"+product);
    }
}
