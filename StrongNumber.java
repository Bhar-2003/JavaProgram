import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        // A "strong number" is a positive integer where the
        // sum of the factorials of its digits equals the original number itself
        // 145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int temp=num,sum=0;
        while(num>0)
        {
            int reminder=num%10;
            int fact=1;//again initialization for 15 th line step
            for(int i=1;i<=reminder;i++)
            {
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }

        if(temp==sum)
        {
            System.out.println("The given "+temp+" is an Strong Number.");
        }
        else
        {
            System.out.println("The given "+temp+" is not an Strong Number.");
        }
    }
}
