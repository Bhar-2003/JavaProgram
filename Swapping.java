import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Swapping of two Numbers without the use of Third Number
        System.out.println("Enter the Number 1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the Number 2 :");
        int num2=sc.nextInt();
        num1=num1+num2;//num1=12+24=36
        num2=num1-num2;//num2=36-24=12
        num1=num1-num2;//num1=36-12=24
        System.out.println("The number after swap "+num1);
        System.out.println("The number after swap "+num2);

    }
}
