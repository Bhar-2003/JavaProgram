import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        //Fibonacci Series till the given Number
        Scanner sc=new Scanner(System.in);
        int num1=0;
        int num2=1;
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.print(num1+" "+num2);
        for (int i=3;i<=n;i++) {
            int num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
