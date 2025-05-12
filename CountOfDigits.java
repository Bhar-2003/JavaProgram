import java.util.Scanner;
public class CountOfDigits {
    public static void main(String []args){
        //Display the count of n th digits
        Scanner sc=new Scanner(System.in);
        //display the count of n th digit
        System.out.println("Enter the Digits");
        int digit=sc.nextInt();
        int count=0;
        while(digit>0)
        {
            digit/=10;
            count++;
        }
        System.out.println("The Count of digits is :"+count);
    }
}
