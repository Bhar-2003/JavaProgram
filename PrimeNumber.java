import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //wheter the given Number is Prime Number
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        if(num==1)
            System.out.println("The number "+num+" is neither prime Number Nor composite Number");
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                System.out.println("The given Number "+num+" is not a Prime Number");
                return;
            }
        }
        System.out.println("The given Number "+num+" is a Prime Number");
    }
}
