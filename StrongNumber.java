import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Strong Number
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int temp=num,sum=0;
        while(num>0)
        {
            int reminder=num%10;
            int fact=1;//again initialization for 15 step
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
