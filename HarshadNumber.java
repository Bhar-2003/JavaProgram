import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Harshad Number or Niven NUmber
        // A positive Number that is divisible by sum of its NUmber
        //
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int temp=num;
        int reminder=0;
        int sum=0;
        while(num>0)
        {
             reminder=num%10;
             sum+=reminder;
             num/=10;
        }
        if(temp%sum==0) {
            System.out.println("The given "+temp+" is an Harshad Number");
        }
        else {
            System.out.println("The given "+temp+" is not  an Harshad Number");
        }
    }
}
