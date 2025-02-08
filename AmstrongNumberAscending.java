import java.util.Scanner;
public class AmstrongNumberAscending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Amstrong number between the Range with in terms of Ascending Order
        System.out.println("Enter the Lower Limit :");
        int lower_limit=sc.nextInt();
        System.out.println("Enter the Upper Limit :");
        int upper_limit=sc.nextInt();
        for(int i = lower_limit; i<=upper_limit; i++)
        {
            int n=i;
            int temp=n;
            int count=0;
            int sum=0;
            while(n>0)
            {
                count++;
                n/=10;
            }
            n=temp;
            while(n>0)
            {
                int reminder=n%10;
                sum+=(int)Math.pow(reminder,count);
                n/=10;
            }
            if(temp==sum)
            {
                System.out.println("The "+temp+" is an Amstrong Number");
            }
        }
    }
}
