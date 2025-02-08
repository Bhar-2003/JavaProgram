import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //To find The Amstrong Number
        System.out.println("Enter the Digit");
        int digit=sc.nextInt();
        int temp=digit;
        int sum=0;
        int count=0;
        while(digit>0) {
            count++;
            digit /= 10;
        }
        digit=temp;//this is to re-assign that digit becomes 0
        while(digit>0)
        {
            int reminder=digit%10;
            sum=sum+(int)(Math.pow(reminder,count));
            digit/=10;
        }
        System.out.println(sum);
        if(temp==sum)
        {
            System.out.println("The given Number is a Amstrong Number");
        }
        else
        {
            System.out.println("The given number is not a Amstrong Number");
        }

    }
}
