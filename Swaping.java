import java.util.Scanner;
public class Swaping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Swapping of two numbers With the Help of Third Variable
        System.out.println("Enter the Number 1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the Number 2 :");
        int num2=sc.nextInt();
        int num3;
        num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("The num1 is swapped to "+num1);
        System.out.println("The num1 is swapped to "+num2);

    }
}