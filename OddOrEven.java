import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        //To check whether the given Number is Odd or Even
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The given Number "+num+" is a Even Number");
        }
        else
        {
            System.out.println("The given Number "+num+" is a Odd Number");
        }
    }
}
