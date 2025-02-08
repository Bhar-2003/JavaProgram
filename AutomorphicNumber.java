import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Automorphic Number
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        int sqr = num * num;
        int count = 0;
        int temp = num;
        while (num > 0) {
            num /= 10;
            count++;
        }
        int  reverse= (int) (sqr%(Math.pow(10, count)));
        if (temp == reverse) {
            System.out.println("The given " + temp + " is an Automorphic Number");
        } else {
            System.out.println("The given " + temp + " is not an Automorphic Number");
        }
    }
}