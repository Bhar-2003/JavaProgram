import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        //Factorial of a Number
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if (num == 0||num==1) {
            System.out.println(1);
            return;
        }
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
