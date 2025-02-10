import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int reminder,sum=0;
        int number=num;
        while(number>9)
        {
            while(number>0)
            {
                reminder=number%10;
                sum+=reminder;
                number/=10;
            }
            number=sum;
            sum=0;
        }
        if(number==1)
        {
            System.out.println("The given "+num+" is a Magic Number ");
        }
        else {
            System.out.println("The given "+num+" is not a Magic Number ");
        }
    }
}
